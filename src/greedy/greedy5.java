package greedy;

import java.util.Arrays;
import java.util.Comparator;

// 섬 연결하기
public class greedy5 {
    public int find(int arr[] , int node){
        if(arr[node] == node){ //지금
            return node;
        }else{
            return arr[node] = find(arr, arr[node]);
        }
    }
    public int solution(int n, int[][] costs) {
        int answer = 0;
        Arrays.sort(costs, new Comparator<int[]>() {            //가중치 기준으로 오름차순
            @Override
            public int compare(int[] o1, int[] o2) {
                Integer a = o1[2];
                Integer b = o2[2];
                return a.compareTo(b);
            }
        });
        int head[] = new int[n];
        for(int i = 0; i < n; i++){
            head[i] = i;
        }
        for(int i = 0 ; i < costs.length; i++){
            int first = find(head, costs[i][0]);
            int second = find(head, costs[i][1]);
            if(first != second){
                head[second] = first;
                answer += costs[i][2];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        greedy5 greedy5 = new greedy5();
        System.out.println(greedy5.solution(4,new int[][]{{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}}));
        System.out.println(greedy5.solution(4,new int[][]{{0,1,5},{1,2,3},{2,3,3},{3,1,2},{3,0,4}}));
        System.out.println(greedy5.solution(5,new int[][]{{0,1,5},{1,2,3},{2,3,3},{3,1,2},{3,0,4},{2,4,6},{4,0,7}}));
    }
}
