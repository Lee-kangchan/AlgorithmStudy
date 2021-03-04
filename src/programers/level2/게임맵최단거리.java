package programers.level2;

import java.util.LinkedList;
import java.util.Queue;

//찾아라 프로그래밍 마에스터 - 게임 맵 최단거리
public class 게임맵최단거리 {
    public int solution(int[][] maps) {

        int answer = 0;
        int xx[] = {-1,0,1,0};
        int yy[] = {0,1,0,-1};
        int[][] map = new int[maps.length][maps[0].length];
        Queue<location> queue = new LinkedList<>();
        queue.add(new location(0,0));

        map[0][0] = 1;
        while(!queue.isEmpty()){
            location l = queue.poll();
            for(int i = 0 ; i < xx.length;i++){
                int next_x = l.x + xx[i];
                int next_y = l.y + yy[i];
                if(next_x >= maps.length || next_y >= maps[0].length || next_x < 0 || next_y < 0 || map[next_x][next_y] == 1|| maps[next_x][next_y] == 0){
                    continue;
                }
                queue.add(new location(next_x, next_y));
                maps[next_x][next_y] = maps[l.x][l.y] +1;
                map[next_x][next_y] = 1;
            }
        }
        if(maps[maps.length-1][maps[0].length-1] > 1){
            answer = maps[maps.length-1][maps[0].length-1];
        }else{
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        게임맵최단거리 kakao = new 게임맵최단거리();
        System.out.println(kakao.solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}));
    }
    class location{
        int x;
        int y;
        public location(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
