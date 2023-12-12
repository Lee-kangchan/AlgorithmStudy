package old.baekjoon.Recursion.src;

import java.io.*;
public class 더하기123 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < cnt; i++){
            int data = Integer.parseInt(br.readLine());
            bw.write(recursion(data,0)+"");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    public static int recursion(int len, int data){
        int cnt = 0 ;
        if(data == len){
            return 1;
        }
        for(int i = 1; i <= 3 ; i++){
            if(len >= data+i) {
                cnt += recursion(len, data + i);
            }
        }
        return cnt;
    }
}
