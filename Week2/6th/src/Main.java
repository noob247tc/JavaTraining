import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        boolean isHeads;


        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("Yes, it is head");
        }
        else{
            System.out.println("No, it is not");
        }



    }
}
