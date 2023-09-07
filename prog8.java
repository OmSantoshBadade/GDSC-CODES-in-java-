package GSDC_CODES;
import java.util.*;

public class prog8 {

    public static boolean Palindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int d = number % 10;
            reversedNumber = reversedNumber * 10 + d;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) 
        {
            System.out.println("Enter a number");
            int num = sc.nextInt();

            if(Palindrome(num))
            {
                System.out.println("It is a Palindrome !");
            }
            else{
                System.out.println("It is not a Palindrome");
            }
        }
    }
}
