package old.baekjoon.Math.src.q4948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//에라토스테네스의 체 방법으로 소수 구하기 응용
//베르트랑 공준
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A=-1;
		while(true) {
			A = sc.nextInt();
			if(A==0)break;
			Boolean[] arr = new Boolean[2*A+1];
			
			for(int i=0; i<arr.length;i++) {
				arr[i]=true;
			}
			
			for(int i =2 ; i<arr.length;i++) {
				if(Math.pow(i, 2)>300000) {	
					break;
				}
				else {
					for(int j = (int)Math.pow(i,2); j <arr.length;) {
						arr[j]=false;
						j=j+i;
					}
				}
			}
			int count=0;
			for(int i =A+1 ;i<A*2+1;i++) {
				if(arr[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
		
	
}