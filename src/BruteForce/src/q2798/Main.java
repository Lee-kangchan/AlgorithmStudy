package BruteForce.src.q2798;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
// 블랙잭
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		int C = sc.nextInt();
		int result =0;
		int A[] = new int[t];
		for(int i =0; i<t;i++) {
			A[i]=sc.nextInt();
		}
			int sum = 0;
			for(int i=0; i<t;i++) {

				for(int j=i+1;j<t;j++) {

					for(int k=j+1 ; k<t; k++) {
						sum = A[i]+A[j]+A[k];
						if(sum <= C) {
							result = result > sum ? result : sum;
						}
					}
				}
			}
			
		System.out.println(result);
		
		
		
	}
	
	
}