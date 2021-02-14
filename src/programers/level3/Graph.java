package programers.level3;

// 순위 (다시 하자)
public class Graph {
    public int solution(int n, int[][] results) {
        int answer = 0;
        int check[][] = new int[n][n];
        for(int j = 0 ; j  < n ; j++) {
            for (int i = 0; i < check.length; i++) {
                if (results[i][0] == j){
                    check[j][results[i][1]] = 1;
                }
                else if(results[i][1] == j){
                    check[j][results[i][0]] = -1;
                }
            }
        }
        return answer;
    }
}
