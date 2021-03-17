package programers.level3;

import java.util.HashSet;

// 2019 카카오 개발자 겨울 인턴십 : 징검다리 건너기
public class 징검다리건너기 {
    public int solution(int[] stones, int k) {
        int sum = Integer.MAX_VALUE;
        for(int i = 0 ; i <stones.length-k; i++){
            int data=0;

            if(sum <= stones[i]){
                continue;
            }
            for(int j = 0 ; j< k; j++){
                data = data > stones[i+j] ? data : stones[i+j];
            }
            sum = sum > data ? data : sum;
        }
        return sum;
    }
}
