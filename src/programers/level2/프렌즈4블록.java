package programers.level2;
// 2018_KAKAO_BLIND [1차] 프렌즈 4블록
public class 프렌즈4블록 {
    public int solution(int m, int n, String[] board){
        int answer = 0;

        boolean check = true;
        while(check) {
            check = false;
            boolean[][] board2 = new boolean[m][n];
            for (int i = 0; i < m-1; i++) {
                for (int j = 0; j < n-1; j++) {
                    if(board[i].charAt(j) != '?' && board[i].charAt(j) == board[i+1].charAt(j) && board[i].charAt(j+1) == board[i].charAt(j) && board[i+1].charAt(j+1) == board[i].charAt(j)){
                        board2[i][j] = true;
                        board2[i][j+1] = true;
                        board2[i+1][j] = true;
                        board2[i+1][j+1] = true;
                        check = true;
                    }
                }
            }
            if(!check){
                break;
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(board2[i][j]){
                        board[i] = board[i].substring(0, j) +"?"+ board[i].substring(j+1);

                        answer++;
                    }
                    System.out.print(board[i].charAt(j) + " ");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < m; i++) {
                for (int j = n-1; j >= 0; j--) {
                    if(board[i].charAt(j) == '?'){
                        for(int k = i ; k > 0 ; k--){
                            String a = board[k-1].charAt(j)+"";
                            String b = board[k].charAt(j)+"";
                            board[k] = board[k].substring(0, j) + a+ board[k].substring(j+1);
                            board[k-1] = board[k-1].substring(0, j) + b+ board[k-1].substring(j+1);
                        }
                    }
                }
            }for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i].charAt(j) + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        return answer;
    }

    public static void main(String[] args) {
        프렌즈4블록 kakao = new 프렌즈4블록();
        System.out.println(kakao.solution(4,2,new String[]{"AA","BB","BB","AA"}));
    }
}
