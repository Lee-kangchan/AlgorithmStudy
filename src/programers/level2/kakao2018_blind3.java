package programers.level2;

import java.util.ArrayList;

//방금그곡
public class kakao2018_blind3 {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        int size = 0;
        ArrayList<String> list = new ArrayList<>();
        for(String i : musicinfos){
            String ans[] = i.split(",");
            String time[] = ans[0].split(":");
            String time2[] = ans[1].split(":");
            int time3 = 60*(Integer.parseInt(time2[0]) - Integer.parseInt(time[0]))+ Integer.parseInt(time2[1]) - Integer.parseInt(time[1]);;
            while(time3 >  ans[3].length()){
                ans[3]+=ans[3];
            }
            for(int j=0; j<= time3; j++){
                if(m.equals(ans[3].substring(j,j+m.length()))){
                    if(j+m.length() != ans[3].length() && ans[3].charAt(j+m.length())=='#'){

                    }else{
                        if(size < time3) {
                            answer = ans[2];
                            size = time3;
                        }
                    }
                }
            }
        }
        if(answer.equals("")){
            answer = "(None)";
        }
        return answer;
    }
}
