package programers.level3;

import java.util.LinkedList;
import java.util.Queue;

public class 블록이동하기 {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        Queue<robot> queue = new LinkedList<>();
        queue.add(new robot(0,1,0,0));
        board[0][1] = -1;
        board[0][0] = -1;

        while(!queue.isEmpty()){
            robot robot = queue.poll();
            if(robot.front_x == len-1 && robot.front_y == len -1){
                break;
            }
            System.out.println(robot.toString());
            for(int i = 0 ; i < 4; i++){
                int front_X = robot.front_x + X[i];
                int front_Y = robot.front_y + Y[i];
                if(front_X < len && front_X >=0 && front_Y < len && front_Y >=0 ){
                    if(board[front_X][front_Y] != 1 && (board[front_X][front_Y] > board[robot.front_x][robot.front_y] || board[front_X][front_Y] == 0)){
                        if(front_X == robot.back_x +2 || front_Y == robot.back_y +2){
                            board[front_X][front_Y] = board[robot.front_x][robot.front_y] -1;
                            queue.add(new robot(front_X,front_Y, robot.front_x, robot.front_y));
                        }
                        else{
                            boolean check = false;
                            for(int j = 0 ; j < 4; j++){

                                int back_X = robot.front_x + X[i];
                                int back_Y = robot.front_y + Y[i];
                                if(back_X < len && back_X >=0 && back_Y < len && back_Y >=0 ) {
                                    if(board[back_X][back_Y] == 1) {
                                        check = true;
                                        break;
                                    }
                                }
                            }
                            if(!check){
                                board[front_X][front_Y] = board[robot.front_x][robot.front_y] -1;
                                queue.add(new robot(front_X,front_Y, robot.front_x, robot.front_y));
                            }
                        }
                    }
                }
            }
        }
        return -1 - board[len-1][len-1];
    }

    int X[] = new int[]{1,0,-1,0};
    int Y[] = new int[]{0,1,0,-1};
    class robot{
        int front_x ;
        int front_y ;
        int back_x ;
        int back_y ;

        public robot(int front_x, int front_y, int back_x, int back_y) {
            this.front_x = front_x;
            this.front_y = front_y;
            this.back_x = back_x;
            this.back_y = back_y;
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
