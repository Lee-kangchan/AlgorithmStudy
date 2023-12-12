package old.programers.level3;

import java.util.Arrays;

// 순위 (다시 하자)
public class Graph {
    public int solution(int n, int[][] results) {
        int d = 987;
        int answer = 0;
        int check[][] = new int[n+1][n+1];
        int win, lose;

        for(int[] s: check){
            Arrays.fill(s,d);
        }

        for(int i = 0 ; i < check.length; i++){
            check[i][i] = 0;
        }
        for(int[] result: results){
            win = result[0];
            lose = result[1];
            check[win][lose] = 1;
        }
        for(int k=1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(check[i][j]>check[i][k]+check[k][j]){
                        check[i][j]=check[i][k]+check[k][j];
                    }
                }
            }
        }
        boolean[] flag = new boolean[n+1];

        for(int i = 1 ; i <= n ; i++){
            for(int j=1; j<=n ; j++){
                if(i == j) continue;
                if(check[i][j] == d && check[j][i] == d){
                    flag[i] = true;
                    break;
                }
            }
        }

        for(int i=1; i<flag.length; i++){
            System.out.println(flag[i]);
            if(!flag[i]) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        System.out.println(g.solution(5, new int[][]{{4,3},{4,2},{3,2},{1,2},{2,5}}));
    }
}
