package old.codingTest.codeChallenge;

import java.util.HashSet;

public class Setember1 {
    public int solution(int[] numbers) {
        int answer = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i < 10; i++){
            set.add(i);
        }
        for(int i : numbers){
            set.remove(i);
        }
        for(int i : set){
            answer+=i;
        }
        return answer;
    }
}
