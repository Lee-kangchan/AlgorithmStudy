package baekjoon.BackTracking.src.q2580;
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
		int A[][] = new int[9][9];
		for(int i=0;i<9;i++) {
			String []S = bf.readLine().trim().split(" ");
			for( int j =0 ; j< 9 ; j++) {
			A[i][j] = Integer.parseInt(S[j]);
				if(A[i][j]==0) {
					for(int k= 1 ; k<=9 ; k++) {
						A[i][j] = k;
						if(T(A,i,j)&&S(A,i,j)&&U(A,i,j)) {
							bw.write(A[i][j]+" ");
							break;
						}
					}
				}
				else {
					bw.write(A[i][j]+" ");
				}
			}
			bw.write("\n");
		}
		
		
		
		bw.flush();
		bw.close();
	}
	
	public static Boolean T(int A[][] , int a, int b) {
		for(int i =0 ; i < 9 ; i++) {
			if(b == i ) continue;
			
			if(A[a][b] == A[a][i]) {
				return false;
			}
		}
		
		return true;
	}
	public static Boolean S(int A[][], int a, int b) {
		
		for(int i =0 ; i < 9 ; i++) {
			if(a == i ) continue;
			
			if(A[a][b] == A[i][b]) {
				return false;
			}
		}
		
		return true;
	}
	public static Boolean U(int A[][], int a, int b) {
		int X = (a/3)*3;
		int Y = (b/3)*3;
		
		for(int i =0  ; i <3 ; i++) {
			for (int j =0 ; j < 3 ; j++) {
				if(a == X+i && b == Y+j) continue;
				if(A[X+i][Y+j]==A[a][b]) {
					return false;
				}
			}
		}
		return true;
	}

}


