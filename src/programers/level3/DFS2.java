package programers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// 깊이/너비 우선 탐색(DFS/BFS) 여행경로
public class DFS2 {
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        solve(tickets, "ICN", new boolean[tickets.length], -1, list);

        answer = new String[list.size()];

        for(int i = 0 ; i < answer.length; i++){

            answer[i] = list.get(i);
        }
        return answer;
    }
    ArrayList<String> list = new ArrayList<>();
    public void solve(String[][] tickets , String current, boolean[] bool, int bool_Check, ArrayList<String> arr){

        boolean[] check = new boolean[bool.length];
        for(int i = 0 ; i < bool.length; i++){
            check[i] = bool[i];
        }
        ArrayList<String> l = new ArrayList<>();
        for(String i : arr){
            l.add(i);
        }
        if(bool_Check != -1){
            check[bool_Check] = true;
        }

        l.add(current);
        for(int i = 0 ; i < tickets.length ; i++){
            if(tickets[i][0].equals(current) && !check[i]){
                solve(tickets, tickets[i][1], check, i, l );
            }
        }

        if(tickets.length+1 == l.size()){

            if(list.isEmpty()){
                list = l;
            }
            else{
                for(int i = 0 ; i < arr.size(); i++){
                    if(list.get(i).equals(l.get(i))){
                        continue;
                    }else if(l.get(i).compareTo(list.get(i)) < 0){
                        list = l;
                        break;
                    }else if(l.get(i).compareTo(list.get(i)) > 0){
                        break;
                    }
                }
            }
        }
        return;
    }
    public static void main(String[] args) {
        DFS2 dfs = new DFS2();
        System.out.println(dfs.solution(new String[][]{{"ICN","JFK"},{"HND","IAD"},{"JFK","HND"}}));
    }
}
