package Sort.src.q11650;


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
		
		int T = Integer.parseInt(bf.readLine().trim());
		String S[] = new String[2] ;
		int A[][] = new int[T][2];
		
		for(int i = 0 ; i <T ; i ++) {
			S = bf.readLine().trim().split(" ");
			A[i][0]= Integer.parseInt(S[0]);
			A[i][1] = Integer.parseInt(S[1]);
		}
		
		int M;
		for(int i = 0 ; i <T ; i ++) {
			int am =i;
			for(int j = i ; j< T ; j++) {
				if(A[am][0]>=A[j][0]) {
					if(A[am][1]>=A[j][1]) {
						am = j;
					}
				}
			}
			int w=A[i][0] , W=A[i][1];
			A[i][0] = A[am][0];
			A[i][1] = A[am][1];
			A[am][0] = w;
			A[am][1] = W;
			bw.write(A[i][0]+" "+A[i][1]+"\n");
		}
	bw.close();
	bf.close();
	}

	
//
//	public void marge(int A[],int p,int r) {
//		if(p<r) {
//			int E = (p+r)/2;
//			marge(A,p,E);
//			marge(A,E+1,r);
//			margeSort(A,p,E,r);
//			
//		}
//    }
//	public void margeSort(int A[], int p ,int  q,int  r)
//	{
//		int i= p , j = q+1 , k = p;
//		int tmp[] = new int[A.length];
//		
//		while(i<=q && j<=r) {
//			if(A[i]<=A[j]) {
//				tmp[k++] = A[i++];
//			}
//			else {
//				tmp[k++] = A[j++];
//			}
//		}
//		while( i <=q ) {
//			tmp[k++] = A[i++];
//		}
//		while(j<=r) {
//			tmp[k++] = A[j++];
//		}
//		for(i = p ; i<=r ; i++) {
//			A[i] = tmp[i];
//		}
//	}
//	
}

