package old.programers.level3;

import java.util.Arrays;
import java.util.Comparator;

// Greedy 알고리즘 : 단속 카메라
public class Greedy1 {
    public int solution(int[][] routes){
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int answer = 0 ;
        int check = -300000 ;
        for(int i =0 ; i < routes.length; i++) {
           if(check< routes[i][0]){
              check = routes[i][1];
              answer++;
           }
        }
        return answer;
    }

}
