import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 0; i< max; i++){
            System.out.println(i);

        }

       scanner.close();
  */
        for(int i= 0; i < 10; i++){
            if(i ==5){
                break; // continue = skip :), break = stop :)
            }
            System.out.print(i + " ");

        }
    }



}
