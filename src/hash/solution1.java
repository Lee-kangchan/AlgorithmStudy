package hash;

import java.util.HashMap;
import java.util.HashSet;

public class solution1 {
    HashMap<String ,Object> map = new HashMap<>();

}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        HashSet<String> t = new HashSet<String>();
        for(int i=0; i<genres.length; i++) {
            t.add(genres[i]);
            if(map.get(genres[i])==null) {
                map.put(genres[i],i);
                map2.put(genres[i], i);
                result.put(genres[i],plays[i]);
                continue;
            }
            else if(plays[map.get(genres[i])]<plays[i]) {
                map2.put(genres[i], map.get(genres[i]));
                map.put(genres[i], i);
            }
            else if(plays[map.get(genres[i])]==plays[i]) {
                map2.put(genres[i], map.get(i));
            }
            else if(plays[map2.get(genres[i])]<plays[i]) {
                map2.put(genres[i], i);
            }
            result.put(genres[i], result.get(genres[i])+plays[i]);
        }
        int count =0;

        int[] leng = new int[map.size()+map2.size()];
        while(t.isEmpty()==false){

            int Max = 0 ;
            String name = null ;
            for(String i : t) {
                if(Max < result.get(i)) {
                    Max = result.get(i);
                    name = i;
                }
            }
            leng[count] = map.get(name);
            count++;
            if(map2.get(name)!=null) {
                leng[count] = map2.get(name);
                count++;}
            result.remove(name);
            t.remove(name);
        }
        answer = leng;

        return answer;
    }
}
class Solution1 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        HashSet<String> t = new HashSet<String>();
        for(int i=0; i<genres.length; i++) {
            t.add(genres[i]);
            if(map.get(genres[i])==null) {
                map.put(genres[i],i);
                map2.put(genres[i], i);
                result.put(genres[i],plays[i]);
                continue;
            }
            else if(plays[map.get(genres[i])]<plays[i]) {
                map2.put(genres[i], map.get(genres[i]));
                map.put(genres[i], i);
            }
            else if(plays[map.get(genres[i])]==plays[i]) {
                map2.put(genres[i], map.get(i));
            }
            else if(plays[map2.get(genres[i])]<plays[i]) {
                map2.put(genres[i], i);
            }
            result.put(genres[i], result.get(genres[i])+plays[i]);
        }
        int count =0;

        int[] leng = new int[map.size()+map2.size()];
        while(t.isEmpty()==false){

            int Max = 0 ;
            String name = null ;
            for(String i : t) {
                if(Max < result.get(i)) {
                    Max = result.get(i);
                    name = i;
                }
            }
            leng[count] = map.get(name);
            count++;
            if(map2.get(name)!=null) {
                leng[count] = map2.get(name);
                count++;}
            result.remove(name);
            t.remove(name);
        }
        answer = leng;

        return answer;
    }
}