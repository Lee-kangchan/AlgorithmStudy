package test.tranbee;

import java.util.*;

public class solution1 {
    public String solution(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        List<Character> list =new ArrayList<>();
        String answer = "";
        s = s.toLowerCase(Locale.ROOT);

        for(int i =0 ; i < s.length(); i++){
            if(map.get(s.charAt(i)) == null) map.put(s.charAt(i), 0);
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        int cnt = 0 ;
        for(char i : map.keySet()){
            if(cnt > map.get(i)) continue;
            else if(cnt == map.get(i)) list.add(i);
            else {
                cnt = map.get(i);
                list = new ArrayList<>();
                list.add(i);
            }
        }
        Collections.sort(list);

        for(char c : list){
            answer += c+"";
        }

        return answer;

    }
}
