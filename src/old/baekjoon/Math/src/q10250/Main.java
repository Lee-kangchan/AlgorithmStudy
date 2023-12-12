package old.baekjoon.Math.src.q10250;

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
		
		for(int i =0 ; i<T ; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			int c = 1;
			while(N > H) {
				N= N-H;
				c++;
			}
			System.out.print(N);
			if(c<10) {
				System.out.println("0"+c);
			}
			else {
				System.out.println(c);
			}
			
		}
		
		
		
		
	}
	
}