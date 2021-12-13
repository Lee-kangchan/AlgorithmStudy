package programers.weekly.week11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 아이템줍기 {
    public static boolean arr[][];
    public static int[][] arr2;
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        arr2= new int[50][50];

        int X_max = 0 ;
        int Y_max = 0 ;
        for(int i = 0 ; i < rectangle.length; i++){
            X_max = Math.max(X_max, rectangle[i][2]);
            Y_max = Math.max(Y_max, rectangle[i][3]);
            for(int j = rectangle[i][0]; j <= rectangle[i][2]; j++){
                for(int k = rectangle[i][1]; k <= rectangle[i][3]; k++){
                    arr2[k][j]++;
                }
            }
        }

        Queue<List<Integer>> queue =new LinkedList<>();
        queue.add(Arrays.asList(characterX, characterY, 0));

        while(!queue.isEmpty()){
            List<Integer> ball = queue.poll();
            if(ball.get(1) == itemY && ball.get(0) == itemX){
                return ball.get(2);
            }

            if(ball.get(1)-1 >= 0 && arr[ball.get(1)-1][ball.get(0)]){
                queue.add(Arrays.asList(ball.get(0), ball.get(1)-1, ball.get(2)+1));
            }
            if(ball.get(1)+1 <= 49 && arr[ball.get(1)+1][ball.get(0)]){
                queue.add(Arrays.asList(ball.get(0), ball.get(1)+1, ball.get(2)+1));
            }
            if(ball.get(0)-1 >= 0 && arr[ball.get(1)][ball.get(0)-1]){
                queue.add(Arrays.asList(ball.get(0)-1, ball.get(1), ball.get(2)+1));
            }
            if(ball.get(0)+1 <= 49 && arr[ball.get(1)][ball.get(0)+1]){
                queue.add(Arrays.asList(ball.get(0)+1, ball.get(1), ball.get(2)+1));
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        아이템줍기 s = new 아이템줍기();
        System.out.println(s.solution(new int[][]{{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}},1,3,7,8));
    }
}
