package old.programers.level1;

import java.util.Arrays;
import java.util.Collections;

//문자열 내림차순으로 배치하기
public class solution11 {
    public String solution(String s) {
        String t[] = new String[s.length()];

        //문자열을 배열 형태로 변환
        for(int i =0  ; i < s.length() ; i ++){
            t[i] = ""+s.charAt(i);
        }

        // 역순 정렬
        Arrays.sort(t, Collections.reverseOrder());

        String answer = "";
        // 다시 문자열 합치기
        for(int i = 0 ; i < t.length ; i++){
            answer += t[i];
        }

        return answer;
    }
}
