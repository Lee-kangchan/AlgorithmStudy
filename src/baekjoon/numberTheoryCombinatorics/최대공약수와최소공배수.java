package baekjoon.numberTheoryCombinatorics;

import java.io.*;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] data = br.readLine().split(" ");

        int first = Integer.parseInt(data[0]);
        int second = Integer.parseInt(data[1]);


        //최소공배수
        int min = first;
        while(first % min != 0 || second % min != 0){
            min--;
        }

        //최대공배수
        int max = first;
        while(max % first != 0 || max % second != 0){
            max += first;
        }
        bw.write(min +"");
        bw.newLine();
        bw.write(max+"");
        bw.flush();
        bw.close();
    }
}
