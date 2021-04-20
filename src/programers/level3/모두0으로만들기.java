package programers.level3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 모두0으로만들기 {
    public long solution(int[] a, int[][] edges) {
        long answer = 0;
        int check = 0;
        for(int i = 0 ; i < a.length; i ++){
            check += a[i];
        }
        if(check !=0){
            return -1;
        }
        Queue<Integer> queue = new LinkedList<>();
        Stack<e> stack = new Stack<>();
        queue.add(0);
        boolean[] bool = new boolean[edges.length];
        while(!queue.isEmpty()){
            int data =queue.poll();
            for(int i = 0 ; i < edges.length; i ++){
                if(!bool[i] &&( edges[i][0] ==data || edges[i][1] == data)){
                    bool[i] = true;
                    if(edges[i][0] == data){
                        queue.add(edges[i][1]);
                        stack.add(new e(data,edges[i][1]));
                    }else if(edges[i][1] == data){
                        queue.add(edges[i][0]);
                        stack.add(new e(data, edges[i][0]));
                    }
                }
            }
        }
        while(!stack.isEmpty()){
            e data = stack.peek();

            System.out.println(data.x + ", " + data.y);
            stack.pop();
            System.out.println(a[data.x] + "- " +a[data.y]);
            a[data.x] = a[data.x] + a[data.y];
            System.out.println(a[data.x]);
            answer = answer + Math.abs(a[data.y]);
        }
        return answer;
    }
    class e{
        int x;
        int y;

        public e(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        모두0으로만들기 s = new 모두0으로만들기();
        System.out.println(s.solution(new int[]{-5,0,2,1,2},new int[][]{{0,1},{3,4},{2,3},{0,3}}));
    }

}
