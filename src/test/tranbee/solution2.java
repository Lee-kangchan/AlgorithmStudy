package test.tranbee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class solution2 {
    HashSet<String> set = new HashSet<>();
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            solve(s, s.charAt(i)+"", i+1 );
        }
        for(String st : set){
            System.out.println(st);
        }
        return set.size();
    }

    public void solve(String s, String data, int level ){
        set.add(data);
        if(level+1 > s.length()){
            return;
        }
        if(!data.contains(s.charAt(level)+"")){
            data += s.charAt(level);
            solve(s,data,level+1);
        }
    }
    public static void main(String[] args) {
        solution2 solution2 = new solution2();
        System.out.println(solution2.solution("abac"));
    }
}
