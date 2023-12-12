package old.baekjoon.Math.src.q9020;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//골드 바흐의 추측
//짝수를 소수의 합한 값을 구하기 ( 소수의 차가 적은 수)
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A=-1;
		int T = sc.nextInt();
		for(int k=0;k<T;k++){
			A = sc.nextInt();
			Boolean[] arr = new Boolean[A+1];
			
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
			int X, Y ;
			for(int i=arr.length/2 ; i>=2;i--) {
				if(arr[i]) {
					if(arr[A-i]) {
						System.out.println(i +" " +(A-i));
						break;
					}
				}
			}
			
		}
	}
		
	
}