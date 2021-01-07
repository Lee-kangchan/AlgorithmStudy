package Sort.src.q2750;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
// 수 정렬하기 (선택정렬)
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = sc.nextInt();
		
		int A[] = new int[T];
		for (int i = 0 ; i<T ; i ++) {
			A[i]=sc.nextInt();	
		}
		for (int i =0 ; i<T ; i++) {
			int tep = i;
			for(int j = i+1 ; j< T ; j++) {
				if(A[tep] > A[j]) {
					tep = j;
				}
			}
			int c ;
			c = A[i];
			A[i] = A[tep];
			A[tep] = c;
		}
		for (int i = 0 ; i<T ; i ++) {
			System.out.println(A[i]);	
		}
		

	}
}
