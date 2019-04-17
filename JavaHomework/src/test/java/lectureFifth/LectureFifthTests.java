package lectureFifth;

import functionality.LectureFifthMethods;
import org.testng.annotations.Test;

import java.util.List;

public class LectureFifthTests {
    @Test
    public void lec6test1(){
        System.out.println(LectureFifthMethods.findMin(1,2,3));
    }

    @Test
    public void lec6test2(){
        System.out.println(LectureFifthMethods.returnEvenWords("I love writing methods so much."));
    }

    @Test
    public void lec6test3(){
        List stringList = LectureFifthMethods.stringToList("Did I tell you how much I love writing methods.");
        System.out.println(LectureFifthMethods.stringListSize(stringList));
    }

    @Test
    public void lec6test4(){
        System.out.println(LectureFifthMethods.calculateROI(10000, 5, 10));
    }

    @Test
    public void lec6test5(){
        System.out.println(LectureFifthMethods.isLeapYear(2008));
        System.out.println(LectureFifthMethods.isLeapYear(2007));
        System.out.println(LectureFifthMethods.isLeapYear(1900));
    }

    @Test
    public void lec6test6(){
        System.out.println(LectureFifthMethods.isValidPassword("ASDFasdf1234"));
        System.out.println(LectureFifthMethods.isValidPassword("ASDFasdf1234asdfADSF"));
        System.out.println(LectureFifthMethods.isValidPassword("1234567890"));
        System.out.println(LectureFifthMethods.isValidPassword("aaaaaaaaaA"));
    }

    @Test
    public void lec6test7(){
        System.out.println(LectureFifthMethods.monthName(6));
        System.out.println(LectureFifthMethods.monthName(12));
        System.out.println(LectureFifthMethods.monthName(154));
    }
}
