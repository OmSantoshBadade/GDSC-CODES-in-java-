package GSDC_CODES;
import java.util.*;
public class prog5
{
    public static boolean isFirstAndLastSame(int[] numbers) {
        
        if (numbers != null && numbers.length >= 2) {
            
            if (numbers[0] == numbers[numbers.length - 1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] myArray = new int[size];
    
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                myArray[i] = sc.nextInt();
            }
    
            System.out.println("Array elements:");
            for (int i = 0; i < size; i++) {
                System.out.println("Element " + (i + 1) + ": " + myArray[i]);
            }
                System.out.println("Now, Checking If the First and last terms are same");
            boolean result = isFirstAndLastSame(myArray);
        System.out.println(result); 
        }
    }
}