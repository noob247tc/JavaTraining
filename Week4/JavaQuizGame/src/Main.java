import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered brain?",
                              "Who am i?",
                              "First programming language?",
                               "Who is my father?"};

        String[][] options ={{"1. Storing files", "2.Directing Internet traffic"},
                             {"1. CPU","2. Hard Drive"},
                             {"1. Justine", "2. Gwapo"},
                             {"1. Javascript", "2. Fortran"},
                             {"1. Rogelio", "2. Justine"}};

        int[] answers = {2, 1, 1, 2, 1};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("Welcome to Java Quiz Game!");
        System.out.println("*************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for(String option: options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess (1/2): ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("Your answer is correct");
                score += 1;
            }
            else{
                System.out.println("Your Answer is Wrong");
            }
        }
        System.out.printf("Your final score is %d ", score);
        scanner.close();
    }
}
