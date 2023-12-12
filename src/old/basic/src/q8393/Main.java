package old.basic.src.q8393;

import java.util.*;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T;
		T= sc.nextInt();
		
		int sum =0 ;
		for(int i = 0 ; i <=T; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}