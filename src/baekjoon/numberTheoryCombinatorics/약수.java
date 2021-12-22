package baekjoon.numberTheoryCombinatorics;

import java.io.*;
import java.util.Arrays;

//약수는 첫과 끝을 곱
public class 약수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int result= 0 ;
        int IntegerData[] = new int[cnt];
        String[] data = br.readLine().split(" ");
        for(int i=0 ; i < cnt; i++){
            IntegerData[i] = Integer.parseInt(data[i]);
        }
        Arrays.sort(IntegerData);

        bw.write(IntegerData[0]*IntegerData[cnt-1] +"");
        bw.flush();
        bw.close();

    }
}
