package GSDC_CODES;

import java.util.Scanner;

public class prog17 {
    public static boolean isPalindrome(String input) 
    {

        input = input.replaceAll("\\s", "").toLowerCase();
        
        int left = 0;
        int right = input.length() - 1;

        while (left < right) 
        {
            if (input.charAt(left) != input.charAt(right)) 
            {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
