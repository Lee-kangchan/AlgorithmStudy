package programers.level3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Challenge_Season1_1 {
    public int solution(int[] a) {
        int answer = -1;
        HashSet<Integer> set = new HashSet<>();
        if(a.length == 1){
            return 0;
        }
        if(a.length <= 3){
            return 1;
        }
        for(int i = 0 ; i <a.length ; i++){
            set.add(a[i]);
        }
        for(Integer i : set) {
            int count =0;
            for (int j = 0; j < a.length; j++) {
                if(a[j] ==i){count++;}
                if(j+1 < a.length && a[j+1] ==i) {
                    count++;
                    j++;
                }
            }
            answer = Math.max(count, answer);
        }
        return answer*2;
    }
}