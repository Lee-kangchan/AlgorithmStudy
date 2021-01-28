package programers.level2;

import java.util.Arrays;

//N개의 최소 공배수
public class solution15 {
    public int solution(int[] arr) {

        Arrays.sort(arr);
        int answer = arr[0];
        for(int i = 1 ; i < arr.length; i++ ){
            answer = answer* arr[i] / gcd(answer, arr[i]);
        }

        return answer;
    }
    public int gcd(int a, int b){
        if(a%b ==0){
            return b;
        }
        else{
            return gcd(b, a%b);
        }
    }
}
