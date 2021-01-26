package programers.level2;

import java.util.Arrays;
import java.util.Date;

// 땅따먹기
public class solution7 {
    int solution(int[][] land) {
        for(int i = 1 ; i < land.length; i++){
            for(int j=0 ; j < land[0].length; j++){
                int sum = 0;
                for(int k=0; k<land[0].length; k++){
                    if(k!=j) {
                        sum = Math.max(sum, land[i-1][k]);
                    }
                }
                land[i][j] += sum;
            }
        }
        Arrays.sort(land[land.length-1]);
        return land[land.length-1][land.length-1];
    }

    public static void main(String[] args) {
        solution7 solution7 = new solution7();
        System.out.println(solution7.solution(new int[][]{{4,3,2,1},{2,2,2,1},{6,6,6,4},{8,7,6,5}}));
    }
}
