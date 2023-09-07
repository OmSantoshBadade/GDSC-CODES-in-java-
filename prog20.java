package GSDC_CODES;

import java.util.Scanner;

public class prog20 {
    public static String reverse(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversedString = reverse(input);

        System.out.println("Reversed string: " + reversedString);

        sc.close();
    }
}
