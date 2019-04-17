package lectureFourth;

import org.testng.annotations.Test;

import java.util.Arrays;

public class LectureFourthTests {
    @Test
    public void lec4test1(){
        int[] arr = new int[]{1788, 2025, 1869, 1456, 2013, 1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
        String[] arrString = Arrays.stream(arr).
                            mapToObj(x->Integer.valueOf(x).toString()).
                            toArray(String[]::new);
        Arrays.sort(arrString);
        System.out.println(Arrays.toString(arrString));
    }

    @Test
    public void lec4test2(){
        int[] arr = new int[]{1788, 2025, 1869, 1456, 2013, 1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
        int sum = 0;
        System.out.println(Arrays.stream(arr).sum());
    }
}
