package baekjoon.dp;

import java.io.*;

public class 파보나치함수 {

    static int one = 0 ;
    static int zero = 0 ;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String arr[] = new String[Integer.parseInt(s)];

        String result[] = new String[Integer.parseInt(s)];

        for(int i =0  ;i < arr.length ; i++){
            arr[i] = br.readLine();
            fibonacci(Integer.parseInt(arr[i]));
            result[i] = zero + " " + one;
            bw.write(result[i]);
            bw.newLine();

        }
        bw.flush();
        bw.close();


    }

    public static void fibonacci(int n) {

        int data = 1;
        int data2 = 0;
        int data3 = 1;
        for(int i = 0 ; i < n; i ++){
           data = data2;
           data2 = data3;
           data3 = data2+ data;
       }
        zero = data;
        one = data2;
    }
}
