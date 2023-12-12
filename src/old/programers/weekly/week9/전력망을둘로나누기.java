package old.programers.weekly.week9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 전력망을둘로나누기 {
    public int solution(int n, int[][] wires) {
        int answer = 9999;

        for(int i = 0 ; i < wires.length ; i ++){
            int t = bfs(n, wires, i);
            answer = answer > t ? t : answer;
        }
        return answer;
    }
    public int bfs(int n, int[][] wires, int except){
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] check = new boolean[n];
        queue.add(1);
        list.add(1);
        while(true){
            int data = queue.poll();
            for(int i = 0; i < wires.length ; i ++){
                if(i == except){
                    continue;
                }

                if(data == wires[i][1] && check[i] == false){
                    queue.add(wires[i][0]);
                    list.add(wires[i][0]);
                    check[i] = true;
                }
                if(data == wires[i][0] && check[i] == false){
                    queue.add(wires[i][1]);
                    list.add(wires[i][1]);
                    check[i] = true;
                }

            }
            if(queue.isEmpty()){
                n = Math.abs(n - list.size() - list.size());
                return n;

            }
        }
    }
}
