package lectureThird;

import functionality.StringFunctionality;
import org.testng.annotations.Test;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

    @Test
    public void lec3test6(){
        for (int i = 1  ; i<=100; i++){
            System.out.println(String.format("your.name+%03d@mentormate.com",i));
        }
    }

    @Test
    public void lec3test7(){
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        Calendar cal = Calendar.getInstance();
        System.out.println(String.format("your.name+%s@mentormate.com",dateFormat.format(cal.getTime())));
    }

    @Test
    public void lec3test8(){
        String stringToCheck = "aaabbbccddeeeeefghi";
        System.out.println(StringFunctionality.getRepeatedLetters(stringToCheck));
    }

    @Test
    public void lec3test9(){
        String stringToCheck = "our string %Welcome to mentorm@te1.com";
        System.out.println(StringFunctionality.countLetters(stringToCheck));
    }
}
