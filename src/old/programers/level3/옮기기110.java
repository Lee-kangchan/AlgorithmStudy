package old.programers.level3;

import java.util.Stack;

public class 옮기기110 {
    public String[] solution(String[] s) {

        String[] answer = new String[s.length];
        for(int i =0 ; i < s.length; i++){
            answer[i] = solve(s[i]);
        }
        return answer;
    }
    public String solve(String s){
        int cnt =0;
        Stack<Character> sc = new Stack<>();
        for(int i=0;i<s.length();i++){

            sc.push(s.charAt(i));

            if(sc.size() >= 3){
                char first = sc.pop();
                char second = sc.pop();
                char third = sc.pop();
                if(first != '0' || second != '1' || third != '1'){
                    sc.push(third);
                    sc.push(second);
                    sc.push(first);
                    continue;
                }
                cnt++;
            }
        }

        int idx = sc.size();
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        while(!sc.isEmpty()){
            if(!flag && sc.peek()== '1'){
                idx--;
            }
            if(!flag && sc.peek() == '0'){
                flag = true;
            }
            sb.insert(0, sc.pop());
        }

        while(cnt>0){
            sb.insert(idx, "110");
            idx += 3;
            cnt--;
        }
        return sb.toString();
    }
}
