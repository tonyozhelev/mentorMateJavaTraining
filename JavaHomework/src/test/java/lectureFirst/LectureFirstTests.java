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


    //tuk v lekciite ne vidqh aritmetichni operacii obqsneni i prosto si prawq po edna ot wsichki
    @Test
    public void test5() {
        int var1 = 9;
        int var2 = 4;

        int sum = var1 + var2;
        //sbora na dvete promenlivi
        System.out.println(sum);

        int mul = var1 * var2;
        //proizvedenieto
        System.out.println(mul);

        int diff = var1-var2;
        //razlikata
        System.out.println(diff);

        int div = var1/var2;
        //delenieto, no tyj kato sa celi chisla rezultata syshto e cqlata chast ot delenieto zakrygleno nadolu
        System.out.println(div);

        double div2 = (double)var1/var2;
        //ako iskame da poluchim droben rezultat trqbwa da castnem kym double, inache dori i rezultata da e double, 2te chisla kato sa int, pak se poluchava cqlo chislo
        System.out.println(div2);

        int mod = var1%var2;
        //modulno delenie (rezultata e ostatyka ot delenieto na dwete chisla)
        System.out.println(mod);

        //poziciqta na ++(--) operatora, opredelq prioriteta na izpylnenie, ako e pred promenlivata, pyrvo se izpulnqva toj, sled tova vs drugo, ako e sled - toj se izpylnqva posleden
        System.out.println(var1++);
        System.out.println(++var1);
    }
}
