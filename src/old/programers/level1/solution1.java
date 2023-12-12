package old.programers.level1;

import java.util.Arrays;
import java.util.HashSet;

public class solution1 {
    //두개 뽑아서 더하기

    public int[] solution(int[] numbers) {

        HashSet<Integer> set = new HashSet<>();
        int answer[];

        for(int i = 0 ; i < numbers.length; i++){
            for(int j=i+1 ; j< numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }

        answer = new int[set.size()];
        int count =0;
        for(int i : set){
            answer[count] = i;
            count++;
        }
        Arrays.sort(answer);




        return answer;
    }

    public static void main(String[] args) {
        solution1 solution1 = new solution1();
        for(int i : solution1.solution(new int[]{2,1,3,4,1})){

            System.out.println(i);
        }

    }

}
