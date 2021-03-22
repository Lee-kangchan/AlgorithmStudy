package test;
import java.io.*;

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();
        String[] arr = input2.split("");
        for(int i = 0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        Main2 main2 = new Main2();
        main2.dfs(0,arr);
        System.out.println(main2.count);
    }
    int count = 0;
    public void dfs(int jump, String block[]){
        if(jump >= block.length-1){
            count++;
        }
        if(jump+1 < block.length && block[jump+1].equals("1")){
            dfs(jump+1, block);
        }
        if(jump+2 < block.length && block[jump+2].equals("1")){
            dfs(jump+2, block);
        }
    }
}
