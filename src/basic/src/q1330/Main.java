package basic.src.q1330;

import java.util.*;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A =0, B=0 ;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}
		else if(A==B) {
			System.out.println("==");
		}
		else if(A<B){
			System.out.println("<");
		}
	}
}