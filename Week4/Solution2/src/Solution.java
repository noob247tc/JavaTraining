import java.util.Arrays;

class Solution {
    public int solution(int[] A){

        int numberOfMoves = 0;

        for(int i = 0; i < A.length - 1; i++){
            if(A[i] > A[i + 1]){
                numberOfMoves++;
            }

        }
        return numberOfMoves;
    }
}
