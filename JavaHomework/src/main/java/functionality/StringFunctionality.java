package functionality;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        Map<Character, Integer> countLetters = new HashMap<>();
        countLetters.put('a',0);
        countLetters.put('s',0);
        countLetters.put('e',0);
        for (char charToCheck:stringToCheck.toCharArray()) {
            if (countLetters.containsKey(charToCheck)){
                countLetters.put(charToCheck, countLetters.get(charToCheck)+1);
            }
        }
        return countLetters;
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
}