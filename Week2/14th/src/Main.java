import java.util.Scanner;
 class Main {
    public static void main(String[] args) {

        //ternary operator
/*
        int score =70;

        String passOrFail = (score >= 60) ? "PASS" :"FAIL";
        System.out.println(passOrFail);

 */
        /*
        int hours = 13;

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";

        System.out.println(timeOfDay);

         */
        Scanner scanner= new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.nextLine().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 /9 : (temp * 9 / 5 )+ 32;
        System.out.printf("%.1f%s",newTemp, unit);



        scanner.close();
    }
}
