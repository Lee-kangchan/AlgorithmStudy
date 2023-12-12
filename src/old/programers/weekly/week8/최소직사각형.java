package old.programers.weekly.week8;

import java.util.Arrays;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int len = sizes.length;
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < len ; i ++){
            Arrays.sort(sizes[i]);
            x = sizes[i][0] > x ? sizes[i][0] : x;
            y = sizes[i][1] > y ? sizes[i][1] : y;
        }
        return x*y;
    }
}
