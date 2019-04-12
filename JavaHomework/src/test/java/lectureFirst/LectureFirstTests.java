package lectureFirst;

import org.testng.annotations.Test;

public class LectureFirstTests {
    @Test
    public void Test1() {
        char firstLetter = 0x0054;
        char secondLetter = 0x006f;
        char thirdLetter = 0x006e;
        char fourthLetter = 0x0079;
        char fifthLetter = 0x006f;
        char[] name = new char[]{firstLetter, secondLetter, thirdLetter, fourthLetter, fifthLetter};
        System.out.print(new String(name));
    }
}
