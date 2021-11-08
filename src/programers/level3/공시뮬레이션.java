package programers.level3;

public class 공시뮬레이션 {
    public long solution(int n, int m, int x, int y, int[][] queries) {
        long answer = -1;
        int[][] mab = new int[n][m];
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ; j++){
                mab[i][j] = 1;
            }
        }
        for(int i = 0 ; i < queries.length; i++){
            mab = query(mab, queries[i][0], queries[i][1]);

            System.out.println("_____________________");
            for(int j =0 ; j < mab.length;j++){
                for(int k =0  ; k < mab[0].length; k++){
                    System.out.print(mab[j][k]+ " ");
                }
                System.out.println();
            }

            System.out.println("_____________________");
        }
        return mab[x][y];
    }

    // 0 왼쪽 1 오른쪽 2 위로 3 아래로
    public int[][] query(int[][] mab, int method, int count){
        if(method ==0){
            for(int i = 0 ; i < mab.length; i++){
                for(int j = 1 ; j < mab[0].length; j++){
                    int move = j-count >= 0 ? j-count : 0;
                    mab[i][move] += mab[i][j];
                    mab[i][j] = 0;
                }
            }
        }
        else if(method ==1){
            for(int i = 0 ; i < mab.length; i++){
                for(int j = mab[0].length-2 ; j >= 0 ; j--){
                    int move = j+count <= mab[0].length-1 ? j+count : mab[0].length-1;
                    mab[i][move] += mab[i][j];
                    mab[i][j] = 0;
                }
            }
        }
        else if(method == 2){
            for(int i = 1 ; i < mab.length; i++){
                for(int j = 0 ; j < mab[0].length; j++){
                    int move = i-count >= 0 ? i-count : 0;
                    mab[move][j] += mab[i][j];
                    mab[i][j] = 0;
                }
            }
        }
        else if(method ==3){
            for(int i = mab.length-2 ; i >= 0; i--){
                for(int j = 0 ; j < mab[0].length; j++){
                    int move = i+count <= mab.length-1 ? i+count : mab.length-1;
                    mab[move][j] += mab[i][j];
                    mab[i][j] = 0;
                }
            }
        }
        return mab;
    }

    public static void main(String[] args) {
        공시뮬레이션 s = new 공시뮬레이션();
//        System.out.println(s.solution(2,2,0,0, new int[][]{{2,1},{0,1},{1,1},{0,1},{2,1}}));
        System.out.println(s.solution(2,5,0,1, new int[][]{{3,1},{2,2},{1,1},{2,3},{0,1},{2,1}}));
    }
}
