package programers.level1;

import java.util.HashSet;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int j = 1 ; j * j <= 1000 ; j++ ) {
            set.add(j*j);
        }

        for(int i = left ; i <= right; i++ ){
            if(set.contains(i)){
                answer -= i;
            }else{
                answer += i;
            }
        }
        return answer;
    }
}
