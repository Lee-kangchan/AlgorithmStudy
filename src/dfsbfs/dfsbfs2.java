package dfsbfs;

//네트워크
public class dfsbfs2 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] bool = new boolean[n];
        for(int i = 0 ; i < computers.length; i++){
            if(!bool[i]){
                solve(computers, i, bool);
                answer++;
            }
        }

        return  answer;
    }
    public boolean[] solve(int[][] computers, int i, boolean[] check){
        check[i] = true;

        for(int j = 0 ; j< computers.length; j++ ){
            if(i != j && computers[i][j] == 1 && check[j] == false){
                check = solve(computers, j, check);
            }
        }
        return check;
    }

    public static void main(String[] args) {
        dfsbfs2 dfsbfs2 = new dfsbfs2();
        System.out.println(dfsbfs2.solution(3, new int[][]{{1,1,0},{1,1,0},{0,0,1}}));
        System.out.println(dfsbfs2.solution(3, new int[][]{{1,1,0},{1,1,1},{0,1,1}}));
    }
}
