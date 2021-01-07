package Sort.src.q1181;

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
		
		String E[] = new String[T];
		for(int i=0 ; i<T ; i++) {
			E[i] = bf.readLine().trim();
		}
		
		for(int i =0 ; i<T ; i++) {
			String temp =E[i];
			int temp_num = i;
			int result =50;
			for(int j=i+1; j<T; j++) {
				if(temp.length()>E[j].length()) {
					temp = E[j];
					temp_num = j;
				}
				else if(temp.length() == E[j].length()) {
					if(temp.equals(E[j])) {

						T--;
						for(int k = j ; k< T ; k++) {
							E[k] = E[k+1];
						}
						j--;
						continue;
						
					}
					else {	
						for(int a = 0 ; a<temp.length(); a++) {
							if(temp.charAt(a) > E[j].charAt(a)) {
									temp = E[j];
									temp_num = j;
									result =a;
								
							}
							else if(temp.charAt(a) == E[j].charAt(a)) {
								continue;
							}
							else {
								break;
							}
						
						}
					}
				}
			}
			String A = E[i];
			
			E[i] = temp;
			E[temp_num] = A;
			bw.write(E[i]+"\n");
		}
		bw.close();
		bf.close();
	}

	
	
}

