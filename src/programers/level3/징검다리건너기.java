package programers.level3;

import java.util.Arrays;
import java.util.HashSet;

// 2019 카카오 개발자 겨울 인턴십 : 징검다리 건너기
public class 징검다리건너기 {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int start = 1 ;
        int end = Arrays.stream(stones).max().getAsInt();

        while(start < end){
            int mid = (start+end)/2;
            if(check(stones, k, mid)){
                start = mid +1;
                answer = mid;
            }else {
                end = mid -1;

            }

        }

        return answer;
    }
    public boolean check(int[] stones, int k, int c){
        int cnt =0;
        for(int i = 0 ; i <stones.length ;i++){
            if(stones[i] < c){
                cnt++;
                if(cnt >= k){
                    return false;
                }
            }else{
                cnt = 0;
            }
        }
        return true;
    }
}
