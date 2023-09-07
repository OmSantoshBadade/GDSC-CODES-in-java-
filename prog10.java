package GSDC_CODES;

import java.util.Scanner;

public class prog10 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            System.out.println("Digits in reverse order:");

            while (number > 0)
            {
                int digit = number % 10;
                System.out.print(digit + " ");
                number /= 10;
            }
        }

    }
}
