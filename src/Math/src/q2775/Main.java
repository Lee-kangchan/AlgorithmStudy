package Math.src.q2775;

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
		
		for(int i = 0 ; i<T ; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(test(k,n));
		}
		
		
		
	}
	static int test(int k, int n) {
		if(n==0) {
			return 0;
		}
		else if(k==0) {
			return n;
		}
		else {
			return test(k-1, n) +test(k , n-1);
		}
		
	}
	
}