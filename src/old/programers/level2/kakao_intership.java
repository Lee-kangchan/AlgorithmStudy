package old.programers.level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class kakao_intership {
    long  answer = 0 ;
    public long solution(String expression) {
        String[] s = {"*-+","*+-","-*+","+*-","-+*","+-*"};

        for(int i = 0 ; i < s.length; i++){
            Queue<String> queue = new LinkedList<>();
            int prev = 0 ;
            for(int j = 0; j <expression.length() ; j++){
                if(expression.charAt(j) == '+' || expression.charAt(j) == '-' ||expression.charAt(j) == '*'){
                    queue.add(expression.substring(prev, j));
                    queue.add(String.valueOf(expression.charAt(j)));
                    prev = j+1 ;
                }
            }
            queue.add(expression.substring(prev));
            solve(queue, s[i]);
        }
        return answer;
    }
    public void solve(Queue<String> queue, String s){
        Stack<String> stack2 = new Stack<>();
        if(s.equals("")){
            long data = 0 ;
            data = Long.parseLong(queue.peek());
            System.out.println(data);
            if(answer < Math.abs(data)){
                answer = Math.abs(data);
            }
            return ;
        }
        String t = String.valueOf(s.charAt(0));
        s = s.substring(1);

        while(!queue.isEmpty()){
            if(queue.peek().equals(t)){
                queue.poll();
                long result =0;
                if(t.equals("*")){
                    result = Long.parseLong(stack2.peek()) * Long.parseLong(queue.poll());
                }
                else if (t.equals("+")){
                    result = Long.parseLong(stack2.peek()) + Long.parseLong(queue.poll());
                }
                else if (t.equals("-")){
                    result = Long.parseLong(stack2.peek()) -Long.parseLong(queue.poll()) ;
                }
                stack2.pop();
                stack2.add(String.valueOf(result));
            }else{
                stack2.add(queue.poll());

            }
        }
        for(String i : stack2){
            queue.offer(i);
        }
        solve(queue, s);
    }


    public static void main(String[] args) {
        kakao_intership kakao_intership = new kakao_intership();
        System.out.println(kakao_intership.solution("100-200*300-500+20"));
    }
}
