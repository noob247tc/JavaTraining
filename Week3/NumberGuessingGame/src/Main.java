import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min= 1;
        int max= 100;

        int randomNumber = random.nextInt(min,max);



        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d: ", min, max);

        do{
            System.out.print("Enter a number: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too low! Try again");
            }
            else if(guess> randomNumber){
                System.out.println("Too High Try again");
            }
            else{
                System.out.println("Correct");
                System.out.printf("# of attempts %d", attempts);
            }
        }while(guess != randomNumber);


    }
}
