package GSDC_CODES;
import java.util.*;
public class prog3{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner (System.in)) 
        {
            System.out.println("Enter A String !");

            String a = sc.nextLine();

            for (int i = 0; i< a.length(); i++) 
            {
                if (i % 2 == 0)
                {
                    System.out.println("Character at even Index position are:-");
                    char c = a.charAt(i);

                    System.out.println("'" + c + "'"); 
                }
            }

        }
    }
}