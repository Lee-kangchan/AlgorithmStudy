package test.tranbee;

import java.util.*;

public class solution3 {
    public int[] solution(int[] grade) {
        HashSet<Integer> score = new HashSet<>();
        HashMap<Integer, Integer> rank = new HashMap<>();
        HashMap<Integer, Integer> people = new HashMap<>();
        int[] Ranking = new int[grade.length];

        for(int i = 0 ; i< grade.length ; i++){
            score.add(grade[i]);
            if(people.get(grade[i]) == null) people.put(grade[i],0);
            people.put(grade[i],people.get(grade[i])+1);

        }
        Integer[] rank_score = score.toArray(new Integer[0]);
        Arrays.sort(rank_score, Collections.reverseOrder());

        int peoples=0;
        for(int i=0; i < rank_score.length; i++){
            rank.put(rank_score[i], peoples+1);
            peoples += people.get(rank_score[i]);
        }

        for(int i = 0 ; i< grade.length ; i++){
           Ranking[i] = rank.get(grade[i]);

        }
        return Ranking;
    }
}
