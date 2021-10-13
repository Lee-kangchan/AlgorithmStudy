package programers.weekly.week10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// 기울기가 다르면 교점이 생긴다.
// C의 값에 따라 교점이 생긴다.
public class 교점에별만들기 {


    public static int X_max = Integer.MIN_VALUE , X_min = Integer.MAX_VALUE, Y_max = Integer.MIN_VALUE, Y_min = Integer.MAX_VALUE;
    public String[] solution(int[][] line) {

        String[] answer = {};
        HashSet<List<Integer>> list = new HashSet<>();
        for(int i = 0; i < line.length; i++){
            for(int j = i+1 ; j < line.length; j++){
                long low = (((long)line[i][0] * (long)line[j][1]) - ((long)line[i][1] * (long)line[j][0]));
                if(low == 0 ) continue;
                double X= (double) ((long)(line[i][1] * line[j][2]) - (line[i][2] * line[j][1])) / (double) low;
                double Y= (double) ((line[i][2] * line[j][0]) - (line[i][0] * line[j][2])) / (double) low;
                if(X % 1 != 0 || Y % 1 != 0) continue;

                List<Integer> data = Arrays.asList((int)X,(int)Y);
                X_max = X_max > (int)X ? X_max : (int)X;
                X_min = X_min < (int)X ? X_min : (int)X;
                Y_max = Y_max > (int)Y ? Y_max : (int)Y;
                Y_min = Y_min < (int)Y ? Y_min : (int)Y;
                if(!list.contains(data)){
                    list.add(data);
                }
            }
        }
        answer = new String[Y_max - Y_min +1];
        int cnt =0;
        for(int i = Y_max ; i >= Y_min ; i--){
            StringBuilder sb = new StringBuilder();
            for(int j = X_min ; j <= X_max ; j++){
                sb.append(".");
            }
            answer[cnt] = sb.toString();
            cnt++;
        }

        for(List<Integer> s : list){

            StringBuilder sb = new StringBuilder(answer[Y_max - s.get(1)]);
            sb.setCharAt(s.get(0) - X_min,'*');
            answer[Y_max - s.get(1)] = sb.toString();
        }

        return answer;
    }


    public static void main(String[] args) {
        교점에별만들기 s = new 교점에별만들기();
        System.out.println(s.solution(new int[][]{{2, -1, 4}, {-2, -1, 4},{0, -1, 1},{5, 8, 12}, {5, -8, -12}}));
//        System.out.println(s.solution(new int[][]{{0,1,-1}, {1,0,-1}, {1,0,1}}));
    }

}
