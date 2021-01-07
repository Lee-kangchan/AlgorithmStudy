package Sort.src.q10814;
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
		String A[][] = new String[T][2];
		
		for(int i =0 ; i <T ; i++) {
			A[i] = bf.readLine().trim().split(" ");
		}
		
		Arrays.sort(A,new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		
		
		
		for(int i=0; i < T ; i++) {
			bw.write(A[i][0] + " " + A[i][1] + "\n");
		}
		bw.close();
		bf.close();
	}

	
	
}

