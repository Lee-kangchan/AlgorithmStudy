package busanCodingExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Busan2 {
	public static void main(String[] args) {
		try {

			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //¼±¾ð
			int input = Integer.parseInt(bf.readLine());
			
			int[] input2 = new int[input];

			String[] input3 = bf.readLine().split(" ");
			for(int i=0; i<input;i++) {
				input2[i] = Integer.parseInt(input3[i]);
			}
			
			
			System.out.println(solution(input2));
			bf.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int solution (int[] input2) {
		int answer =0;
		Arrays.sort(input2);
		int min = input2[0];
		int max = input2[input2.length-1];
		
		answer = 2*(max-min);
		return answer;
	}
}
