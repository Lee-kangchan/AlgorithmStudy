package old.programers.level2;

import java.util.LinkedList;
import java.util.Queue;

// 카카오 인턴 : 경주로 인턴
public class 경주로건설 {
    public int solution(int[][] board) {
        int answer = 0;
        int money = 999999999 ;
        int width = board[0].length;
        int height = board.length;
        int xx[] = {-1, 0, 1, 0};
        int yy[] = {0, -1, 0, 1};
        Queue<path> queue = new LinkedList<>();
        path path = new path(0,0,0,-1);
        queue.add(path);
        while(!queue.isEmpty()){
            for(int i = 0 ; i < height ; i++){
                for(int j = 0 ; j < width; j++){
                    System.out.print(board[i][j] + "\t ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            path que = queue.poll();
            if(que.x == width-1 && que.y == height-1){
                money = Math.min(money,que.cost);
                continue;
            }
            System.out.println(que.toString());
            for(int i = 0 ; i <4; i++){
                int X = que.x+xx[i];
                int Y = que.y+yy[i];
                if(X >= 0 && Y >= 0 && X < width && Y < height && board[X][Y] != 1){
                    int C = 0;
                    if(que.dir == -1 || que.dir == i){
                        C = que.cost + 100;
                    }else if(que.dir != i){
                        C = que.cost + 600;
                    }

                    if(board[X][Y] == 0|| board[X][Y] >= C){
                        board[X][Y] = C;
                        queue.add(new path(X, Y, C, i));
                    }
                }
            }
        }



        return money;
    }

    class path{
        int x;
        int y;
        int cost;
        int dir;
        path(int x, int y, int cost, int dir){
            this.x = x;
            this.y = y;
            this.cost = cost;
            this.dir = dir;
        }

    }
    public static void main(String[] args) {

        경주로건설 경주 = new 경주로건설();
        System.out.println(경주.solution(new int[][]{{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1},{0,0,1,0,0,0,1,0},{0,1,0,0,0,1,0,0},{1,0,0,0,0,0,0,0}}));

    }
}
