package GSDC_CODES;

import java.util.Scanner;

public class prog15 
{

    public static void printFibonacciSequence(int numTerms) {
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 0; i < numTerms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int numTerms = sc.nextInt();

        System.out.println("Fibonacci sequence up to " + numTerms + " terms:");
        printFibonacciSequence(numTerms);
    }
}
