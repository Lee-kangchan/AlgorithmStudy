package old.programers.level3;

import java.util.Arrays;

public class 스티커모으기 {
    public int solution(int sticker[]) {

        int size = sticker.length;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        if(size <= 3){
            return Arrays.stream(sticker).max().getAsInt();
        }

        int[] dp1 = new int[size];
        int[] dp2 = new int[size];

        dp1[0] = dp1[1] = sticker[0];
        dp2[0] = 0; dp2[1] = sticker[1];

        for(int i = 2; i < size-1 ; i++){
            dp1[i] = Math.max(dp1[i-2]+sticker[i], dp1[i-1]);
            dp2[i] = Math.max(dp2[i-2]+sticker[i], dp2[i-1]);
        }
        int i = size - 1;
        dp1[i] = Math.max(dp1[i-1], dp1[i-2]);
        dp2[i] = Math.max(dp2[i-2]+sticker[i], dp2[i-1]);

        return Math.max(dp1[i], dp2[i]);
    }
}
