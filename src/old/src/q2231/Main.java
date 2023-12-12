package old.src.q2231;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
// 분해합
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		
		for(int i=1+2/t; i<t; i++) {
			int sum = i;
			int suv = i;
			while(suv!=0) {
				sum += suv%10;
				suv=suv/10;
			}
			if(sum==t) {

				System.out.println(i);
				return ;
			}
		}
		System.out.println("0");
	}
	
}