package programers.level3;
//N-Queen
public class Solution2 {
    public int solution(int n) {
        solve(n, new int[n+1][n+1], 1);
        return len;
    }
    int len = 0 ;
    public void solve(int n, int arr[][], int count){
        if(count == n){
            for(int i =1 ; i <= n ; i ++){
                if(arr[count][i] ==0){
                    len++;
                }
            }
            return;
        }
        for(int i = 1 ; i <= n ; i ++){

            if(arr[count][i] == 0){
                int[][] arr2 = new int[n+1][n+1];

                for(int j = 1 ; j <= n ; j ++){
                    for(int k = 1 ; k <=n ; k++){
                        arr2[j][k] += arr[j][k];
                    }
                    arr2[count][j] = 1;
                    arr2[j][i] = 1;
                    if(count - j > 0 && i - j > 0){
                        arr2[count-j][i-j] = 1;
                    }
                    if(count - j > 0 && i + j <= n){
                        arr2[count-j][i+j] = 1;
                    }
                    if(count + j <= n && i- j > 0){
                        arr2[count+j][i-j] = 1;
                    }
                    if(count + j <= n && i+j <= n){
                        arr2[count+j][i+j] = 1;
                    }
                }

                for(int a = 1 ; a<= n ; a++){
                    for(int b = 1 ; b <= n ; b++){
                        System.out.print(arr2[a][b] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println();
                solve(n, arr2, count+1);
            }


        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(4));
    }
}
