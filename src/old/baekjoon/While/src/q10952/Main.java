package old.baekjoon.While.src.q10952;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String T="0";
		int C = 0 ;
		int A[] = new int[100];
		int B[] = new int[100];
		
		
		while (!T.equals("0 0")) {
			T = bf.readLine().trim();
			String N[] = T.split(" ");

			A[C] = Integer.parseInt(N[0]);
			B[C] = Integer.parseInt(N[1]);
			
			if(A[C]+B[C]!=0) {
			bw.write((A[C]+B[C])+"\n");

			C++;}
		}
        bw.flush();
        bw.close();
}
} 