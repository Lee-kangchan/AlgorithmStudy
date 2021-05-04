package programers.level4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//2019 카카오 개발자 겨울 인턴십
public class 호텔방배정 {
    public long[] solution(long k, long[] room_number) {
        int len = room_number.length;
        long[] answer = new long[len];
        HashMap<Long, Long> map = new HashMap<>();
        for(int i = 0 ; i < len; i++){
           if(map.get(room_number[i]) == null){
               map.put(room_number[i] , room_number[i] + 1);
               answer[i] = room_number[i];
           }else{
               Long t = room_number[i];
               Long num = map.get(t);
               List<Long> list = new ArrayList<>();
               list.add(t);
               list.add(num);
               while(true){
                   if(map.get(num)== null ){
                       for(Long l : list){
                           map.put(l, num+1);
                       }
                       answer[i] = num;
                       break;
                   }else{
                       num = map.get(num);
                       list.add(num);
                       System.out.println(t);

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
