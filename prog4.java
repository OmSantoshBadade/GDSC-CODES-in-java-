package GSDC_CODES;
import java.util.*;

public class prog4 {
    public static void main(String[] args) {    
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter a string: ");
            String a = sc.nextLine();

    
            System.out.print("Enter the index 'n' for removal: ");
            int n = sc.nextInt();

            if (n >= 0 && n < a.length()) {
              String result = a.substring(n);

                System.out.println("New string after removal: " + result);
            } else {
                System.out.println("Invalid index 'n'. The index should be between 0 and " + (a.length() - 1));
            }
        }
        
    }
}
