package programers.level3;

import java.util.*;

// 월간 챌린지 시즌 2 모두 0으로 만들기
//Q : ArrayList는 안되고 왜 List는 가능할까 ?
public class 모두0으로만들기 {
    public long solution(int[] a, int[][] edges) {
        long answer = 0 ;
        long[] data = new long[a.length];
        int check = 0 ;
        for(int i = 0 ; i <a.length; i++){
            check += a[i];
            data[i] = a[i];
        }
        if(check != 0) return -1;

        ArrayList<Integer> list[] = new ArrayList[a.length];
        for(int i = 0 ; i <a.length; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < edges.length; i++){
            int[] e = edges[i];
            list[e[0]].add(e[1]);
            list[e[1]].add(e[0]);
        }
        return solve(list, data, 0 , -1);
    }
    public static long solve(List<Integer>[] list, long[] data, int now, int pre){
        long l = 0 ;

        for(int i = 0 ; i < list[now].size(); i++){
            int next = list[now].get(i);
            if(next != pre){
                l += solve(list, data, next, now);
            }
        }
        if(pre != -1) data[pre] += data[now];

        return l + Math.abs(data[now]);
    }
    public static void main(String[] args) {
        모두0으로만들기 s = new 모두0으로만들기();
        System.out.println(s.solution(new int[]{-5,0,2,1,2},new int[][]{{0,1},{3,4},{2,3},{0,3}}));
    }

}
