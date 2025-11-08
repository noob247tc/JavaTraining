import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*
        double temp;
        boolean isSunny = true;

        System.out.print("Enter Temp: ");
        temp = scanner.nextDouble();

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The Weather is good");
            System.out.println("It is sunny outside");

        }
        else if (temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is good");
            System.out.println("It is cloudy outside");
        }
        else if (temp <= 30 && temp <=0 && !isSunny){
            System.out.println("Freezing outside");
        }
        else if (temp >= 30 && temp >=0 && isSunny){
            System.out.println("Super hot outside");

        }

 */
        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length()> 12){
            System.out.println("Username must be between 4-12 characters");

        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain space or underscores");
        } else{
            System.out.printf("Welcome %s", username);
        }

        scanner.close();

    }
}
