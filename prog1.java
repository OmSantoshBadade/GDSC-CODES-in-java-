package GSDC_CODES;
import java.util.*;
public class prog1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter 1st Value");
                int a = sc.nextInt();
                System.out.println("Enter Second Value");
                int b = sc.nextInt();   
                int c = a*b;
                
            if (c <= 1000) {
                System.out.println("The Product Value is " + c);
            }
            else
            {
                System.out.println("Sry the value is Quite BIG");
            }
        }
       
        }
    }

