package test;
import java.io.*;
public class Main3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        String arr[] = new String[num];
        String arr2[][] = new String[num][num];
        for(int i = 0 ; i < num; i++){
            arr[i] = br.readLine();
            arr2[i] = arr[i].split("");
        }
        int size[] = new int[num+1];
        Main3 main3 = new Main3();
        main3.solve(size, arr2, 1,0,0);


        System.out.println("total: "+ main3.total);
        for(int i = 1 ; i <= size.length-1; i++){
            if(size[i]!=0) {
                System.out.println("size[" + i + "]: " + size[i]);
            }
        }

    }
    int total = 0;
    public void solve(int size[], String place[][], int len, int x, int y){
        boolean check= false;
        for(int i = x; i < x+len ; i++){
            for(int j = y; j < y+len ; j++){
                if(place[i][j].equals("0")){
                    check=true;
                }
            }
        }
        if(!check){
            total++;
            size[len]++;
        }


        if(x +len == place.length &&  y+len== place.length){
            if(len == place.length){
                return;
            }
            solve(size, place, len+1, 0, 0 );
        }else{
            if(x+len < place.length){
                solve(size , place, len, x+1,y);
            }
            else if(y+len < place[0].length){
                solve(size, place, len, 0, y+1);
            }
        }

    }
}
