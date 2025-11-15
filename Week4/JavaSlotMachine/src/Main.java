import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int bet;
        int balance = 100;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("**************************");
        System.out.println("Welcome to JavaSlotMachine");
        System.out.println("**************************");

        while(balance > 0){
            System.out.printf("Current Balance: %d \n", balance);
            System.out.print("Place your Bet: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet> balance){
                System.out.println("You dont have a Balance");
                continue;

            }
            else if(bet <=0){
                System.out.println("Place a bet more than 1$");
                continue;
            }
            else{
                balance -= bet;


            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0 ){
                System.out.printf("You won $: %d \n", payout);
                balance += payout;

            }
            else{
                System.out.println("Sorry you lost this round");
            }
            System.out.print("Do you want to play again (yes or no)?: ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("YES")){
                break;
            }
        }
        scanner.close();

    }
    static String[] spinRow(){

        String[] symbols = {"cake","choco","late","pandesal","coke"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];

        }


        return row;
    }
    static void printRow(String[] row){
        System.out.println(" "+ String.join(" | ", row));
    }
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "cake" -> bet * 3;
                case "choco" -> bet * 4;
                case "late" -> bet * 5;
                case "pandesal" -> bet * 10;
                case "coke" -> bet * 20;
                default -> 0;

            };
        }
        else if(row[0].equals(row[1])){
            return switch (row[0]){
                case "cake" -> bet * 2;
                case "choco" -> bet * 3;
                case "late" -> bet * 4;
                case "pandesal" -> bet * 5;
                case "coke" -> bet * 10;
                default -> 0;

            };

        }
        else if(row[1].equals(row[2])){
            return switch (row[1]){
                case "cake" -> bet * 2;
                case "choco" -> bet * 3;
                case "late" -> bet * 4;
                case "pandesal" -> bet * 5;
                case "coke" -> bet * 10;
                default -> 0;

            };

        }
        else if(row[0].equals(row[2])){
            return switch (row[0]){
                case "cake" -> bet * 2;
                case "choco" -> bet * 3;
                case "late" -> bet * 4;
                case "pandesal" -> bet * 5;
                case "coke" -> bet * 10;
                default -> 0;

            };

        }
        return 0;

    }
}
