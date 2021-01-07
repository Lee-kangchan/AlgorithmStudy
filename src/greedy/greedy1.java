package greedy;

import java.util.ArrayList;

//체육복
public class greedy1 {
    public int solution(int n, int[] lost, int[] reserve) {

        int answer = n;

        for(int i=0; i < lost.length; i++){
            for(int j = 0 ; j<reserve.length ; j++){
                if(lost[i] == reserve[j]){
                    reserve[j] = -5;
                    lost[i] = -10;
                    break;
                }
            }
        }

        for(int i = 0 ; i< lost.length; i++){

            for(int j = 0 ; j< reserve.length;j ++){
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j] ){
                    reserve[j] = -5;
                    lost[i] = -10;
                    break;
                }
            }
            if(lost[i] != -10){
                answer = answer - 1;

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        greedy1 greedy1 = new greedy1();

        System.out.println(greedy1.solution(	5, new int[]{1,2,4, 5}, new int[]{2,3,4}));
    }
}
