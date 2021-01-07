package Math.src.q1011;

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
			int C = 0 ;
			int X=0 , Y=0 ;
			while(true) {
				C++;
				k= k + C ;
				X++;
				if(k >= n ) {
					break;
				}
				n = n - C ;
				Y++;
				if(n <= k) {
					break;
				}
			}
			System.out.println(X+Y);
			
		}
		
	}
		
	
}