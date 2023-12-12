package old.programers.weekly.week6;

import java.util.Arrays;
import java.util.Comparator;

public class 복서정렬하기 {
    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        String[] data = new String[weights.length];
        for(int i = 0 ; i < weights.length; i++){
            int win = 0;
            int best_win = 0;
            int lose = 0;
            String point = "";
            data[i] = String.valueOf(i+1) + " ";
            for(int j = 0 ; j < weights.length; j++){
                if( head2head[i].charAt(j) == 'W'){
                    win ++;
                    if(weights[i] < weights[j]){
                        best_win ++;
                    }
                }else if(head2head[i].charAt(j) == 'N'){

                }else if(head2head[i].charAt(j) == 'L'){
                    lose ++;
                }
            }
            point = win == 0  && lose == 0 ? "0" : String.valueOf(win/(double)(win+lose));

            data[i] += point +" ";
            data[i] += best_win + " ";
            data[i] += weights[i];
        }
        Arrays.sort(data, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Double data = Double.valueOf(o1.split(" ")[1]);
                Double data2 = Double.valueOf(o2.split(" ")[1]);
                if(data.equals(data2)){
                    int best_win1 = Integer.parseInt(o1.split(" ")[2]);
                    int best_win2 = Integer.parseInt(o2.split(" ")[2]);
                    if(best_win1 == best_win2){
                        int weight1 = Integer.parseInt(o1.split(" ")[3]);
                        int weight2 = Integer.parseInt(o2.split(" ")[3]);
                        return weight1 - weight2;
                    }
                    return best_win2-best_win1;
                }
                return data2.compareTo(data);
            }
        });
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = Integer.parseInt(data[i].split(" ")[0]);
        }
        return answer;
    }

    public static void main(String[] args) {
        복서정렬하기 s = new 복서정렬하기();
        System.out.println(s.solution(new int[]{50,82,75,120}, new String[]{"NLWL","WNLL","LWNW","WWLN"}));
    }
}
