package old.busanCodingExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// �λ� �ڵ�������ȸ ���ù��� (���� �����ϱ�) 
public class Busan1 {
	
	public static void main(String[] args) {
		try {

			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����
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
	
	public static String solution (int[] input2) {
		String answer = "NO";
		
		int count =0 ;
		Arrays.sort(input2);
		int result[] = new int[3];
		result[0] = input2[input2.length-1];
		for(int i = input2.length-2 ; i>=0; i-- ) {
			if(result[count]>input2[i]) {
				count++;
				result[count] = input2[i];
			}
			if(count==2) {
				answer="YES";
				break;
			}
		}
		
		return answer;
	}
	
}
