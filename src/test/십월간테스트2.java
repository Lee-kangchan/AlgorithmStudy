package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 십월간테스트2 {
    public int[] solution(int n, long left, long right) {
        int len =(int)(right - left);
        int[] answer = new int[len+1];
        int left_row = (int)(left/n+1);
        int left_col = (int)(left%n+1);
        int  right_row = (int)(right/n+1);
        int right_col = (int)(right%n+1);
        int cnt=0;
        for(int i=left_row; i <= right_row; i ++){
            if(left_row == right_row){
                for(int j = left_col ; j <= right_col; j++){
                    answer[cnt] = (i >= j ? i: j);
                    cnt++;
                }
            }
            else if(i == left_row){

                for(int j = left_col ; j <= n; j++){
                    answer[cnt] = (i >= j ? i: j);
                    cnt++;
                }
            }else if(i == right_row){
                for(int j = 1; j <= right_col; j++){
                    answer[cnt] =(i >= j ? i: j);
                    cnt++;
                }
            }else {
                for (int j = 1; j <= n; j++) {
                    answer[cnt] = (i >= j ? i : j);
                    cnt++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        십월간테스트2 s = new 십월간테스트2();
        System.out.println(s.solution(5858583,4444,55555));
    }
}
