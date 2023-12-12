package old.baekjoon.Math.src.q3009;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// 네번째 점
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X[] = new int[3];
		int Y[] = new int[3];
		
		int x=0,y=0;
		for(int i=0;i<3;i++) {
			X[i]=sc.nextInt();
			Y[i]=sc.nextInt();
		}
		if(X[0]==X[1]) x=X[2];
		else {
			if(X[0]==X[2])x=X[1];
			else x=X[0];
		}
		if(Y[0]==Y[1]) y=Y[2];
		else {
			if(Y[0]==Y[2])y=Y[1];
			else y=Y[0];
		}
	
		System.out.println(x+" "+y);
	}
		
	
}