package baekjoon.dp;

import java.io.*;
import java.util.HashSet;

public class 타일01 {
    static int answer = 0 ;
    static HashSet<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int data = Integer.parseInt(br.readLine());

        if(data== 1) {
            bw.write("1");
            bw.flush();
            bw.close();
            return;
        }else if(data ==2){

            bw.write("2");
            bw.flush();
            bw.close();
            return;
        }
        int first = 0;
        int second = 1;
        int answer = 2;

        for(int i = 3 ; i <= data; i++){
            first = second;
            second = answer;
            answer = (first+second) % 15746;
        }
        bw.write(answer+"");
        bw.flush();
        bw.close();
    }
}
