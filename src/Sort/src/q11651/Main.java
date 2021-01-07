package Sort.src.q11651;

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
		
		Arrays.sort(A,new Comparator<int []>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				}
				
				return Integer.compare(o1[1], o2[1]);
			};
			
		});
		for(int i = 0 ; i<T ; i++) {
			bw.write(A[i][0]+" "+A[i][1]+"\n");
		}
	bw.close();
	bf.close();
	}

	
	
}

