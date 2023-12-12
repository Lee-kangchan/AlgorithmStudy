package old.programers.level3;

import java.util.LinkedList;
import java.util.Queue;

public class 블록이동하기 {

    int len = 0 ;
    int X[] = new int[]{1,0,-1,0};
    int Y[] = new int[]{0,1,0,-1};
    public int solution(int[][] board) {
        Queue<Robot> queue = new LinkedList<>();
        board[0][0] = -1;
        board[0][1] = -1;
        queue.add(new Robot(0,0,1,0, 0));
        len = board.length;
        while(!queue.isEmpty()){

            Robot robot = queue.poll();
            for(int x = 0 ; x < board.length; x++){
                for (int y = 0 ; y< board.length; y++){
                    System.out.print(board[x][y] + " ");
                }
                System.out.println("");
            }
            System.out.println(robot.toString() + " 결과값은 ??? -----> front = " + board[robot.front_x][robot.front_y] + " back = " +board[robot.back_x][robot.back_y]);

            for(int i = 0 ; i < 4; i++){
                int fx = robot.front_x + X[i];
                int fy = robot.front_y + Y[i];
                int bx = robot.back_x;
                int by = robot.back_y;
                if(over_check(fx, fy) && equals_check(bx, by, fx, fy) ){
                    if(block_check(board, fx, fy) && (board[fx][fy] ==0 || board[fx][fy] < board[robot.front_x][robot.front_y] )){
                         if(bx +2 == fx || by + 2 == fy || bx - 2 == fx || by - 2 == fy){
                             board[fx][fy] = board[robot.front_x][robot.front_y] -1;
                             queue.add(new Robot(fx, fy, robot.front_x, robot.front_y,robot.dir ));
                         }else if(board[fx][robot.front_y] != 1 && board[robot.front_x][fy] != 1){

                         }
                    }
                }
            }
            for(int i = 0 ; i < 4; i++){
                int bx = robot.front_x ;
                int by = robot.front_y ;
                int fx = robot.back_x + X[i];
                int fy = robot.back_y + Y[i];
                if(over_check(fx, fy) && equals_check(bx, by, fx, fy) ){
                    if(block_check(board, fx, fy) && (board[fx][fy] ==0 || board[fx][fy]-1 < board[robot.back_x][robot.back_y] )){
                        if(bx +2 == fx || by + 2 == fy || bx - 2 == fx || by - 2 == fy){
                            board[fx][fy] = board[robot.back_x][robot.back_y] -1;
                            queue.add(new Robot(fx, fy, robot.back_x, robot.back_y,robot.dir ));
                        }else{
                            boolean check = false;
                            for(int j = 0 ; j < 4 ; j++){

                                if(over_check(bx+X[i], by+Y[i])) {
                                    if (!block_check(board, bx + X[i], by + Y[i])) {
                                        check = true;
                                        break;
                                    }
                                }
                            }
                            if(!check){
                                board[fx][fy] = board[robot.back_x][robot.back_y] -1;
                                queue.add(new Robot(fx, fy, robot.back_x, robot.back_y, (robot.dir+1)%2));
                            }
                        }
                    }
                }
            }
        }
        return -board[len-1][len-1];
    }
    public boolean over_check(int x, int y){
        if(x >= len || y >= len || x < 0 || y < 0 ){
            return false;
        }
        return true;
    }
    public boolean equals_check(int prevX, int prevY, int nextX, int nextY){
        if(prevX == nextX && prevY == nextY){
            return false;
        }
        return true;
    }
    public boolean block_check(int [][] board, int x, int y){
        if(board[x][y] == 1){
            return false;
        }
        return true;
    }

    class Robot{
        int front_x ;
        int front_y ;
        int back_x ;
        int back_y ;
        // dir 0 가로 dir 1 세로
        int dir;

        public Robot(int front_x, int front_y, int back_x, int back_y, int dir) {
            this.front_x = front_x;
            this.front_y = front_y;
            this.back_x = back_x;
            this.back_y = back_y;
            this.dir = dir;
        }

        @Override
        public String toString() {
            return "robot{" +
                    "front_x=" + front_x +
                    ", front_y=" + front_y +
                    ", back_x=" + back_x +
                    ", back_y=" + back_y +
                    '}';
        }
    }

    public static void main(String[] args) {
        블록이동하기 s = new 블록이동하기();
        System.out.println(s.solution(new int[][]{{0,0,0,1,1},{0,0,0,1,0},{0,1,0,1,1},{1,1,0,0,1},{0,0,0,0,0}}));
    }
}
