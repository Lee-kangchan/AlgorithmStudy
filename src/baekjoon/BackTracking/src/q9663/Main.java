package baekjoon.BackTracking.src.q9663;
import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int count = 0 ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(bf.readLine());
		
		int Chess[] = new int[T];
		
		for(int i = 0 ; i <T; i++) {
			Chess[0] = i;
			test(Chess, T , 1);
		}
		bw.write(count+"");
		bw.flush();
		bw.close();
	}
	public static void test(int Chess[], int b , int c) throws IOException {
		
		if(b<=c ) {
			count++;
		}else {
			for(int i = 0 ; i< b ; i++) {
				Chess[c] = i;
				if(bool(Chess,  c) ) {
					test(Chess, b, c+1);
				}
			}
		}

	}
	public static boolean bool(int Chess[],  int c) {
		for(int i = 0 ; i< c ; i ++) {
				if(Chess[i] == Chess[c]) {
					return false;
				}
				if(Math.abs(Chess[i] - Chess[c]) == Math.abs(i- c)){
					return false;
					
				}
		}
		return true;
	}
}


