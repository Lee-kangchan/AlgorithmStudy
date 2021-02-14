package programers.sort;

import java.util.Arrays;
import java.util.Comparator;
// 가장 큰 수
public class Sort1 {
    public String solution(int[] numbers) {
        String answer = "";
        String num[] = new String[numbers.length];

        // 문자열로 변경
        for(int i = 0 ; i < numbers.length ; i++)
        {
            num[i] = String.valueOf(numbers[i]);
        }
        // 문자열 앞 뒤 / 뒤 앞을 붙혀보면 어떤값이 큰지 알 수 있다
        Arrays.sort(num, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1 + o2));
            }
        });
        // 만약에 값이 0000같은 것을 방지 하기 위해 제어
        if(num[0].equals("0")){
            return "0";
        }
        // int 범위를 넘어가지 못하게 String에 담기
        for(int i = 0 ; i < num.length; i++){
            answer += num[i];
        }


        return answer;
    }

    public static void main(String[] args) {
        Sort1 sort1 = new Sort1();


        System.out.println(sort1.solution(new int[]{6,10,2}));
        System.out.println(sort1.solution(new int[]{3, 30, 34, 5, 9}));
    }
}
