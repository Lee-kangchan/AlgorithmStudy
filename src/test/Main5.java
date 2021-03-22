package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);
        Main5 main = new Main5();
        String[][] arr= new String[b][a];
        for(int i = 0 ; i < b ;  i++){
            String data = br.readLine();
            arr[i] = data.split("");
        }
        for(int i = 0 ; i < a ; i ++){
            if(arr[0][i].equals("c")){
                System.out.println(i);
                main.solve(arr, i,0, 0, new int[b][a]);
            }

        }
        if(main.min == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(main.min);
        }
    }
    int min = Integer.MAX_VALUE;
    public void solve(String place[][], int x, int y, int count, int load[][]){

        System.out.println(x + "," +y);

        load[y][x] = 1;
        if(y == place.length-1 ){
            min = min > count ? count : min;
            return;
        }

        System.out.println(place[y+1][x]);

        if(place[y+1][x].equals(".")){
            solve(place, x, y+1, count,load);
        }
        if(x < place[0].length-1 && place[y][x+1].equals(".") && load[y][x+1]!=1){
            count++;
            solve(place, x+1, y, count,load);
        }
        if(x > 0 && place[y][x-1].equals(".")&& load[y][x-1]!=1){
            count++;
            solve(place, x-1, y, count,load);
        }
        if(y > 0 && load[y-1][x]!=1){
            solve(place, x, y-1, count,load);
        }
    }
}
