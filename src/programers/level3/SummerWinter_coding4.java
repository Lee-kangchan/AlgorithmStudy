package programers.level3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//배달
public class SummerWinter_coding4{
    public int solution(int N, int[][] road, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,0);
        Queue<Hmap> queue = new LinkedList<>();
        queue.offer(new Hmap(1,0));

        while(!queue.isEmpty()){
            Hmap hmap = queue.poll();
            for(int i = 0 ; i < road.length; i++){
                if(hmap.len + road[i][2] <= K){
                    System.out.println(hmap.Number);
                    if(road[i][0] == hmap.Number) {
                        Hmap data = new Hmap(road[i][1], hmap.len + road[i][2]);

                        if(map.get(road[i][1]) == null || map.get(road[i][1]) >= data.len ){
                            map.put(road[i][1], data.len);
                            queue.add(data);
                        }
                    }
                    else if(road[i][1] == hmap.Number){
                        Hmap data = new Hmap(road[i][0], hmap.len + road[i][2]);
                        if(map.get(road[i][0]) == null || map.get(road[i][0]) >= data.len ){
                            map.put(road[i][0], data.len);
                            queue.add(data);
                        }


                    }
                }
            }
        }
        for(int i = 1 ; i <= N ; i++){
            System.out.println(i + " = " + map.get(i));
        }
        return map.size();
    }

    class Hmap{
        int Number;
        int len;
        Hmap(int Numbber, int len){
            this.Number = Numbber;
            this.len = len;
        }
    }

    public static void main(String[] args) {
        SummerWinter_coding4 s = new SummerWinter_coding4();
        System.out.println(s.solution(5,new int[][]{{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}},3));
    }
}
