package programers.level2;

import java.util.ArrayList;

public class 빛의경로사이클 {
    static int X, Y;
    static int[] dr = { -1, 0, 1, 0}, dc = {0, -1, 0 , 1};
    static boolean[][][] visit;

    public int[] solution(String[] grid){
        ArrayList<Integer> answer = new ArrayList<>();

        X = grid.length;
        Y = grid[0].length();

        visit = new boolean[X][Y][4];
        for(int i = 0 ; i < X; i ++){
            for(int j = 0 ; j < Y ; j++){
                for(int k = 0 ; k < 4 ; k++){
                    if(!visit[i][j][k]){
                        answer.add(light(grid, i, j, k));
                    }
                }
            }
        }

        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }

    private static int light(String[] grid, int x, int y, int cnt){
        int len = 0;

        while(true){
            if(visit[x][y][cnt]){
                break;
            }

            len++;
            visit[x][y][cnt] = true;
            if (grid[x].charAt(y) == 'L' )
                cnt = cnt == 0 ? 3 : cnt - 1;
            else if(grid[x].charAt(y) == 'R')
                cnt = (cnt + 1) % 4;

            x = (x + dr[cnt] + X) % X;
            y = (y + dc[cnt] + Y) % Y;
        }

        return len;
    }
}
