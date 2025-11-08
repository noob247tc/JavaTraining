

public class Main {
    public static void main(String[] args) {



        int age = 17;
        if(ageCheck(age)){
            System.out.println("You may sign up");

        }
        else{
            System.out.println("you must be 18");
        };
    }
    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;

        }
        else{
            return false;
        }
    }
}
