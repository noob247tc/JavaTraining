import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String[] choices = {"rock", "paper", "scissors"};
            String playerChoice;
            String computerChoice;
            String playAgain = "yes";
            do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice");

            }
            computerChoice = choices[random.nextInt(3)];
            System.out.printf("Computer choice: %s \n", computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");

            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose");
            }
            System.out.print("Would you like to play again (yes/no)?: ");
            playAgain = scanner.nextLine().toLowerCase();

        }while (playAgain.equals("yes"));
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}