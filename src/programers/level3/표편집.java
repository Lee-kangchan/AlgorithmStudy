package programers.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 표편집 {
    public String solution(int n, int k, String[] cmd) {
        StringBuilder answer = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int current = k;
        int len = n;
        for(int i = 0 ; i < cmd.length; i++){

            if(cmd[i].equals("D")){
                current += Integer.parseInt(cmd[i].substring(2));
            }else if(cmd[i].equals("U")){
                current -= Integer.parseInt(cmd[i].substring(2));
            }else if(cmd[i].equals("C")){
                stack.add(current);
                len--;
                if(current == len){
                    current--;
                }
            }else if(cmd[i].equals("Z")){
                if(stack.pop() <= current){
                    current++;
                }
                len++;
            }
        }
        for(int i = 0 ; i< len; i++){
            answer.append("O");
        }
        for(int i =0 ; i < stack.size(); i++){
            answer.insert(stack.pop().intValue(), "X");
        }


        return answer.toString();
    }
}
