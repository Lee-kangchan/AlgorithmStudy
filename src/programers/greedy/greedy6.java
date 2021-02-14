package programers.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class greedy6 {
    public int solution(int[][] routes) {
        int answer = 1;

        Arrays.sort(routes, new Comparator<int[]>() {            //가중치 기준으로 오름차순
            @Override
            public int compare(int[] o1, int[] o2) {
                Integer a = o1[0];
                Integer b = o2[0];
                return a.compareTo(b);
            }
        });
        int min = routes[0][0];
        int max = routes[0][1];
        for(int[] i : routes){
            int in = i[0];
            int out = i[1];
            if(in > max || out < min){
                answer ++;
                min = in;
                max = out;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        greedy6 greedy6 = new greedy6();
        System.out.println(greedy6.solution(new int[][]{{-20,15},{-14,-5},{-18,-13},{-5,-3}}));
    }
}
