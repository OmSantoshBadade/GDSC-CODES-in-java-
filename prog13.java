package GSDC_CODES;
import java.util.*;

public class prog13 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner (System.in))
        {

            System.out.println("Enter 1st Number");
            int a = sc.nextInt();
            System.out.println("Enter 2nd Number");
            int b = sc.nextInt();

            int sum = a+b;
            System.out.print("The Sum Is :");
            System.out.println(sum);
        }

        
    }
}
