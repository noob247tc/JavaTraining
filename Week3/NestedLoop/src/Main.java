import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int column;
        int row;
        char symbol;

        System.out.print("Enter # of column: ");
        column = scanner.nextInt();

        System.out.print("Enter # of row: ");
        row = scanner.nextInt();

        System.out.print("Enter # of symbol: ");
        symbol = scanner.next().charAt(0);

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(symbol + " ");

            }
            System.out.println();


        }
    }
}