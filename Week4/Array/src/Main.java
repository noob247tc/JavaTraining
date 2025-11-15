import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*String[] fruits = {"apple", "orange", "banana", "coconut"};

        //Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);

        }
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("What # of food do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }


        for(String food : foods){
            System.out.println(food);
        }
        scanner.close();
        */

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        String[] fruits = {"apple", "orange", "banana"};
        String target;
        boolean isFound = false;

        System.out.print("Enter the fruit to find the index: ");
        target = scanner.nextLine();



        for(int i= 0; i <  fruits.length; i ++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;

            }
        }
        if(!isFound){
            System.out.println("Not Found");

        }
        scanner.close();
    }
}
