package greedy;

import java.util.Arrays;

// 큰 수 만들기
public class greedy3 {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0 ;
        int data = number.length()-k;
        for (int i = 0; i < data; i++) {
            int use = 0 ;
            for( int j = count+1 ; j <= count+k ; j++){
                if(number.charAt(j) > number.charAt(count+use)){
                    use = j -count;
                }
            }
            count = count + use;
            k = k - use;

            sb = sb.append(number.charAt(count));


            count++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        greedy3 greedy3 = new greedy3();


        System.out.println(greedy3.solution("1924", 2));
//        System.out.println(greedy3.solution("1231234", 3));
//        System.out.println(greedy3.solution("4177252841", 4));
    }
}
