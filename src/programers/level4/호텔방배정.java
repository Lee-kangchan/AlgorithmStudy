package programers.level4;

import java.util.HashMap;
import java.util.HashSet;

//2019 카카오 개발자 겨울 인턴십
public class 호텔방배정 {
    public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
        HashMap<Long, Long> map = new HashMap<>();
        for(int i = 0 ; i < room_number.length; i++){
           if(map.get(room_number[i]) == null){
               map.put(room_number[i] , room_number[i] + 1);
               answer[i] = room_number[i];
           }else{
               Long t = room_number[i];
               Long num = map.get(t);
               while(true){
                   if(map.get(num)== null ){
                       map.put(t, num);
                       map.put(num, num+1);
                       answer[i] = num;
                       break;
                   }else{
                       num = map.get(num);
                   }
               }
           }
        }
        return answer;
    }

    public static void main(String[] args) {
        호텔방배정 s = new 호텔방배정();
        System.out.println(s.solution(10,new long[]{1,3,4,1,3,1}));
    }
}
