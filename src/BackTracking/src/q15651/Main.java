package BackTracking.src.q15651;
import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		String W[] = bf.readLine().trim().split(" ");
		int a = Integer.parseInt(W[0]);
		int b = Integer.parseInt(W[1]);
		
		for(int i = 1 ; i <= a ; i++) {
			int A[] = new int[b];
			A[0]= i;
			test(A,a,1);
		}
		bw.flush();
		bw.close();
	}

	public static void test(int A[], int b , int c) throws IOException {
		
		if(c>=A.length) {
			
			for(int i = 0 ; i<A.length;i++) {
				bw.write(A[i]+" ");
			}
			bw.write("\n");
			return; 
		}
		
		for(int i = 1 ; i<= b ; i++) {
			A[c] = i;
			test(A,b,c+1);
		}

	}
}


