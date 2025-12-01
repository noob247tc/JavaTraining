import java.util.*;

class solution {
    String solution(String S) {
        int[] occurences = new int[26];
        for (char ch : S.toCharArray()) {
        occurences[ch -= 'a']++;
        }

        char best_char = 'a';
        int best_res = 0;

        for(int i = 1; i<26; i++){
            if(occurences[i] >= best_res){
                best_char = (char)((int)'a' + i);
                best_res = occurences[i];
            }
        }
        return Character.toString(best_char);
    }
}
