package old.test;
import java.io.*;

public class Main6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input.split(" ")[1]);
        int num2 = Integer.parseInt(input.split(" ")[0]);

        String arr[] = new String[num];
        String arr2[][] = new String[num][num2];
        for(int i = 0 ; i < num ; i++){
            arr[i] = br.readLine();
            arr2[i] = arr[i].split(" ");
        }
        Main6 main = new Main6();
        System.out.println(arr2.length + "ssss" + arr2[0].length);
        main.dfs(arr2, 0, 0 , 0);

        System.out.println(main.max);
    }
    int max = 0 ;
    public void dfs(String shop[][], int x, int y, int count){

        System.out.println(x + "," + y);
        if(x == shop[0].length-1 && y == shop.length-1){
            count = count + Integer.parseInt(shop[y][x]);
            max = max > count ? max : count;
            return;
        }
        if(x < shop[0].length-1) {
            dfs(shop, x+1, y, count+ Integer.parseInt(shop[y][x]));
        }
        if(y < shop.length-1){

            dfs(shop, x, y+1, count+ Integer.parseInt(shop[y][x]));
        }
    }
}
