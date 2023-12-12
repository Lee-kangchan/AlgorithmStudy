package old.programers.level3;

import java.util.*;

// 2019 카카오 개발자 겨울 인턴십 : 불량 사용자
public class 불량사용자 {
    public int solution(String[] user_id, String[] banned_id) {


        solve(user_id, banned_id, 0, "", new HashSet<>());
        return data;
    }
    int data = 0 ;
    ArrayList<HashSet<String>> al = new ArrayList<>();
    public void solve(String[] user_id, String[] banned_id, int count, String id, HashSet<String> set){

        HashSet<String> set1 = new HashSet<>();
        for(String set2 : set){
            set1.add(set2);
        }
        set1.add(id);

        if(count >= banned_id.length ){
            for(HashSet<String> hs : al){
                int count2 = 0;
                for(String s : set1){
                    if(hs.contains(s)){
                        count2++;
                    }
                }
                if(count2==set1.size()){
                    return;
                }
            }
            al.add(set1);

            for(String s : set1){
                System.out.print(s + " ");
            }
            System.out.println();
            data++;
            return;
        }

        for(int i = 0 ; i < user_id.length; i++){
            if(set1.contains(user_id[i])){
                continue;
            }


            if(banned_id[count].length() == user_id[i].length()){
                boolean check = false;
                for(int j = 0 ; j < banned_id[count].length(); j++){
                    if(banned_id[count].charAt(j) == '*' || banned_id[count].charAt(j) == user_id[i].charAt(j)){
                        continue;
                    }
                    else{
                        check = true;
                        break;
                    }
                }
                if(!check){
                    solve(user_id, banned_id, count+1, user_id[i], set1);
                }
            }
        }
    }
}
