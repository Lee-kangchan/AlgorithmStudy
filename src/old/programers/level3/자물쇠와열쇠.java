package old.programers.level3;

public class 자물쇠와열쇠 {
    public boolean solution(int[][] key, int[][] lock) {
        boolean answer = true;
        int a = key.length;
        int b = key[0].length;
        int[][] key90 = new int[a][b];
        int[][] key180 = new int[a][b];
        int[][] key270 = new int[a][b];

        for(int i = 0 ; i < a; i++){
            for(int j = 0 ; j < b; j++){
                key180[i][j] = key[a-i-1][b-j-1];
                key90[i][j] = key[j][i];
                key270[i][j] = key[b-j-1][a-i-1];
            }
        }

        return answer;
    }
    public void solve(){

    }

    public static void main(String[] args) {
        자물쇠와열쇠 s = new 자물쇠와열쇠();
        System.out.println(s.solution(new int[][]{{0,0,0},{1,0,0},{0,1,1}},new int[][]{{1,1,1},{1,1,0},{1,0,1}}));
    }
}
