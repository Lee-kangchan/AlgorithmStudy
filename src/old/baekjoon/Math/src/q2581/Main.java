package old.baekjoon.Math.src.q2581;
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
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int first =0;
		int sum = 0 ;
		while(A<B) {
			
			int count = 0;
			for(int i=1; i<=A;i++) {
				if(A%i==0) {
					count++;
				}
			}
			if(count==2) {
				if(sum==0) {
					first=A;
				}
				sum= sum+A;
			}
			
			A++;
		}
		if(sum==0) {
			System.out.println("-1");
		}
		else {
		System.out.println(sum);
		System.out.println(first);
		}
	}
		
	
}