package old.programers.level2;

import java.util.Arrays;
import java.util.Comparator;

// 2021 KAKAO BLIND : 순위검색
public class 순위검색 {
    public int[] solution(String[] info, String[] query) {

        int info_length = info.length;
        int query_length = query.length;

        String info_arr[][] = new String[info_length][2];
        String query_arr[][] = new String[query_length][2];
        for(int i = 0 ; i < info_length; i++){
            info_arr[i][1] = info[i].split(" ")[4];
            info[i] = info[i].replace(info_arr[i][1],"").replace(" ", "");
            info_arr[i][0] = info[i];

        }
        int answer[] = new int[query_length];
        Arrays.sort(info_arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
            }
        });
        for(int i = 0 ; i < query_length; i++){
            query[i]= query[i].replace(" and ", "");
            query_arr[i] = query[i].split(" ");
            query_arr[i][0] = query_arr[i][0].replace("-", "");
            int start = 0;
            int end = info_length-1;
            int mid = info_length/2;
            while(start < end){
                if(Integer.parseInt(info_arr[mid][1]) > Integer.parseInt(query_arr[i][1])){
                    end = mid-1;
                }
                else {
                    start = mid + 1;
                }
                mid = (start + end) / 2;
            }
            for(int j = 0 ; j < info_length; j++){
                if(info_arr[j][0].contains(query_arr[i][0])){
                    answer[i]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        순위검색 s = new 순위검색();
        System.out.println(s.solution(new String[]{"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"},
                new String[]{"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"}));
    }

}