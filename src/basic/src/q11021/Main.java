package basic.src.q11021;
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
		
		for(int i = 1 ; i <=T ; i++) {
            String text = bf.readLine();
            String number[] = text.split(" ");
            int A = Integer.parseInt(number[0]);
            int B = Integer.parseInt(number[1]);
            
            bw.write("Case #"+i+": "+(A+B)+"\n");
		}
        bw.flush();
        bw.close();
}
}