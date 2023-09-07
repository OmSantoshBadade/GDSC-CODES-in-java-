package GSDC_CODES;

import java.util.Scanner;

public class prog16
{
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        
        if (number <= 3) {
            return true; 
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }

        return true; 
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
