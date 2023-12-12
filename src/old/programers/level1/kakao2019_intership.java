package old.programers.level1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//크레인 인형뽑기 게임
public class kakao2019_intership {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        HashMap<Integer, Queue<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < board.length; i++){
            Queue<Integer> queue1 = new LinkedList<>();
            map.put(i, queue1);
        }
        for(int i =0 ; i < board.length; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] != 0){
                    Queue<Integer> stack = map.get(j);
                    stack.add(board[i][j]);
                    map.put(j,stack);
                }
            }
        }
        Stack<Integer> stack = new Stack<>();
        for(int i : moves){
            Queue<Integer> queue = map.get(i-1);
            if(stack.isEmpty()){
                queue.add(queue.poll());
            }else{
                System.out.println(stack.peek() +"--"+ queue.peek());
                if(stack.peek() == queue.peek()){
                    answer++;
                    stack.pop();
                    queue.poll();
                }else{
                    queue.add(queue.poll());
                }
            }
        }

        return answer;
    }
}
