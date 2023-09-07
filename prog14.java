package GSDC_CODES;

import java.util.Scanner;

public class prog14 
{

    public static long calculateFactorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;
        } 
        else
        {
            long result = 1;
            for (int i = 2; i <= n; i++) 
            {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if (n < 0) 
        {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
        else 
        {
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }
}
    

