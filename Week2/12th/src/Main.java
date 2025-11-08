import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //.substring() = A method used to extract a portion of a string
        //              .substring(start, end);
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;

        System.out.print("Enter your Email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.printf("Your username is %s\n", username);
            System.out.printf("Your domain is %s", domain);
        }
        else{
            System.out.println("Please enter a valid email");
        };



        scanner.close();

    }
}
