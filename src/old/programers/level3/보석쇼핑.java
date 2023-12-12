package old.programers.level3;

import java.util.*;

// 2020 카카오 인턴십 보석 쇼핑
public class 보석쇼핑 {
    public int[] solution(String[] gems) {
        int[] answer = {};
        HashSet<String> set = new HashSet<>();
        Map<String , Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int length = Integer.MAX_VALUE;
        for(String gem : gems){
            set.add(gem);
        }
        int SP=0;
        int start = 0;
        Queue<String> queue = new LinkedList<>();
        for(int i = 0; i < gems.length; i++){
            if(!map.containsKey(gems[i])) map.put(gems[i], 1);
            else map.put(gems[i],map.get(gems[i])+1);
            queue.add(gems[i]);

            while(true){
                String temp = queue.peek();
                if(map.get(temp) > 1){
                    map.put(temp, map.get(temp)-1);
                    queue.poll();
                    SP++;
                }else{
                    break;
                }
            }
            if(map.size() == set.size() && length > queue.size()){
                length = queue.size();
                start = SP;
            }
        }

        return new int[]{start+1,start + length};
    }
    public static void main(String[] args) {
        보석쇼핑 s = new 보석쇼핑();
//        System.out.println(s.solution(new String[]{"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"}));
//        System.out.println(s.solution(new String[]{"AA", "AB", "AC", "AA", "AC"}));
//        System.out.println(s.solution(new String[]{"XYZ", "XYZ", "XYZ"}));
//        for(int i : s.solution(new String[]{"XYZ","XYZ","XYZ"})){
//            System.out.println(i);
//        }
        for(int i : s.solution(new String[]{"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"})){
            System.out.println(i);
        }
    }
}
