package programers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//2019 KAKAO BLIND : 오픈채팅방
public class 오픈채팅방 {
    public String[] solution(String[] record) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(String s : record){
            String data[] = s.split(" ");
            if(data[0].equals("Enter")){
                if(!set.contains(data[1])) {
                    list.add(data[1] + " on");
                    map.put(data[1], data[2]);
                    set.add(data[1]);
                }

            }
            else if(data[0].equals("Leave")){
                if(set.contains(data[1])) {
                    set.remove(data[1]);
                    list.add(data[1] + " off");
                }
            }else if(data[0].equals("Change")){
                map.put(data[1], data[2]);
            }
        }
        answer = new String[list.size()];
        for(int i = 0 ; i < answer.length; i++){
            String data[] = list.get(i).split(" ");
            if(data[1].equals("on")){
                String name = map.get(data[0]);
                answer[i] = name + "님이 들어왔습니다.";
            }else if(data[1].equals("off")){
                String name = map.get(data[0]);
                answer[i] = name + "님이 나갔습니다.";
            }
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        오픈채팅방 kakao = new 오픈채팅방();
        System.out.println(kakao.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"}));
    }
}
