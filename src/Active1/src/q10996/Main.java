package Active1.src.q10996;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
//별찍기 -21
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = sc.nextInt();
		int i , j ;
		
		for(j = 0 ; j <N ; j++ ) {
			for(i=0;i<N; i+=2) {
				System.out.print("* ");
			}
			System.out.println("");
			for ( i=1 ; i<N; i+=2) {
				System.out.print(" *");
			}
			System.out.println("");
		}

	}
}
