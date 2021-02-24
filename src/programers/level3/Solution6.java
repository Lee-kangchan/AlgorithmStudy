package programers.level3;

import java.util.Arrays;

//야근 지수
public class Solution6 {
    public long solution(int n, int[] works){
        long answer = 0;
        int max = 0 ;
        Arrays.sort(works);
        for(int i = 0 ; i < works.length; i++){
            max = Math.max(max, works[i]);
        }
        while(n!=0){
            for(int i= works.length -1 ; i >=0 ; i--){
                if(max == works[i]){
                    n--;
                    works[i]--;
                }else{
                    break;
                }
                if(n==0){
                    break;
                }
            }
        }
        for(int i = 0 ; i < works.length; i++){
            answer += works[i] * works[i];
        }
        return answer;
    }
}
