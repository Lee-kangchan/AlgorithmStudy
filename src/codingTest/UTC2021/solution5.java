package codingTest.UTC2021;

public class solution5 {
    public int[][] solution(int rows, int columns) {
        boolean move[][][] = new boolean[rows][columns][2];
        int[][] circle = new int[][]{{0,1},{1,0}};
        int[][] data = new int[rows][columns];
        int sec = 0;
        int x=0 , y=0;
        int sum = 0 ;
        int time =1;
        while(move[y][x][sec] == false){
            move[y][x][sec] = true;
            if(data[y][x] == 0){
                sum++;
            }
            data[y][x] = time;

            if(sum == rows * columns) break;
            y+= circle[sec][0];
            x+= circle[sec][1];
            if(x== columns) x = 0;
            else if(y == rows) y=0;

            sec = sec == 1 ? 0 : 1;
            time++;
        }
        for(int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < columns; j++){

                System.out.printf("%5d ", data[i][j]);
            }
            System.out.println();
        }
        return data;
    }

    public static void main(String[] args) {
        solution5 solution5 = new solution5();
        System.out.println(solution5.solution(1, 12));
    }
}
