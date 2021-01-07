package Math.src.q1011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i<T ; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int X = n-k , C = 0 , count=0;
			
			while(X>0) {
				
				if(f(X,C)==0||f(X,C)==C) {
				}
				else if(f(X,C)>0) {
					C++;
				}
				else {
					if(C==1) {
						C++;
					}
					C--;
				}

				X=X-C;
				count++;
			}
			System.out.println(count);
			
		}
		
	}
		
		
		
	static int f(int X, int speed) {
		for(int i = 1 ; i <= speed; i++) {
			X = X-i;
		}
		return X;
		
	}
	
}