package lectureThird;

import bsh.StringUtil;
import functionality.StringFunctionality;
import org.testng.annotations.Test;

import java.sql.Struct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LectureThirdTests {

    @Test
    public void lec3test1(){
        boolean isPalindrome = StringFunctionality.checkIfPalindrome("ASDFDSA");
        System.out.println(isPalindrome);
        isPalindrome = StringFunctionality.checkIfPalindrome("aSDFDSA");
        System.out.println(isPalindrome);
        isPalindrome = StringFunctionality.checkIfPalindrome("asdFFdsa");
        System.out.println(isPalindrome);
    }

    @Test
    public void lec3test2(){
        String stringToCount = "Random   .  gibberish text to use in web pages, site templates and in typography demos.";
        System.out.println(StringFunctionality.wordCount(stringToCount));
        //poredicata ot cifri syshto gi broi za edna duma
        stringToCount = "@!#$@#$This 1345645613232 string /*-+ contains six words.";
        System.out.println(StringFunctionality.wordCount(stringToCount));

    }

    @Test
    public void lec3test3(){
        String stringToCheck = "aaaassssseeehjklhjuihuinjkljjnk";
        System.out.println(StringFunctionality.countASE(stringToCheck));
    }

    @Test
    public void lec3test4(){
        StringBuilder stringToReverse = new StringBuilder("Reverse this string.");
        System.out.println(stringToReverse.reverse());
    }

    @Test
    public void lec3test5(){
        String stringToCheck = "aAbBcCdD1234";
        System.out.println(StringFunctionality.reverseCase(stringToCheck));
    }


}
