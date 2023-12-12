package old.baekjoon.Math.src.q4153;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
// 직각 삼각형 찾기
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			String A = bf.readLine().trim();
			
			if(A.equals("0 0 0")) {
				break;
			}
			String t[] = A.split(" ");
			int n[] = new int [t.length];
			
			int Max =0;
			for(int i=0; i<t.length; i++ ) {
				n[i] = Integer.parseInt(t[i]);
				Max = Max>n[i] ? Max :n[i]; 
			}
			int sum =0;
			for(int i=0; i<t.length; i++ ) {
				if(Max == n[i]) {
					continue;
				}
				sum +=(n[i]*n[i]);
			}
			if(Max*Max==sum) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
		
	}
	
}