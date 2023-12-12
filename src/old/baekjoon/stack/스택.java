package old.baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class 스택 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt  = Integer.parseInt(br.readLine());
        Stack<String> stack =new Stack<>();

        for(int i = 0 ; i < cnt; i++){
            String data[] = br.readLine().split(" ");

            if(data[0].equals("push")){
                stack.add(data[1]);
                continue;
            }else if(data[0].equals("pop")){
                if(stack.size() ==0) bw.write("-1");
                else bw.write(stack.pop()+"");
            } else if(data[0].equals("top")){
                if(stack.size() ==0) bw.write("-1");
                else bw.write(stack.peek()+"");
            }else if(data[0].equals("size")){
                bw.write(stack.size()+"");
            }else if(data[0].equals("empty")){
                if(stack.size() ==0) bw.write("1");
                else bw.write("0");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
