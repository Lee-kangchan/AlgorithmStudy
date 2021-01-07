package Sort.src.q2108;


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
		
		int A[] = new int[N];
		int B[] = new int[8001];
		int i =0;
		double sum=0;
		for (i=0;i<N;i++) {
			A[i]= Integer.parseInt(bf.readLine().trim());
			B[4000+A[i]]++;
			sum = sum+A[i];
		}
		Arrays.sort(A);
		int am=0;
		int am2 = 0 ;
		int count=0;
		for(int j=0; j < 8001 ; j++) {
			if(B[am] < B[j]) {
				am = j;
				am2 =-1;
				count=0;
			}
			else if(B[j]!=0&& B[am] == B[j]) {
				if(count==0) {
					am2 = j;
				}
				count++;
				
			}
		}
		
		System.out.println((int)Math.round(sum/N));
		System.out.println(A[N/2]);
		if(am2!=-1) {
		System.out.println(am2-4000);
		}
		else {
			System.out.println(am-4000);
		}
		System.out.println(A[A.length-1]-A[0]);
	
	}}

