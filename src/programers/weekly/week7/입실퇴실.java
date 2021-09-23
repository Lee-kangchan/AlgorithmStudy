package programers.weekly.week7;

import java.util.*;

public class 입실퇴실 {
    public int[] solution(int[] enter, int[] leave) {
        int[] answer = new int[enter.length];

        int leave_level = 0 ;
        int enter_level = 0 ;
        int len = leave.length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        Set<Integer> room = new HashSet<>();
        while(leave_level != len || enter_level != len){
           if(leave_level != len && room.contains(leave[leave_level])){

               room.remove(leave[leave_level]);
               leave_level++;
           }
           else if(enter_level != len ){
               map.put(enter_level, new ArrayList<>());
               room.add(enter[enter_level]);
               enter_level++;

               for(Integer i : room){
                   map.get(i).add(i)
                   map.put(i,);
               }
           }
        }
        return answer;
    }

    public static void main(String[] args) {
        입실퇴실 s = new 입실퇴실();
        System.out.println(s.solution(new int[]{1,3,2}, new int[]{1,2,3}));
    }
}
