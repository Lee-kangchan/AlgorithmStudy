package old.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class KTest4 {
    public int solution(int n, int start, int end, int[][] roads, int[] traps) {
        int answer = 999999999;

        Queue<data> queue = new LinkedList<>();
        queue.add(new data(0 , start, 0, new int[n+1]));
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < traps.length; i ++){
            set.add(traps[i]);
        }
        while(!queue.isEmpty()){
            data data = queue.poll();
            if(data.road == end){
                answer = answer > data.len ? data.len : answer;
                continue;
            }
            for(int i = 0; i < roads.length; i++){

                if(data.road == roads[i][data.target]){
                    if(data.arr[roads[i][(data.target+1)%2]  ] < 2) {

                        if (set.contains(roads[i][(data.target + 1) % 2]) && data.arr[roads[i][(data.target+1) %2 ]  ] == 0) {
                            data.arr[roads[i][(data.target + 1) % 2]]++;
                            queue.add(new data((data.target + 1) % 2, roads[i][(data.target + 1) % 2], data.len + roads[i][2], data.arr.clone()) );
                        } else {
                            queue.add(new data(data.target, roads[i][(data.target + 1) % 2], data.len + roads[i][2], data.arr));
                        }
                    }
                }
            }
        }
        return answer;
    }
    class data{
        int target ;
        int road;
        int len;
        int arr[];
        public data(int target, int road, int len, int arr[]) {
            this.target = target;
            this.road = road;
            this.len = len;
            this.arr = arr;
        }
    }

    public static void main(String[] args) {
        KTest4 k = new KTest4();
        System.out.println(k.solution(4,1,4,new int[][]{{1,2,1},{3,2,1},{2,4,1}},new int[]{2,3}));
    }
}
