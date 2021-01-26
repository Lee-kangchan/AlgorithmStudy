package programers.level2;

import java.util.Collections;

//다음 큰 숫자
public class solution6 {
    public int solution(int n) {
        int answer = 0;
        String data = Integer.toBinaryString(n);

        String data2 = "";
        for(int i = n+1; i < 1000000; i++){

            int temp=0 , temp2=0;
            data2 = Integer.toBinaryString(i);

            for(int j = 0 ; j < data.length(); j++){
                if(data.charAt(j)=='1'){
                    temp++;
                }
            }
            for(int j=0 ; j< data2.length();j++){
                if(data2.charAt(j)=='1'){
                    temp2++;
                }
            }
            if(temp == temp2){
                answer = i;
                break;
            }

        }
        return answer;
    }
}
