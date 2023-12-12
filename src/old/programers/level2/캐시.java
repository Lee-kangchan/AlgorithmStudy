package old.programers.level2;

import java.util.*;

// 2018 KAKAO BLIND : 캐시
public class 캐시 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        if(cacheSize==0) return cities.length * 5;
        for(String s: cities){
            String city = s.toLowerCase();
            if(list.contains(city)){
                list.remove(city);
                list.add(0,city);
                answer++;
            }else{
                if(list.size() == cacheSize){
                    list.remove(list.size()-1);
                }
                list.add(0,city);
                answer+=5;
            }
        }

        return answer;
    }
}
