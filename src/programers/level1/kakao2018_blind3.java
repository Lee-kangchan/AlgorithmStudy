package programers.level1;

import java.util.ArrayList;

//압축
public class kakao2018_blind3 {
    public int[] solution(String msg) {
        int[] answer = {};
        String c,n;
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0 ; i < msg.length()-1 ; i++){
            c = msg.charAt(i)+"";
            int count = 0 ;
            for(String s : list){
                if(s.equals(msg.substring(i, i + s.length()))){
                    c = msg.substring(i, i + s.length());
                    count = s.length();
                }
            }
            i+=count;



        }
        return answer;
    }

}
