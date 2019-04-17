package functionality;

import java.util.*;
import java.util.stream.Collectors;

public class StringFunctionality {

    public static boolean checkIfPalindrome(String stringToCheck) {
        char[] charArr = stringToCheck.toCharArray();
        for (int i = 0; i < charArr.length / 2; i++) {
            if (charArr[i] != charArr[charArr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }


    private static boolean isWord(String stringToCheck) {
        if (stringToCheck.isEmpty()){
            return false;
        }
        //da nqma a-z, A-Z ili 0-9 v stringa, moje i drugi kriterii da se dobavqt
        if (stringToCheck.matches("^[^a-zA-Z0-9]+$")){
            return false;
        }
        return true;
    }

    public static long wordCount(String stringToCheck)
    {
        return Arrays.stream(stringToCheck.split(" "))
                .filter(x -> isWord(x))
                .count();
    }

    public static Map<Character, Integer> countASE(String stringToCheck){
        return  countLetters(stringToCheck).
                entrySet().
                stream().
                filter(x -> x.getKey() == 'a' || x.getKey() == 's' || x.getKey() == 'e').
                collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
    }


    public static String reverseCase(String stringToCheck) {
        String reversed = "";
        for (char charToReverse: stringToCheck.toCharArray()) {
            if (charToReverse >= 'a' && charToReverse <= 'z') {
                reversed += Character.toUpperCase(charToReverse);
            }
            else if (charToReverse >= 'A' && charToReverse <= 'Z'){
                reversed += Character.toLowerCase(charToReverse);
            }
            else{
                reversed += charToReverse;
            }
        }

        return reversed;
    }

    public static List<Character> getRepeatedLetters(String stringToCheck) {
        return countLetters(stringToCheck).
                entrySet().
                stream().
                filter(x -> x.getValue()>=2).
                map(x->x.getKey()).
                collect(Collectors.toList());
    }

    public static Map<Character, Integer> countLetters(String stringToCheck) {
        Map<Character, Integer> symbolCount = new HashMap<>();
        for (char symbol: stringToCheck.toCharArray()){
            if (symbolCount.containsKey(symbol)){
                symbolCount.put(symbol, symbolCount.get(symbol)+1);
            }
            else{
                symbolCount.put(symbol, 1);
            }
        }
        return symbolCount;
    }
}