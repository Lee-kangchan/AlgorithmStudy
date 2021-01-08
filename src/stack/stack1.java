package stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//기능 개발
public class stack1 {
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();

        // 일은 언제 끝나는지 각각의 배열에 넣기
        for(int i= 0 ; i < progresses.length; i++){
            int data = (100-progresses[i])/ speeds[i];
            if((100-progresses[i])%speeds[i]!=0){
                data++;
            }
            queue.add(data);
        }
        int count=1;
        int task= queue.poll() ;
        ArrayList<Integer> result = new ArrayList<>();
        // 처음 처리해야할 작업을 처리가 완료후 뒷 작업들이 얼마나 끝났는지 확인하고 배포를 하며
        // 다음 배포때도 다음 작업 이어서 진행행
       while(!queue.isEmpty()){
            if(queue.peek() <= task){
                count++;

            }else{
                result.add(count);
                count = 1 ;
                task = queue.peek() ;
            }
            queue.poll();
        }
        result.add(count);
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }

    public static void main(String[] args){
        stack1 stack1 = new stack1();
        System.out.println();
        int data[] = stack1.solution(new int[]{93,30,55}, new int[]{1,30,5});

        for (int i : data){
            System.out.println(i);
        }
        System.out.println("--------------------");
        data = stack1.solution(new int[]{95,90,99,99,80,99}, new int[]{1,1,1,1,1,1});

        for (int i : data){
            System.out.println(i);
        }
    }
}
