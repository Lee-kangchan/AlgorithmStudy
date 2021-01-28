package programers.level2;

import java.util.ArrayList;
import java.util.HashSet;

//영어 끝말잇기
public class summer_winter_coding2018_4 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<String>();
        list.add(words[0]);
        int result = -1;
        label :
        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).equals(words[i])) {
                    result = i;
                    break label;
                }
            }
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                result = i;
                break;
            }
            list.add(words[i]);
        }
        if(result > 0) {
            answer[0] = (result%n) + 1;
            answer[1] = (result/n) + 1;
        } else {
            answer[0] = 0;
            answer[1] = 0;
        }

        return answer;
    }
}
