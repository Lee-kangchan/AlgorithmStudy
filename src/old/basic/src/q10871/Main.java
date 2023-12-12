package old.basic.src.q10871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String T = bf.readLine().trim();
		String N[] = T.split(" ");
		int max = Integer.parseInt(N[0]);
		int min = Integer.parseInt(N[1]);
		
		String number = bf.readLine();
		String num[] = number.split(" ");
		
		for(int i=0; i<num.length ; i++) {
			if(min > Integer.parseInt(num[i])) {
				bw.write(num[i]+" ");
			}
		}
        bw.flush();
        bw.close();
}
}