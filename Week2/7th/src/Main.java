import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("type the a: ");
        a = scanner.nextDouble();
        System.out.print("type the b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse is " + c);
        scanner.close();

    }
}

