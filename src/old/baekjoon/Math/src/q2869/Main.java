package old.baekjoon.Math.src.q2869;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		V= V-A;
		
		if(V- ((A-B)*(V/(A-B))) <=0) {
			System.out.println(V/(A-B)+1);
		}
		else {
			System.out.println(V/(A-B)+2);
		}
	}
	
}