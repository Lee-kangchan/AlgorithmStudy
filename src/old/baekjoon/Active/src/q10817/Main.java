package old.baekjoon.Active.src.q10817;
import java.util.*;
public class Main{ //세 수

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A ;
		int B ;
		int C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if(A>B)
		{
			if(A>C) {
				if(B>C) {
					System.out.println(B);
				}
				else {
					System.out.println(C);
				}
			}
			else {
				System.out.println(A);
			}
		}
		else {
			if(B>C) {
				if(A>C) {
					System.out.println(A);
				}
				else {
					System.out.println(C);
				}
			}
			else {
				System.out.println(B);
			}
		}
		
		
	}
}