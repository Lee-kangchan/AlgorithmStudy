package Sort.src.q10989;


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
		
		int T = Integer.parseInt(bf.readLine().trim());
		
		int A[] = new int[10001];
		for (int i = 0 ; i<T ; i ++) {
			int N =Integer.parseInt(bf.readLine().trim());
			A[N]++;
		}
		for (int i =0 ; i<10001 ; i++) {
			if(A[i]!=0) {
				for(int j=0;j<A[i];j++) {
					bw.write(Integer.toString(i) + "\n");
				}
			}
		}
		bf.close();
		bw.close();
	}
}
