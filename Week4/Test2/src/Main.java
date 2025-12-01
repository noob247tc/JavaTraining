import java.util.*;

public class Main {

public static void main(String[] args) {


class Solution{
    String solution (String S){
        int[] occurences = new int[26];
        for(char ch : S.toCharArray()){
            occurences[ch - 'a']++;

        }

        char best_char = 'a';
        int bes_res = 0;
        for(int i = 1; i< 26; i++){
            if(occurences[i] >= bes_res){
                best_char = (char)((int)'a'+ i);
                bes_res = occurences[i];
            }


    }return Character.toString(best_char);
}
    }
    System.out.println();
}
}