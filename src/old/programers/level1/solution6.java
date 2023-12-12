package old.programers.level1;

import java.util.ArrayList;

// 같은 숫자는 싫어
public class solution6 {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        // Queue로 했을때 왜 안되는지 모르겠다...




        int already = -1;
        //변수에 중복되지 않도록 이전의 숫자의 값을 넣어둠
        for (int i = 0; i < arr.length; i++) {
            if (already != arr[i]) {
                list.add(arr[i]);
                already = arr[i];
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution6 solution6 = new solution6();
        for(int i : solution6.solution(new int[]{1, 1, 3, 3, 0, 1, 1})){
            System.out.println(i);
        }

    }
}
