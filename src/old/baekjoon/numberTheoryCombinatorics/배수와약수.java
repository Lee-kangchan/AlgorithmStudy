package old.baekjoon.numberTheoryCombinatorics;

import java.io.*;

// 5086문제
public class 배수와약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String[] data = br.readLine().split(" ");
            if(data[0].equals("0") && data[1].equals("0")){
                break;
            }else {
                bw.write(compare(Integer.parseInt(data[0]), Integer.parseInt(data[1])));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }

    public static String compare(int a, int b){
        if(a>b){
            return a % b != 0 ? "neither" : "multiple";
        }else{
            return b % a != 0 ? "neither" : "factor";

        }
    }
}
