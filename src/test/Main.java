package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String input = br.readLine();
        int num = Integer.parseInt(input);
        String arr[][] = new String[num][2];

        int start = 0;
        int end = 24*60;
        for(int i = 0 ; i < num; i++){
            String s = br.readLine();
             arr[i] = s.split(" ~ ");

             int S = Integer.parseInt(arr[i][0].split(":")[0]) * 60 + Integer.parseInt(arr[i][0].split(":")[1]);
             int E = Integer.parseInt(arr[i][1].split(":")[0]) * 60 + Integer.parseInt(arr[i][1].split(":")[1]);
             start = start > S ? start : S;
             end = end > E ? E : end;
        }

        if(start > end){
            System.out.println(-1);
        }else{
            int s = start / 60;
            int m = start % 60;
            int ss = end / 60;
            int mm = end % 60;
            System.out.print(s+":");
            if(m < 10){
                System.out.print(0);
            }
            System.out.print(m+" ~ ");
            System.out.print(ss+":");
            if(mm < 10){
                System.out.print(0);
            }
            System.out.print(mm);
        }


    }
}