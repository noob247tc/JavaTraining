import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else if statements
        //                  (Java14 features)
        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("Enter the day of the week: ");
        day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
                    ->System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            case "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.printf("%s is not a day", day);
        }


    }
}
