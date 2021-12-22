package baekjoon.dp;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class 파도반수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long[] arr = new Long[102];
        arr[1] = 1L;
        arr[2] = 1L;
        arr[3] = 1L;
        arr[4] = 2L;
        arr[5] = 2L;

        for(int i = 6; i < 102; i++){
            arr[i] = dp(i, arr);
        }
        int i = Integer.parseInt(br.readLine());
        int[] test = new int[i];
        for(int j = 0 ; j < i ; j ++){
            test[j] = Integer.parseInt(br.readLine());
            bw.write(arr[test[j]]+"");
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
    public static Long dp(int i, Long[] arr){
        if(arr[i] != null){
            return arr[i];
        }
        return dp(i-2,arr) + dp(i-3,arr);
    }
}
