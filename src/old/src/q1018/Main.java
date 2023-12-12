package old.src.q1018;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner; 
// 체스판
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = sc.nextInt();
		int y = sc.nextInt();
			
		String A[][] = new String[x][y];
		for(int i =0 ; i<x ; i++) {
			A[i]=sc.next().split("");
		}
		
		int result =64;
		int a= 0 , b=0;
		for(a = 0 ; a<=x-8;a++) {
			for(b=0; b<=y-8;b++) {
				int count =0;
				
				for(int i=0; i<8;i++) {
					for(int j=0; j<8; j++) {
						if((i+j)%2==0) {
							if(A[a+i][b+j].equals("B")) {
								count++;
							}
						}
						else {
							if(A[a+i][b+j].equals("W")) {
								count++;
							}
							else {
								
							}
						}
					}
				}
				result = result < count ? result : count;
				count =0;
				
				for(int i=0; i<8;i++) {
					for(int j=0; j<8; j++) {
						if((i+j)%2==0) {
							if(A[a+i][b+j].equals("W")) {
								count++;
							}
						}
						else {
							if(A[a+i][b+j].equals("B")) {
								count++;
							}
							else {
								
							}
						}
					}
				}
				result = result < count ? result : count;
			}
		}
		System.out.println(result);
	}
		
		
	
}
