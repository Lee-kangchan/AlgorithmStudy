package baekjoon.Recursion.src.q10872;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
// 팩토리얼 재귀 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		
		System.out.println(fact(t));
	}
	public static int fact(int t) {
		
		if(t<=1) return 1;
		return t*fact(t-1);
		
	}
	
}