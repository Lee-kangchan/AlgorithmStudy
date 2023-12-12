package renewal.silver5;

import com.sun.xml.internal.stream.writers.UTF8OutputStreamWriter;

import java.io.*;

public class 다리놓기 {
    static int  result = 0 ;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer count = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < count ; i++){
            String[] bridgeData = br.readLine().split(" ");
            solve(Integer.parseInt(bridgeData[0]), Integer.parseInt(bridgeData[1]));
        }
    }

    public static int solve(int leftBridge, int rightBridge){

        result = 1;
        dp(rightBridge, leftBridge, 0);
        System.out.println(result);
        return result;
    }

    public static int dp(int rightBridge, int subBridge, int move){
        if(subBridge == 0 ){
            result += 1;
            return 0;
        }
        for(int i = 0 ; i < rightBridge-subBridge ; i++){
            dp(rightBridge, subBridge-1, i);
        }
        return 0;
    }
}
