package programers.level2;

public class solution14 {
    //JadenCase 문자열 만들기
    public String solution(String s) {
        String answer = "";
        String[] ans = s.split(" ");
        for(int i = 0 ; i < ans.length; i++){
            if(ans[i].length()==0){
                answer += " ";
            }else{
                for(int j = 0 ; j< ans[i].length(); j++){
                    if(j!=0){
                        if(ans[i].charAt(j)>='a' && ans[i].charAt(j)<='z'){
                            answer += String.valueOf(ans[i].charAt(j)).toUpperCase();
                        }
                        else{
                            answer += ans[i].charAt(j);
                        }
                    }else{
                        if(ans[i].charAt(j)>='A' && ans[i].charAt(j)<='Z'){
                            answer += String.valueOf(ans[i].charAt(j)).toLowerCase();
                        }else{
                            answer += ans[i].charAt(j);
                        }
                    }
                }
            }
            if( i != ans.length-1) {
                answer += " ";
            }
        }
        int count = answer.length();
        return answer.substring(count, count);
    }
}
