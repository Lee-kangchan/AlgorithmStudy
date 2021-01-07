package basic.src.q15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(bf.readLine().trim());
		
		for(int i = 0 ; i <T; i++) {
			String text = bf.readLine();	
			String number[] = text.split(" ");
			int a = Integer.parseInt(number[0]);
			int b = Integer.parseInt(number[1]);
            bw.write((a+b)+"\n");
		}
        bw.flush();
        bw.close();
}
}