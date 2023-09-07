package GSDC_CODES;

public class prog6 
{
    public static void main(String[] args) 
    {
        int[] numbers = {10, 25, 8, 30, 15, 42, 50};

        System.out.println("Numbers divisible by 5:");
        for (int number : numbers) 
        {
            if (number % 5 == 0) 
            {
                System.out.println(number);
            }
        }
    }
}
