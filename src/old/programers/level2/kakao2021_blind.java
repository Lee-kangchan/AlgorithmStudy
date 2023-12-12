package old.programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//메뉴 리뉴얼
public class kakao2021_blind {
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < orders.length; i++){
            HashSet<String> set = new HashSet<>();
            char[] charArr = orders[i].toCharArray();
            Arrays.sort(charArr);
            String result = new String(charArr);
            solve(set, course, result);
            for(String s : set){

                if(map.get(s)==null){
                    map.put(s,1);
                }
                else{
                    map.put(s,map.get(s)+1);
                }
            }
        }
        HashMap<Integer, String> map2 = new HashMap<>();
        HashMap<Integer, Integer> map3 = new HashMap<>();
        for(String s : map.keySet()){
               for(int i : course){

                   if(i == s.length() && map.get(s) != 1){

                       System.out.println("map: " + s +"- "+ map.get(s) + " map2: " + map2.get(i) + " map3: " + map3.get(i)  );
                       if(map2.get(i)== null){
                           map2.put(i , s);
                           map3.put(i , map.get(s));
                       }else{
                           if(map3.get(i) > map.get(s)){
                           }else if(map3.get(i) == map.get(s)){
                               map2.put(i, map2.get(i) +"-"+s);
                           }else{
                               map2.put(i , s);
                               map3.put(i , map.get(s));
                           }
                       }
                   }
               }
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i : map2.keySet()){
            String[] s = map2.get(i).split("-");
            for(int j = 0 ; j < s.length ; j++){
                if(map3.get(i)!=1) {
                    list.add(s[j]);
                }
            }
        }
        answer = new String[list.size()];
        for(int i = 0 ; i < answer.length ; i ++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
    public void solve(HashSet<String> set, int[] course, String data){

        if(data.length() == 1){
            return;
        }

        for(int j : course){
            if(j == data.length()){
                set.add(data);
            }
        }
        for(int i = 0 ; i <data.length(); i++){
            String data2 = data.substring(0, i) + data.substring(i+1);
            solve(set, course, data2);
        }
    }

    public static void main(String[] args) {
        kakao2021_blind kakao2021_blind = new kakao2021_blind();
        System.out.println(kakao2021_blind.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2,3,4}));
//        System.out.println(kakao2021_blind.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2,3,4}));
    }
}
