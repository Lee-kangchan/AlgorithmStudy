package baekjoon.Recursion.src;

import java.io.*;
import java.util.Arrays;

public class 암호만들기 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] output = br.readLine().split(" ");
        int L = Integer.parseInt(output[0]);
        String[] data = br.readLine().split(" ");
        Arrays.sort(data);
        solve(data, "", L, 0);

    }

    public static void solve(String[] data, String result, int cnt, int level) throws IOException {

        if(result.length() == cnt){
            for(int i = 0 ; i < cnt; i++){
                switch (result.charAt(i)){
                    case 'a':
                    case 'i':
                    case 'e':
                    case 'o':
                    case 'u':
                        if(result.replace("a","").replace("i","").replace("e","")
                                .replace("o","")
                                .replace("u","")
                                .length()>=2)
                        System.out.println(result);
                        return;
                }
            }
        }

        for(int i = level ; i < data.length; i++){
            solve(data, result + data[i], cnt, i+ 1);
        }
    }
}
