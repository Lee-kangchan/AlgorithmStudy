package Active1.src.q2523;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
//별 찍기 13
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = sc.nextInt();
		
		
		for(int j = 1; j<N; j++) {
			for(int i= 0; i<j ; i++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int j = 0; j < N; j++) {
			for (int i = j; i < N; i++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}

	}
}
