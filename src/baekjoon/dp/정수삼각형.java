package baekjoon.dp;

import java.io.*;

public class 정수삼각형 {
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int data[][] = new int[count][count];
        for(int i =0 ; i < count ; i++){
            String d[] = br.readLine().split(" ");
            for(int j = 0 ; j < d.length; j++){
                data[i][j] = Integer.parseInt(d[j]);
            }
        }
        dp(data, count-1);
        for(int i = 0 ; i < count ; i++){
            for(int j = 0 ; j <= i ; j ++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
        bw.write(data[0][0]+"");
        bw.flush();
        bw.close();
    }

    public static void dp(int[][] data, int layer){
        if(layer == 0 ) return;
        for(int i = 0 ; i < layer; i++){
            data[layer-1][i] += data[layer][i] > data[layer][i+1] ? data[layer][i] : data[layer][i+1];
        }
        dp(data, layer-1);
    }
}
