package programers.level1;

// 시저 암호
public class solution17 {
    public String solution(String s, int n) {
        String answer = "";
        String str = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                if(s.charAt(i)+n >'Z'){
                    answer += (char)(s.charAt(i)+n -26);
                }else{
                    answer += (char)(s.charAt(i)+n) ;
                }
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                if(s.charAt(i)+n >'z'){
                    answer += (char)(s.charAt(i)+n -26);
                }else{
                    answer += (char)(s.charAt(i)+n) ;
                }
            }
            else{
                answer += s.charAt(i);
            }
        }

        return answer;
    }
}
