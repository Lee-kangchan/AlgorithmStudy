package baekjoon.BackTracking.src.q15649;
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
		
		String W[] = bf.readLine().trim().split(" ");
		int a = Integer.parseInt(W[0]);
		int b = Integer.parseInt(W[1]);
		
		for(int i = 1 ; i <= a ; i++) {
			int A[] = new int[b];
			A[0]= i;
			test(A,a,1);
		}
	}

	public static void test(int A[], int b , int c) {
		if(c>=A.length) {
			for(int i = 0 ; i<A.length;i++) {
				System.out.print(A[i]+" ");
			}
			System.out.println();
			return; 
		}
		
		for(int i = 1 ; i<= b ; i++) {
			int count =0;
			for(int T = 0 ; T < c ; T++) {
				if(i == A[T])
					count=1;
				
			}
			if(count==1) {
				continue;
			}
			A[c] = i;
			test(A,b,c+1);
		}

	}
}


