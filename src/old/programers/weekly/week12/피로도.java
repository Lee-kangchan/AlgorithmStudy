package old.programers.weekly.week12;

import java.util.HashSet;

public class 피로도 {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {


        for(int i = 0 ; i < dungeons.length; i++){
            HashSet<Integer> set = new HashSet<>();
            set.add(i);
            dfs(dungeons, k- dungeons[i][1], set);
        }
        return answer;
    }
    public void dfs(int[][] dungeons, int k, HashSet<Integer> set){

        for(int i = 0 ; i < dungeons.length; i++){
            if(k >= dungeons[i][0] && !set.contains(i)){
                HashSet<Integer> set2 = (HashSet<Integer>) set.clone();
                set2.add(i);
                dfs(dungeons, k- dungeons[i][1], set2);
            }else{
                answer = answer > set.size() ? answer : set.size();
            }
        }

    }
}
