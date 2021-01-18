package programers.level1;

import java.util.Arrays;
import java.util.Collections;

public class solution23 {
    public long solution(long n) {
        long answer = 0;
        String t = String.valueOf(n);
        String num[] = new String[t.length()];

        for(int i =0 ; i < num.length ; i++){
            num[i] = ""+t.charAt(i);
        }
        Arrays.sort(num, Collections.reverseOrder());
        for(String i : num){
            answer = (answer*10)+ Integer.parseInt(i);
        }

        return answer;
    }
}
