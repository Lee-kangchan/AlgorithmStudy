package old.baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class 괄호     {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt  = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < cnt; i++){
            Stack<Integer> stack =new Stack<>();
            String data[] = br.readLine().split("");

            for(String s : data){
                if(s.equals("(")){
                    stack.push(1);
                }else if(s.equals(")")){
                    if(stack.size()!= 0 && stack.peek() ==1){
                        stack.pop();
                    }else{
                        stack.push(2);
                    }
                }
            }
            if(stack.size() !=0){
                bw.write("NO");
            }else{
                bw.write("YES");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
