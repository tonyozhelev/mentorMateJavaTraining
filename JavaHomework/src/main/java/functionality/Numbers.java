package functionality;

public class Numbers {

    public static boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    public static boolean isPrime(int number)
    {
        for (int i = 2; i<=Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
