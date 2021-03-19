package programers.level2;

import java.util.Arrays;
import java.util.Comparator;

// 2021 KAKAO BLIND : 순위검색
public class 순위검색 {
    public int[] solution(String[] info, String[] query) {

        int info_length = info.length;
        int query_length = query.length;

        String data[][] = new String[query_length][5];
        for(int i = 0 ; i < query_length ; i++){
            int count =0;
            for ( String s : query[i].replace("and ", "").split(" ")){
                data[i][count] = s;
                count++;
            }
        }
        int answer = 0 ;

        Arrays.sort(info, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num = Integer.parseInt(o1.split(" ")[4]);
                int num2 = Integer.parseInt(o2.split(" ")[4]);
                return num2 - num ;
            }
        });

        for(String s[] :data){
            int cols = Integer.parseInt(s[s.length-1]);
            int left = 0, right = info.length, mid = info.length/2;
            while(left > right){
                if(cols > Integer.parseInt(info[mid].split(" ")[4])){
                    
                }else {
                    break;
                }
            }

        }

        return new int[]{};
    }


}
