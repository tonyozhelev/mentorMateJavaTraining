package lectureSixth;

import functionality.LectureSixthMethods;
import org.testng.annotations.Test;

import java.util.List;

public class LectureSixthTests {
    @Test
    public void lec6test1(){
        System.out.println(LectureSixthMethods.findMin(1,2,3));
    }

    @Test
    public void lec6test2(){
        System.out.println(LectureSixthMethods.returnEvenWords("I love writing methods so much."));
    }

    @Test
    public void lec6test3(){
        List stringList = LectureSixthMethods.stringToList("Did I tell you how much I love writing methods.");
        System.out.println(LectureSixthMethods.stringListSize(stringList));
    }

    @Test
    public void lec6test4(){
        System.out.println(LectureSixthMethods.calculateROI(10000, 5, 10));
    }

    @Test
    public void lec6test5(){
        System.out.println(LectureSixthMethods.isLeapYear(2008));
        System.out.println(LectureSixthMethods.isLeapYear(2007));
        System.out.println(LectureSixthMethods.isLeapYear(1900));
    }

    @Test
    public void lec6test6(){
        System.out.println(LectureSixthMethods.isValidPassword("ASDFasdf1234"));
        System.out.println(LectureSixthMethods.isValidPassword("ASDFasdf1234asdfADSF"));
        System.out.println(LectureSixthMethods.isValidPassword("1234567890"));
        System.out.println(LectureSixthMethods.isValidPassword("aaaaaaaaaA"));
    }

    @Test
    public void lec6test7(){
        System.out.println(LectureSixthMethods.monthName(6));
        System.out.println(LectureSixthMethods.monthName(12));
        System.out.println(LectureSixthMethods.monthName(154));
    }
}
