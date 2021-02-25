package programers.level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//n진수 게임
public class kakao2018_blind {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        Queue<Integer> queue = new LinkedList<>();
        int turn = 0;
        for(int i = 1 ; i <= m ; i++){
            queue.add(i);
        }
        int i = 0;
        while(answer.length() <= t) {

            Stack<Integer> stack = new Stack<>();
            int check = i;
            do{
                stack.add(check%n);
                check = check/n;
            }while (check!=0);
            while (!stack.isEmpty()){
                int current = queue.poll();
                queue.add(current);
                int result = stack.peek();
                stack.pop();
                if (current == p) {
                    switch (result) {
                        case 10:
                            answer += "A";
                            break;
                        case 11:
                            answer += "B";
                            break;
                        case 12:
                            answer += "C";
                            break;
                        case 13:
                            answer += "D";
                            break;
                        case 14:
                            answer += "E";
                            break;
                        case 15:
                            answer += "F";
                            break;
                        default:
                            answer += String.valueOf(result);
                    }
                }
                check = check / n ;
            }
            i++;
        }
        return answer.substring(0,t);
    }

    public static void main(String[] args) {
        kakao2018_blind k = new kakao2018_blind();
        System.out.println(k.solution(2,4,2,1));
    }
}
