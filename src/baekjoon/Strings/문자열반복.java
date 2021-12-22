package baekjoon.Strings;

import java.io.*;

public class 문자열반복 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s1 = bf.readLine();
        int i1 = Integer.parseInt(s1);
        String[] Reader_arr = new String[i1];
        String[] result = new String[i1];
        int[] num = new int[i1];

        for(int i = 0 ; i < i1; i ++){
            Reader_arr[i] = bf.readLine();
            num[i] = Integer.parseInt(Reader_arr[i].split(" ")[0]);
            String[] character = Reader_arr[i].split(" ")[1].split("");
            for(String s : character) {
                for (int j = 0; j < num[i]; j++) {
                    result[i] += s;
                }
            }
        }
        for(int i =0 ; i < i1; i++){
            bw.write(result[i].replace("null",""));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
