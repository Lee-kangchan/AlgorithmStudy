package Math.src.q2292;

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
		int num = 1;
		while(A>num)
		{
			A= A-num;
			num++;
		}
		int a = num+1- A ;
		int b = A;
		if(num %2 ==0) {
			System.out.println(b+"/"+a);
		}
		else {
			System.out.println(a+"/"+b);
	
		}
	}
}