package test.devMatchingFinal;

public class Solution1 {
    public int solution(String[] drum) {
        int answer = 0;
        int len = drum[0].length();

        for(int i = 0 ; i < len; i++) {
            int current = i;
            int count = 0;
            boolean result = true;
            int cnt = 0;
            while(cnt < drum.length){
                if(drum[cnt].charAt(current) == '#') cnt++;
                else if(drum[cnt].charAt(current) == '>') current++;
                else if(drum[cnt].charAt(current) == '<') current--;
                else if(drum[cnt].charAt(current) == '*'){
                    if(count==1) {
                        result = false;
                        break;
                    }
                    count++;
                    cnt++;
                }
            }
            if(result){
                answer++;
            }
        }
        return answer;
    }
}
