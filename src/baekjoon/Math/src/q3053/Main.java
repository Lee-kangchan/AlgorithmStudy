package baekjoon.Math.src.q3053;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
// 택시 기하학 (이해 못함)
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		final double PI = 3.1415926535897;
		
		double T = sc.nextDouble();
		
		System.out.printf("%.6f \n", T*T*PI);
		System.out.printf("%.6f", 2*T*T);
	}
	
}