package old.programers.level3;

//동적계획법 -> 등굣길
public class DP3 {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int arr[][] = new int[n][m];

        for(int i[] :puddles){
            arr[i[1]-1][i[0]-1] = -1;
        }
        for(int i = 0 ; i < n; i++){
            if(arr[i][0] == -1){
                break;
            }
            arr[i][0] = 1;
        }
        for(int j=0; j<m ; j++){
            if(arr[0][j] == -1){
                break;
            }
            arr[0][j] = 1;
        }
        for(int i = 1 ; i < n; i ++){
            for(int j = 1 ; j < m ; j ++){
                if(arr[i][j] == -1){
                    continue;
                }
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
                if(arr[i][j-1] == -1){
                    arr[i][j]++;
                }
                if(arr[i-1][j] == -1){
                    arr[i][j]++;
                }
            }
        }

        return arr[n-1][m-1];
    }

    public static void main(String[] args) {
        DP3 dp3 = new DP3();
        System.out.println(dp3.solution(4,3,new int[][]{{2,2}}));
        System.out.println(dp3.solution(3,4 , new int[][]{{2,2}}));
        System.out.println(dp3.solution(7,4, new int[][]{{2,1},{2,2},{2,3},{4,2},{4,3},{4,4},{6,2},{6,3}}));
    }
}
