package lectureFourth;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

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

    @Test
    public void lec4test3(){
        int[][] arr = new int[3][];
        int[] lengthForEachArr = new int[]{9,6,13};
        for (int i = 0; i<arr.length; i++){
            arr[i] = new int[lengthForEachArr[i]];
            for (int j = 0; j<arr[i].length; j++){
                arr[i][j] = j;
            }
        }
        Arrays.stream(arr).forEach(x-> System.out.println(Arrays.toString(x)));
        System.out.println("<--======================================================-->");
        int[][] newArr = arr;
        newArr[2] = null;
        Arrays.stream(newArr).forEach(x-> System.out.println(Arrays.toString(x)));
    }

    @Test
    public void lec4test4(){
        String[] arr = new String[] {"This", "is", "how", "we", "roll", "arrays"};
        List<String> arrToList = Arrays.asList(arr);
        System.out.println(arrToList);
    }


}
