package lectureSecond;

import Enums.NumberNames;
import functionality.Numbers;
import org.testng.annotations.Test;

import java.util.Random;

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
    public void lec2test2(){
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
    public void lec2test3(){
        int a = rand.nextInt(10);
        System.out.println(a);
        System.out.println("The number picked is " + NumberNames.values()[a].toString().toLowerCase());
    }
}
