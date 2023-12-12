package old.baekjoon.Math.src.q1085;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
//직사각형에서 탈출
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		
		if(X> W/2) X= W-X;
		
		if(Y> H/2) Y= H-Y;
		
		System.out.println(X>Y?Y:X);
	}
		
	
}
		