package Sort.src.q1427;


import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine().trim());
		
		int count=0;
		int t = N;
		while(t!=0) {
			t=t/10;
			count++;
		}
		int A[] = new int[count];

		count=0;
		while(N!=0) {
			A[count] = N%10;
			N= N/10;
			count++;
		}
		Arrays.sort(A);
		for(int i=A.length-1 ; i>=0;i--) {
			System.out.print(A[i]);
		}
	
	}}

