import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;

       do{
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextByte();

        } while(number <1 || number > 10);

        System.out.printf("You picked  %d", number);


        scanner.close();


    }
}
