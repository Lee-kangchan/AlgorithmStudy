package programers.level2;

import java.util.*;
//프린터
public class solution1 {
    public int solution(int[] priorities, int location) {
        int answer = 0 ;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : priorities){
            queue.add(i);
        }
        for(int i : queue){
            System.out.println(i);
        }

        int count = 0 ;
        while(!queue.isEmpty()){
            for(int i =0 ; i < priorities.length; i++){
                if(priorities[i] == queue.peek()){
                    count++;
                    queue.poll();
                    if(i == location){
                        answer =  count;
                        queue.clear();
                        break;
                    }
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution1 solution1 = new solution1();
        System.out.println(solution1.solution(new int[]{2,1,3,2}, 2));
        System.out.println(solution1.solution(new int[]{1,1,9,1,1,1}, 0));
    }
}
