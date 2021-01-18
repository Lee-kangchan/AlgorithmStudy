package programers.level1;

import java.util.ArrayList;
import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
public class solution7 {
    public int[] solution(int[] arr, int divisor) {

        // 낮은순으로 배열에 저장해야기 때문에 처음부터 정렬
        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();

        // 나누어 떠러지는 값을 List에 저장
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%divisor == 0 ){
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];

        // 만약없으면 -1출력
        if(list.isEmpty()){
            return new int[]{-1};
        }

        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = list.get(i);
            System.out.print(answer[i]+" ");
        }
        System.out.println();
        return answer;
    }

    public static void main(String[] args) {
        solution7 solution7 = new solution7();

        System.out.println(solution7.solution(new int[]{5,9,7,10},5));
        System.out.println(solution7.solution(new int[]{2,36,1,3},1));
        System.out.println(solution7.solution(new int[]{3,2,6},10));
    }
}
