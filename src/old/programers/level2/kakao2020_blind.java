package old.programers.level2;

import java.util.Stack;
//괄호 변환
public class kakao2020_blind {
    public String solution(String p) {

        if(p.length()==0){
            return p;
        }

        boolean current = check(p);
        String u = p.substring(0, position);
        String v = p.substring(position);
        if(current){
            return u + solution(v);
        }
        String answer = "(" + solution(v) + ")";
        for (int i=1 ; i<u.length()-1; ++i){
            if(u.charAt(i) == '(')
                answer += ')';
            else
                answer += '(';


        }
        return answer;
    }
    int position;
    public boolean check(String p){
        int left=0, right = 0 ;
        Stack<Character> mystack = new Stack<>();
        boolean ret = true ;
        for(int i=0; i < p.length(); i++){
            if(p.charAt(i) == '('){
                left++;
                mystack.push('(');
            }else{
                right++;
                if(mystack.empty())
                    ret = false;
                else
                    mystack.pop();
            }
            if(left == right){
                position = i+1;
                return ret;
            }
        }
        return true;
    }

}
