package lectureFirst;

import org.testng.annotations.Test;

public class LectureFirstTests {
    @Test
    public void test1() {
        char firstLetterUNI = 0x0054;
        char secondLetterUNI = 0x006f;
        char thirdLetterUNI = 0x006e;
        char fourthLetterUNI = 0x0079;
        char fifthLetterUNI = 0x006f;
        char[] name = new char[]{firstLetterUNI, secondLetterUNI, thirdLetterUNI, fourthLetterUNI, fifthLetterUNI};
        System.out.println(new String(name));
    }

    @Test
    public void test2() {
        //84 111 110 121 111
        char firstLetterASCII = 84;
        char secondLetterASCII = 111;
        char thirdLetterASCII = 110;
        char fourthLetterASCII = 121;
        char fifthLetterASCII = 111;
        char[] name = new char[]{firstLetterASCII, secondLetterASCII, thirdLetterASCII, fourthLetterASCII, fifthLetterASCII};
        System.out.println(new String(name));
    }

    @Test
    public void test3() {
        System.out.println("\\’Hello’\\ to\\\\\\ \"World\" \\’");
    }

    @Test
    public void test4() {
        int minNum = -32768;
        int maxNum = 32768;
        System.out.println(minNum + " " + maxNum);

    }

}
