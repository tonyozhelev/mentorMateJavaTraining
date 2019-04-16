package functionality;

import java.util.Arrays;

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
}