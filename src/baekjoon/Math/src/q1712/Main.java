package baekjoon.Math.src.q1712;

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
		int num = A%5;
		int count = A/5;
		while(num%3!=0) {
			num = num+5;
			if(A < 0) {
				count = -1;
			}
			count--;
		}
		if(count==-1) {
			System.out.println(count);
		}
		else {
			System.out.println(count+num/3);
		}
	}
	
}