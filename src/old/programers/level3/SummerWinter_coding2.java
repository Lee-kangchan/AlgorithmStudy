package old.programers.level3;

import java.util.Arrays;

public class SummerWinter_coding2 {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int count = 0 ;
        for(int i =0  ; i <A.length; i++){
            if(count > A.length-1){
                break;
            }
            while(count <= A.length-1){
                if(A[i] < B[count] ){
                    break;
                }
                count++;
            }
            if(count <= A.length -1){
                if(A[i] < B[count]){
                    answer++;
                    count++;
                }
            }
        }
        return answer;
    }
}
