package old.codingTest.UTC2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution4 {
    public int[] solution(String s) {
        int[] answer = {};
        List<String> list = new ArrayList<>();

        String c ="";

        for(int i = 0 ; i < s.length(); i++){
            System.out.print(s.charAt(i));
            if(c.equals("") || c.charAt(0) == s.charAt(i)){
                c += s.charAt(i)+"";
            }else{
                list.add(c);
                c = s.charAt(i)+"";
            }
        }
        list.add(c);
        if(list.get(0).charAt(0) == list.get(list.size()-1).charAt(0) && list.size() >= 2){
            String t = list.get(0) + list.get(list.size()-1);
            list.remove(0);
            list.remove(list.size()-1);
            list.add(0,t);
        }
        answer = new int[list.size()];
        for(int i = 0 ; i < answer.length;i++){

            answer[i] = list.get(i).length();
            System.out.println(answer[i]);
            System.out.println(list.get(i));
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution4 solution4 = new solution4();
        System.out.println(solution4.solution("asdbefas"));
    }
}
