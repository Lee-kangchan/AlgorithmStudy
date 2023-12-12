package old.baekjoon.BackTracking.src.q14888;
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

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int A[] = new int[T];
		int calc[] = new int[4];
		for(int i=0; i<T;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<4 ;i++) {
			calc[i] = sc.nextInt();
		}
		calc(A,0,calc,A[0]);
		solve();
		
	}
	public static void calc(int A[], int count, int calc[], int sum) {
		if(count == A.length-1) {
			result.add(sum);
		}
//		System.out.println("+: " +calc[0] +"  -: " +calc[1] +"  *: " +calc[2] +"  //: " +calc[3]);
//		System.out.println("���� ? :"+ A[count]);
		for(int i=0;i<calc.length;i++) {
			switch(i) {
			case 0:
				if(calc[0]!=0) {
					calc[0]--;
					calc(A,count+1,calc,sum+A[count+1]);
					calc[0]++;
				}
				break;
			case 1:
				if(calc[1]!=0) {
					calc[1]--;
					calc(A,count+1,calc,sum-A[count+1]);
					calc[1]++;
				}
				break;
			case 2:
				if(calc[2]!=0) {
					calc[2]--;
					calc(A,count+1,calc,sum*A[count+1]);
					calc[2]++;
				}
				break;
			case 3:
				if(calc[3]!=0) {
					calc[3]--;
					calc(A,count+1,calc,sum/A[count+1]);
					calc[3]++;
				}
				break;
			}
		}
	}
	public static void solve() {
		int Max=-1000000000;
		int Min= 1000000000;
		
		for(Integer i : result) {
			Max = Max > i ? Max : i ;
			Min = Min < i ? Min : i ;
		}
		System.out.println(Max);
		System.out.println(Min);
	}
}


