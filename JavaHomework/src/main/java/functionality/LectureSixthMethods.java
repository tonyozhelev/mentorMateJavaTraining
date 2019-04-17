package functionality;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureSixthMethods {
    public int findMin(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }

    public List<String> returnEvenWords(String string) {
        String[] stringArr = string.split(" ");
        List<String> returnList = new ArrayList<>();
        for (int i = 1; i<stringArr.length; i += 2){
            returnList.add(stringArr[i]);
        }
        return returnList;
    }

    public List<String> stringToList(String string){
        return Arrays.asList(string.split(" "));
    }

    public int stringListSize(List<String> listOfStrings){
        return listOfStrings.size();
    }
    
}
