package programers.stack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
//다리를 지나가는 트럭
public class stack2 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            map.put(i,0);
            queue.add(truck_weights[i]);
            queue2.add(truck_weights[i]);
        }
        int current = 0 ;
        int prev = 0 ;

        while(!queue2.isEmpty()){
            System.out.println(prev +" --" + current);
            answer ++ ;
            int Q = 0 ;
            int W = 0 ;
            if(queue.isEmpty()){

            }

            else if(weight- queue.peek() >= 0 ){
                if(W!=1) {
                    current++;
                    weight = weight - queue.poll();
                    Q++;
                }else{
                    W=0;
                }
            }
            for(int i =prev ; i <current; i++){
                if(map.get(i) < bridge_length){
                    map.put(i, map.get(i)+1);
                }
                else if(map.get(i) == bridge_length){
                    map.put(i, map.get(i)+1);
                    weight = weight + queue2.poll();
                    prev ++;
                    if(queue.isEmpty()){

                    }
                    else if(weight- queue.peek() >= 0 ){
                        if(Q!=1) {
                            current++;
                            weight = weight - queue.poll();
                            W++;
                        }{
                            Q=0;
                        }
                    }
                }
            }



        }


        return answer;
    }

    public static void main(String[] args) {

        stack2 stack2 = new stack2();
        System.out.println(stack2.solution(2, 10, new int[]{7, 4, 5, 6}));
//        System.out.println(stack2.solution(100, 100, new int[]{10}));
//        System.out.println(stack2.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10}));
        System.out.println(stack2.solution(5, 5, new int[]{2, 2, 2, 2, 1, 1, 1, 1, 1}));
    }
}
