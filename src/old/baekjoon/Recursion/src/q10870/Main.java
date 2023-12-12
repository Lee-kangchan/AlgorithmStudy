package old.baekjoon.Recursion.src.q10870;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
// 파보나치 수열
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		
		System.out.println(fabo(t));
	}
	public static int fabo(int t) {
		
		if(t==1) return 1;
		else if (t==0) return 0;
		return fabo(t-1)+fabo(t-2);
		
	}
	
}