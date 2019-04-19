package lectureSecond;

import Enums.NumberNames;
import functionality.Numbers;
import org.testng.annotations.Test;
import java.util.*;

public class LectureSecondTests {
    private Random rand = new Random();

    @Test
    public void lec2test1() {
        int a = rand.nextInt();
        int b = rand.nextInt();

        if (Numbers.isEven(a)) {
            System.out.println("The number " + a + " is even");
        }
        else {
            System.out.println("The number " + a + " is odd");
        }
        if (Numbers.isEven(b)) {
            System.out.println("The number " + b + " is even");
        }
        else {
            System.out.println("The number " + b + " is odd");
        }
        if (Numbers.isEven(a) && Numbers.isEven(b)) {
            System.out.println("Both numbers are even");
        }
        if (!Numbers.isEven(a) && !Numbers.isEven(b)) {
            System.out.println("Both numbers are odd");
        }
    }

    @Test
    public void lec2test2() {
        int a = rand.nextInt(9) + 1;
        int temp = a;
        if (a < 5) {
            a*=10;
        }
        else {
            a*=100;
        }

        System.out.println("Current value of a = " + a);
        if (Numbers.isPrime(temp)) {
            System.out.println("The number " + temp + " is prime.");
        }
        else {
            System.out.println("The number " + temp + " is not prime.");
        }
    }


    @Test
    public void lec2test3() {
        int a = rand.nextInt(10);
        System.out.println(a);
        System.out.println("The number picked is " + NumberNames.values()[a].toString().toLowerCase());
    }

    @Test
    public void lec2test4() {
        //za po-golemi stoinosti stava mn bavno :)
        int a = rand.nextInt(999999);
        int b = rand.nextInt(999999);
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            if (Numbers.isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    @Test
    public void lec2test5() {
        int a = rand.nextInt(10)+1;
        for (int i = 1; i <= a; i++) {
            for (int j = i; j < a+i; j++) {
                System.out.print(String.format("%-3d",j));
            }
            System.out.println();
        }
    }

    @Test
    public void lec2test6() {
        int[] numArr = new int[]{1,2,10,7,5,-6};
        int maxNum = numArr[0];
        for (int i = 1; i < numArr.length; i++){
            if (maxNum < numArr[i]) {
                maxNum = numArr[i];
            }
        }
        int secondMaxNum = numArr[0];
        for (int i = 1; i < numArr.length; i++){
            if (secondMaxNum < numArr[i] && numArr[i] != maxNum) {
                secondMaxNum = numArr[i];
            }
        }
        System.out.println(secondMaxNum);
    }

    @Test
    public void lec2test7() {
        for (int i = 10; i <= 33; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Test
    public void lec2test8() {
        for (int i = 66; i >= 21; i-=4){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 77; i <= 99; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


