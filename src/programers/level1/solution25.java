package programers.level1;

import java.util.ArrayList;
import java.util.Arrays;

// 제일 작은 수 제거하기
public class solution25 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int count = 0;


        if (arr.length == 1) {
            return new int[]{-1};
        } else {
            int min = arr[0];
            for (int i =0 ; i < arr.length;i++) {
                min = Math.min(min, arr[i]);
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < arr.length; i++){
                if(min==arr[i]){
                    continue;
                }
                list.add(arr[i]);
            }
            for(int i = 0 ; i < list.size();i++){
                answer[i] = list.get(i);
            }

        }
        return answer;


    }
}
