package programers.level1;

import java.util.ArrayList;

//압축
public class kakao2018_blind3 {
    public int[] solution(String msg) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        String current="", next=msg.charAt(0)+"";
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0 ; i <= 'Z'- 'A' ; i++){
            list.add((char)('A'+i)+"");
        }
        int count = 0;
        while(msg.length()>=count+1){
            current += next;
            if(count+1 < msg.length()) {
                next = msg.charAt(count + 1) + "";
            }else{
                for(int j = 0 ; j<list.size();j++){
                    if(list.get(j).equals(current)){
                        result.add(j+1);
                    }
                }
                list.add(current+next);

                System.out.println(current);
                current = "";
            }
            count++;
            if(list.contains(current+next)){
                continue;
            }else{
                for(int j = 0 ; j<list.size();j++){
                    if(list.get(j).equals(current)){
                        result.add(j+1);
                    }
                }
                list.add(current+next);

                System.out.println(current);
                current = "";
            }
        }
        answer = new int[result.size()];
        for(int i = 0 ; i < answer.length;i ++){
            answer[i] = result.get(i);
            System.out.print(result.get(i) + " " );
        }
        return answer;
    }

    public static void main(String[] args) {
        kakao2018_blind3  kakao = new kakao2018_blind3();
        System.out.println(kakao.solution("AAAAAAA"));
    }
}
