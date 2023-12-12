package old.programers.level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 괄호 회전하기
public class 월간코드챌린지_시즌2 {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        Queue<String> queue = new LinkedList<>();
        for(int i = 0 ; i < s.length(); i++){
            queue.add(s.charAt(i)+"");
        }

        for(int i = 0 ; i < len; i++){
            Stack<String> stack = new Stack<>();
            for(String ss : queue){
                System.out.print(ss);
                if(stack.isEmpty()){
                    stack.add(ss);
                }
                else if(stack.peek().equals("[")&& ss.equals("]")){
                    stack.pop();
                }
                else if(stack.peek().equals("(") && ss.equals(")")){
                    stack.pop();
                }
                else if(stack.peek().equals("{")&& ss.equals("}")){
                    stack.pop();
                }else{
                    stack.add(ss);
                }
            }
            System.out.println();
            if(stack.isEmpty()){
                answer++;
            }
            queue.add(queue.poll());
        }

        return answer;
    }
}
