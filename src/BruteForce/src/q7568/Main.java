package BruteForce.src.q7568;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
// 등빨 비교
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		
		Student S[] = new Student[t];
		
		for(int i=0;i<t;i++) {
			S[i]= new Student();
			S[i].kg =sc.nextInt();
			S[i].cm =sc.nextInt();
		}
		for(int i=0;i<t;i++) {
			for(int j=0;j<t;j++) {
				if(S[i] !=S[j]) {
					if(S[i].kg < S[j].kg&&S[i].cm < S[j].cm) {
						S[i].n++;
					}
				}
			}
			System.out.print(S[i].n+1 +" ");
		}
	}
	
}
class Student {
	int kg;
	int cm;
	int n ;
}