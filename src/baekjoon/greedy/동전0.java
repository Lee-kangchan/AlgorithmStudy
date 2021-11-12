package baekjoon.greedy;

import java.io.*;

public class 동전0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] answer  = br.readLine().split(" ");
        int cnt = 0 ;
        int money = Integer.parseInt(answer[1]);
        int money_range[] = new int[Integer.parseInt(answer[0])];
        for(int i= 0 ; i < money_range.length; i++){
            money_range[i] = Integer.parseInt(br.readLine());
        }
        for(int i = money_range.length-1 ; i >=0 ; i--){
            if( money/ money_range[i] > 0){
                cnt += money / money_range[i] ;
                money = money % money_range[i];
            }
        }
        bw.write(cnt+"");
        bw.flush();
        bw.close();
    }
}
