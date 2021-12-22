package baekjoon.greedy;

import java.io.*;
import java.util.*;

public class 회의실배정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int count = 0;
        int[][] data = new int[cnt][2];
        for(int i = 0 ; i < cnt; i++){
            String d[] = br.readLine().split(" ");
            data[i][0] = Integer.parseInt(d[0]);
            data[i][1] = Integer.parseInt(d[1]);
        }

        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });
        int end = 0;
        System.out.println(end);
        count = 1;
        for(int i = 0 ; i < cnt; i++){
            if(end <= data[i][0]){
                end = data[i][1];
                count++;
            }
        }



        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}
