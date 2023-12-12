package old.programers.weekly.week4;

import java.util.HashMap;
import java.util.Map;

public class 직업군추천하기 {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "CONTENTS";
        Map<String, Integer> map = new HashMap<>();
        for(String s : table){
            String [] language = s.split( " ");
            map.put(language[0], 0);
            for(int j = 0 ; j < language.length; j++){
                for(int i = 0 ; i < languages.length; i++){
                    if(language[j].equals(languages[i])){
                        map.put(language[0], map.get(language[0]) + preference[i]*(6-j));

                    }
                }
            }

            System.out.println(map.get(language[0]));
        }
        answer = map.get(answer) >= map.get("GAME") ? answer : "GAME";
        answer = map.get(answer) >= map.get("HARDWARE") ? answer : "HARDWARE";
        answer = map.get(answer) >= map.get("PORTAL") ? answer : "PORTAL";
        answer = map.get(answer) >= map.get("SI") ? answer : "SI";

        return answer;
    }

    public static void main(String[] args) {
        직업군추천하기 a = new 직업군추천하기();
        String[] table = new String[]{"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] lan = new String[]{"PYTHON", "C++", "SQL"};
        int[] preference = new int[]{7,5,5};
        System.out.println(a.solution(table,lan,preference));
    }
}
