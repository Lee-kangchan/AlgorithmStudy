package programers.level3;

import java.util.LinkedList;
import java.util.Queue;

public class 합승택시요금 {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 0;
        int result[] = new int[n+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        while(!queue.isEmpty()){
            int data = queue.poll();

            for(int i = 0 ; i < fares.length; i++){
                if(data == fares[i][0]){
                    if(result[fares[i][1]] == 0 || result[fares[i][1]] > result[fares[i][0]] + fares[i][2]){
                        queue.add(fares[i][1]);
                        result[fares[i][1]] = result[fares[i][0]] + fares[i][2];
                    }
                }
                else if(data == fares[i][1]){
                    if(result[fares[i][0]] == 0 || result[fares[i][0]] > result[fares[i][1]] + fares[i][2]){
                        queue.add(fares[i][0]);
                        result[fares[i][0]] = result[fares[i][1]] + fares[i][2];
                    }
                }
            }
        }
        return result[a] + result[b];
    }
}
