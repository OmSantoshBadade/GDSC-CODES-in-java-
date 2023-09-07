package GSDC_CODES;

import java.util.Random;
import java.util.Scanner;

public class prog18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
        String userChoice = sc.nextLine().toLowerCase();

        // Validate user input
        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
            sc.close();
            return;
        }

        // Generate computer's choice
        int computerChoice = random.nextInt(3); // 0 for Rock, 1 for Paper, 2 for Scissors

        // Map computer's choice to a string
        String computerChoiceStr;
        switch (computerChoice) {
            case 0:
                computerChoiceStr = "rock";
                break;
            case 1:
                computerChoiceStr = "paper";
                break;
            default:
                computerChoiceStr = "scissors";
                break;
        }

        System.out.println("Computer chose: " + computerChoiceStr);

        // Determine the winner
        if (userChoice.equals(computerChoiceStr)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoiceStr.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoiceStr.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoiceStr.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
