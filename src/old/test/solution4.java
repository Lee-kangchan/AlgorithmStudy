package old.test;

import java.util.ArrayList;
import java.util.Collections;

public class solution4 {

    public String solution(int m, int n, String[] board) { //m 세로 n가로 갯수
        String answer = "";
        solve(board);
        Collections.sort(s);
        for(String t: s){
            answer+=t;
        }
        return answer;
    }
    ArrayList<String> s  = new ArrayList<>();
    int x[] = new int[]{1,0,-1,0};
    int y[] = new int[]{0,-1,0,1};
    boolean check = true;
    public void solve(String[] board){
        while(check) {
            check = false;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length(); j++) {
                    for(int k = 0 ; k < 4; k++){
                        if (j + x[k] >= 0 && j + x[k] < board[0].length() && i + y[k] >= 0 && i + y[k] <board.length) {
                            if (board[i+y[k]].charAt(j+x[k]) == '*') {
                                bool = new boolean[board.length][board[0].length()];
                                dfs(board, board[i].charAt(j), i, j, i+ y[k] , j + x[k], i);
                            } else {
                                if(board[i].charAt(j) == board[i+y[k]].charAt(j+x[k])){
                                    check = true;
                                    s.add(board[i].charAt(j)+"");
                                    board[i] =  board[i].replace(board[i].charAt(j)+"", "*");
                                    board[i+y[k]] =  board[i+y[k]].replace(board[i+y[k]].charAt(j)+"", "*");

                                    for(int z = 0 ; z < board.length ; z++){
                                        System.out.println(board[z]);
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    boolean bool[][];
    public void dfs(String board[], char data, int prev_i, int prev_j, int move_i , int move_j, int first_y){
        bool[prev_i][prev_j] = true;
        bool[move_i][move_j] = true;

        for(int k = 0 ; k < 4; k++){
            if (move_j + x[k] >= 0 && move_j + x[k] < board[0].length() && move_i + y[k] >= 0 && move_i + y[k] <board.length) {
                if (!bool[move_i + y[k]][move_j+ x[k]] && (prev_i != move_i + y[k] || prev_j != move_j + x[k])) {
                    if (board[move_i+y[k]].charAt(move_j+x[k]) == '*') {
                        dfs(board, data, move_i, move_j, move_i+ y[k] , move_j + x[k], first_y);
                    }
                    else if(data == board[move_i+y[k]].charAt(move_j+x[k])){
                        check = true;
                        s.add(data+"");
                        board[move_i+y[k]] =  board[move_i+y[k]].replace(data+"" , "*");
                        board[first_y] =  board[first_y].replace(data+"" , "*");

                        for(int i = 0 ; i < board.length ; i++){
                            System.out.println(board[i]);
                        }
                        System.out.println();
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        solution4 solution4 = new solution4();
        System.out.println(solution4.solution(3,3,new String[]{"DBA", "C*A", "CDB"}));
    }
}
