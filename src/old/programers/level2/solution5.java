package old.programers.level2;

//올바른 괄호
public class solution5 {
    boolean solution(String s) {
        boolean answer = true;

        int l =0 , r = 0 ;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='('){
                l++;
            }
            if(s.charAt(i)==')'){
                r++;
            }
            if(r>l){
                answer = false;
                break;
            }
        }
        if(l != r){
            answer=false;
        }
        return answer;
    }
}
