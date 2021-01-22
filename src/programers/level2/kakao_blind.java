package programers.level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//문자열 압축
public class kakao_blind {
    public int solution(String s) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        for(int i = s.length()/2+1 ; i >= 1; i--){
            int count=0;
            String data = "";
            for(int j = 0 ; j < s.length(); j++){
                data += s.charAt(j);
                count++;
                System.out.println(data);
                if(count == i){
                    queue.offer(data);
                    count =0;
                    data="";
                }
            }
            queue.offer(data);
            queue.offer("");
            String prev = queue.poll();
            String result = "";
            int num = 1 ;
            while(!queue.isEmpty()){
                if(queue.peek().equals(prev)){
                    num++;
                }else{
                    if(num == 1){
                        result += prev;
                    }
                    else{
                        result += String.valueOf(num) + prev;
                        num = 1;
                    }
                }
                prev = queue.poll();
            }
            System.out.println(result);

            answer = answer == 0 ? result.length() : Math.min(answer, result.length());
        }
        return answer;
    }
}
