package programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

//튜플
public class kakao2019_intership {
    public int[] solution(String s) {
        int[] answer = {};
        String data = s.replace("{{", "{").replace("}}", "}");
        String[] data2 = data.split("},");
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(data2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });


        for(int i = 0 ; i < data2.length; i++){
            System.out.println(data2[i]);
            data2[i] = data2[i].replace("{","").replace("}","");

            String[] data3 = data2[i].split(",");
            for(int j = 0 ; j< data3.length ;j++){
                boolean check = false;
                for(String str : list){
                    if(str.equals(data3[j])){
                        check = true;
                        break;
                    }
                }
                if(!check){
                    list.add(data3[j]);
                }
            }
        }
        answer = new int[list.size()];
        int count=0;
        for(String str : list){
            answer[count] = Integer.parseInt(str);
            count++;
        }
        return answer;
    }

    public static void main(String[] args) {
        kakao2019_intership kakao = new kakao2019_intership();
        System.out.println(kakao.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
    }
}
