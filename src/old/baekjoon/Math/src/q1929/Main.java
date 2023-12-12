package old.baekjoon.Math.src.q1929;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


//에라토스테네스의 체 방법으로 소수 구하기
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		Boolean [] array = new Boolean[B+1] ;
		
		for(int i=0; i<=B ; i++) {
			if(i<=1) {
				array[i]=false;
				continue;
			}
			array[i]=true;
		}
		for(int i =2 ;  i <= B ; i++) {
			if(array[i]) {
				if(Math.pow(i, 2) > 1000000) {
					break;
				}
				else {
					for(int j =(int)Math.pow(i, 2); j< B+1;) {
						array[j] = false;
						j= j+i;
					}
				}
			}
		}
		for(int i= A ; i<=B ; i++) {
			if(array[i]) {
				System.out.println(i);
			}
		}
	}
		
	
}