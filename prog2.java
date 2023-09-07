package GSDC_CODES;
public class prog2{

    public static void main(String[] args) {
         int prevnum = 0;
         int currnum = 1;

         for (int i = 0; i < 10; i++) {
            
            int sum = prevnum + currnum;

            System.out.println("Sum of " +prevnum+ " and " +currnum+ " is " +sum);

            prevnum = currnum;
            currnum = sum;
         }
    }
}

