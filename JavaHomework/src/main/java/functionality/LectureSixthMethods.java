package functionality;

import java.text.SimpleDateFormat;
import java.util.*;

public class LectureSixthMethods {
    public static int findMin(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }

    public static List<String> returnEvenWords(String string) {
        String[] stringArr = string.split(" ");
        List<String> returnList = new ArrayList<>();
        for (int i = 1; i<stringArr.length; i += 2){
            returnList.add(stringArr[i]);
        }
        return returnList;
    }

    public static List<String> stringToList(String string){
        return Arrays.asList(string.split(" "));
    }

    public static int stringListSize(List<String> listOfStrings){
        return listOfStrings.size();
    }

    public static List<String> calculateROI(double initialInvestment, double interestPercent, int numberOfYears){
        List<String> returnList = new ArrayList<>();
        for (int i = 0; i<numberOfYears;i++){
            initialInvestment *= (1 + interestPercent/100);
            returnList.add(String.format("Year %d: %.2f",(i+1), initialInvestment));
        }
        return returnList;
    }

    public static boolean isLeapYear(int year){
        return (year%400 == 0 || (year%4 == 0 && year%100 != 0));
    }

    public static boolean isValidPassword(String password){
        return password.matches("\\A(?=\\w{8,16}\\z)" + //dyljina mejdu 8 i 16
                "(?=[^a-z]*[a-z])" + //sydyrja pone 1 malka bukwa
                "(?=[^A-Z]*[A-Z])" + //sydyrja pone 1 glavna bukva
                "(?=[^0-9]*[0-9]{2}).*"); //sydyrja pone 1 cifra
    }

    public static String monthName(int number){
        if (number < 1 || number > 12){
            return "Invalid month number";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, (number - 1));
        return dateFormat.format(cal.getTime());
    }
}
