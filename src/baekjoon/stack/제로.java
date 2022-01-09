package baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt  = Integer.parseInt(br.readLine());
        Stack<Integer> stack =new Stack<>();

        for(int i = 0 ; i < cnt; i++){
            int data = Integer.parseInt(br.readLine());

            if(data ==0){
                stack.pop();
            }else{
                stack.push(data);
            }
        }
        int sum = 0;
        for(int i : stack){
            sum+=i;
        }
        bw.write(""+sum);
        bw.flush();
        bw.close();
    }
}
