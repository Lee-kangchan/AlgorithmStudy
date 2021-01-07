package BackTracking.src.q14889;
import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<Integer> result = new ArrayList<Integer>();
	static int T;
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		int A[][] = new int[T][T];
		
		for(int i=0; i<T; i++) {
			for(int j=0; j<T; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int B[] = new int[T/2];
		for(int i=0; i<T/2+1;i++) {
			System.out.println(i);
			B[0]=i;
			BackTracking(A,B, 1);
		}
		print();
	}
	public static void BackTracking(int A[][], int B[],int c) {
		if(c == B.length) {
			for(int L = 0 ; L< c - 1 ; L++) {
				System.out.print(B[L]+" ");
				if(B[L]>= B[L+1]) {
					return;
				}
			}
			System.out.println();
			solve(A,B);
			
			return; 
		}
		for(int i = 0 ; i< T ; i++) {
			B[c] = i;
			BackTracking(A, B, c+1);
		}

	}
	public static void solve(int C[][], int B[]) {
		int A[] = new int[T/2];
		
		int count =0, num=0;
		for(int i=0 ; i<T ; i++) {
			for(int j =0 ; j<B.length ; j++) {
				if(B[j] == i) {
					count = 1;
				}
			}
			if(count ==1 ) continue;
			A[num] = i;
			num++;
//			System.out.println(A[i]+",,,,"+ B[i]);
		}
		int Asum =0;
		int Bsum =0;
		
		for(int i=0;i<A.length;i++) {
			for(int j=i+1; j<A.length; j++) {
//				System.out.println("��� ������ ���?"+i+","+j);
				Asum = C[A[i]][A[j]]+C[A[j]][A[i]]+Asum;
				Bsum = C[B[i]][B[j]]+C[B[j]][B[i]]+Bsum;

//				System.out.println("��� ������ ���?"+i+","+j);
			}
		}
//		System.out.println(Asum+"-"+Bsum +"hello");
		int Q = Math.abs(Asum-Bsum);
//		System.out.println(Q);
		result.add(Q);
	}
	public static void print() {
		int min = 1000000000;
		
		for(int i : result) {
			min = min > i ? i : min;
		}
		System.out.println(min);
	}
}


