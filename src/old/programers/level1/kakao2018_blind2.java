package old.programers.level1;

import java.util.Stack;

// 다트 게임
public class kakao2018_blind2 {
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        while(dartResult.length()!=0){
            int count = 2;
            int number = Integer.parseInt(""+dartResult.charAt(0));
            if(dartResult.charAt(1) == '0' ){
                number = 10;
                dartResult = dartResult.substring(1);
            }
            char bonus = dartResult.charAt(1);
            if(bonus=='S'){
                number *=1;
            }
            else if(bonus == 'D'){
                number = number * number;
            }
            else if(bonus == 'T'){
                number = number * number * number;
            }

            if(dartResult.length() >= 3 && dartResult.charAt(2)=='#'){
                number *= -1;
                stack.push(number);
                count = 3;
            }else if(dartResult.length() >= 3 && dartResult.charAt(2) == '*'){
                if(!stack.isEmpty()){
                    int data = stack.peek();
                    stack.pop();
                    data = data *2;
                    stack.push(data);
                }
                number = number *2;
                stack.push(number);
                count = 3;
            }else{
                stack.push(number);
            }
            dartResult = dartResult.substring(count);
            System.out.println(count);
            System.out.println(dartResult);
        }

        for(int i : stack){
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        kakao2018_blind2 k = new kakao2018_blind2();
        System.out.println(k.solution("1D2S#10S"));
    }
}
