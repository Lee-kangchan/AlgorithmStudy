package programers.level3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//기지국 설치
public class SummerWinter_coding3 {
    public int solution(int n, int[] stations, int w) {

        int answer = 0;
        int len = w+w+1;
        if(stations.length ==0){
            return n/(len) + ((n%(len))/(len));
        }
        else{
            for(int i = 0 ; i < stations.length; i++){
                if(i == 0){
                    if(stations[i] > w){
                        int sum = stations[i] -w - 1;
                        answer = sum%len == 0 ? answer + sum/len : answer + sum/len+1;
                    }
                }else{
                    if(stations[i-1]+w < stations[i]-w){
                        int sum = (stations[i]-w) - (stations[i-1]+w +1);
                        answer = sum%len == 0 ? answer + sum/len : answer + sum/len+1;
                    }
                }
                if(i == stations.length-1){
                    if(stations[i]+w < n){
                        int sum = n - (stations[i]+w);
                        answer = sum%len == 0 ? answer + sum/len : answer + sum/len+1;
                    }
                }
            }
        }
        return answer  ;
    }

    public static void main(String[] args) {
        SummerWinter_coding3 summerWinter_coding3 = new SummerWinter_coding3();
        System.out.println(summerWinter_coding3.solution(11, new int[]{4,11}, 1));
        System.out.println(summerWinter_coding3.solution(16, new int[]{9}, 2));
    }
}
