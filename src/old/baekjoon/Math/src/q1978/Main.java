package old.baekjoon.Math.src.q1978;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = sc.nextInt();
		int count =0;
		int A[] = new int[T];
		for(int p =0 ; p<T ; p++) {
			int S = sc.nextInt();
			
			A[p]=0;
			for(int i=1;i<=S;i++) {
				if(S%i==0) {
					A[p]++;
				}
			}
			if(A[p]==2) {
				count++;
			}
		}
		System.out.println(count);
	}
		
	
}