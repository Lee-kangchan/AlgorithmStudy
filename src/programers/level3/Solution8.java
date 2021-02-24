package programers.level3;

import java.util.Arrays;

public class Solution8 {
    public int solution(int n, int[] money) {
        int answer = 0;
        int[][] answer2 = new int[money.length+1][n+1];
        Arrays.sort(answer2);
        answer2[0][0] = 1;

        for(int i = 1 ; i < answer2.length; i++){
            for(int j = 0 ; j < answer2[0].length; j++){
                if(j < money[i-1]){
                    answer2[i][j] = answer2[i-1][j] % 1000000007;
                }else if(j == money[i-1]){
                    answer2[i][j] = answer2[i-1][j] +1 % 1000000007;
                }else {
                    answer2[i][j] = answer2[i-1][j] + answer2[i][j - money[i-1]] % 100000007;
                }
            }
        }
        return answer2[money.length][n];
    }

    public static void main(String[] args) {
    }
}
