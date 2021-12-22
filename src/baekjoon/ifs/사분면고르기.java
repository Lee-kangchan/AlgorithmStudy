package baekjoon.ifs;

import java.io.*;

public class 사분면고르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s1 = bf.readLine();
        String s2 = bf.readLine();

        if(s1.contains("-") && s2.contains("-")) bw.write("3");
        else if (s1.contains("-")) bw.write("2");
        else if (s2.contains("-")) bw.write("4");
        else bw.write("1");

        bw.flush();
        bw.close();
    }
}
