package programers.level2;

import java.util.Stack;

//짝지어 제거하기
public class solution16 {
    public int solution(String s)
    {
        int answer = 1;
        Stack<Character> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        stack.add('1');
        stack.add(s.charAt(0));
        for(int i = 1; i <s.length(); i++){
            if(stack.peek() == s.charAt(i)){
                stack.pop();
            }
            else{
                stack.add(s.charAt(i));
            }
        }
        if(stack.peek()=='1'){
            answer = 1;
        }else{
            answer = 0 ;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution16 solution16 = new solution16();
        System.out.println(solution16.solution("cdcd"));
    }
}
