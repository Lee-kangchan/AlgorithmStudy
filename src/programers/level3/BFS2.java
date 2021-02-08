package programers.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 깊이/너비 우선 탐색(DFS/BFS) 여행경로
public class BFS2 {

    public String[] solution(String[][] tickets) {
        String[] answer = {};
        Queue<target> queue = new LinkedList<>();
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> list = new ArrayList();
        list.add("ICN");
        target target = new target(list, new boolean[tickets.length]);
        queue.add(target);

        while(!queue.isEmpty()){
            target data = queue.poll();
            for(int i = 0 ; i < tickets.length; i++){
                if(tickets[i][0].equals( data.list.get(data.list.size()-1))&& !data.bool[i] ){

                    boolean check[] = new boolean[tickets.length];
                    ArrayList<String> listdata = new ArrayList<>();
                    for(int j = 0 ; j < check.length ; j++){
                        check[j] = data.bool[j];
                    }
                    for(String d : data.list){
                        listdata.add(d);
                    }
                    check[i] = true;
                    listdata.add(tickets[i][1]);
                    target target2 = new target( listdata,check);
                    queue.add(target2);
                }
            }
            if(data.list.size() == tickets.length+1){

                if(result.isEmpty()){
                    result = data.list;
                }else{
                    for(int i = 0 ; i < result.size(); i++){
                        if(data.list.get(i).equals(result.get(i))){
                            continue;
                        }else if(result.get(i).compareTo(data.list.get(i)) > 0){

                            result = data.list;
                            break;
                        }else if(result.get(i).compareTo(data.list.get(i)) < 0){
                            break;
                        }
                    }
                }
            }
        }
        answer = new String[result.size()];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
    class target{
        ArrayList<String> list ;
        boolean bool[] ;
        target(ArrayList list, boolean[] bool){
            this.list = list;
            this.bool = bool;
        }
    }
}
