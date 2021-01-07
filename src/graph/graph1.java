package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 가장 먼 노드 (프로그래머스)
public class graph1 {
    static int count2 = 1 ;
    public static void main(String[] args) {

    }

    public int solution(int n, int[][] edge){
        int answer = 0;

        int check []  = new int[edge.length];
        boolean bool[][] = new boolean[edge.length][edge.length];

        for(int i = 0 ; i < edge.length; i++){
            bool[edge[i][0]][edge[i][1]] = bool[edge[i][1]][edge[i][0]] = true;

        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        int maximum = 0;
        while(!queue.isEmpty()){
            int num = queue.poll();

            for( int j=2; j<=n; j++){
                if(check[j]==0 && bool[num][j]){
                    check[j] = check[num] + 1;
                    queue.add(j);
                    maximum = Math.max(maximum, check[j]);
                }
            }

        }
        for (int i = 0 ; i< check.length ; i++){
            if( maximum == check[i]){
                answer++;
            }
        }

        return answer;
    }

}
