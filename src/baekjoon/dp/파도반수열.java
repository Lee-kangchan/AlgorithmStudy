package baekjoon.dp;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class 파도반수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[]{1,1,1,2,2,3,4,5,7,9,12};
        List<Integer> list =new ArrayList<>();

        for(int i = 0 ; i < arr.length; i++){
            list.add(arr[i]);
        }

        int i = Integer.parseInt(br.readLine());
        int[] test = new int[i];
        for(int j = 0 ; j < i ; j ++){
            test[j] = Integer.parseInt(br.readLine());
        }
        for(int k = 0 ; k < test.length; k++) {
            if (test[k]-1 <= list.size()-1) {
                bw.write("" + list.get(test[k]-1));
            } else {
                for (int j = list.size(); j < test[k]; j++) {
                    list.add(list.get(j - 1) + list.get(j - 5));
                }

                bw.write("" + list.get(test[k]-1));

            }
            bw.newLine();
        }


        for(int a = 0 ; a < list.size();a++){
            System.out.print(list.get(a)+"  ");
        }
        System.out.println();
        bw.flush();
        bw.close();

    }
}
