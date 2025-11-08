import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String name = "Password";
/*
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("s");

        name = name.toUpperCase();
        name = name.trim();
        name = name.replace("S", "z");
*/
        /*
        if(name.isEmpty()){
            System.out.println("You don't have a name");
        }
        else{
            System.out.println("You have a name");
        }
        */
        /*
        if(name.contains(" ")){
            System.out.println("Your name contains spaces");
        }
        else{
            System.out.println("Your name doesn't have spaces");

        };

         */
        if(name.equalsIgnoreCase("password")){
            System.out.println("your name can't be password");

        }
        else {
            System.out.printf("Hello %s", name);
        }


    }
}
