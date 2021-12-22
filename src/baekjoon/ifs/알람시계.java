package baekjoon.ifs;

import java.io.*;

public class 알람시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s1 = bf.readLine();

        int S = Integer.parseInt(s1.split(" ")[0]);
        int M = Integer.parseInt(s1.split(" ")[1]);


        bw.write(solution(S,M));
        bw.flush();
        bw.close();
    }

    public static String solution (int S, int M){

        M = M - 45;
        if(M < 0){
            M = M + 60;
            S = S -1;
            if(S < 0){
                S = 23;
            }
        }



        return S+" "+M;
    }
}
