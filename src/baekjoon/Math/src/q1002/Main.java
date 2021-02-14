package baekjoon.Math.src.q1002;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// 터렛 문제
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int T = sc.nextInt();
		
		for(int i=0; i<T ; i++) {
		
			int x = sc.nextInt();
			int y = sc.nextInt();
			int r = sc.nextInt();
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int R = sc.nextInt();
			
			if(x==X && y==Y && r==R) {
				System.out.println("-1");
				continue;
				
			}
			else if(x==X && y==Y) {
				System.out.println("0");
				continue;
			}
			int sum = (x-X)*(x-X)+(y-Y)*(y-Y);
			double q= Math.sqrt((x-X)*(x-X)+(y-Y)*(y-Y));
			
			if (r+R>q &&Math.abs(r-R)<q) {
				System.out.println("2");
			}
			else if(r+R == q||Math.abs(r-R)==q){
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
	}
	
}