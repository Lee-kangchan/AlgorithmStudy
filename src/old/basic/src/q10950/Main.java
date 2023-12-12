package old.basic.src.q10950;
import java.util.*;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B , T;
		int sum[] = new int[100];
		T= sc.nextInt();
		
		for(int i=0; i<T;i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			sum[i] = A+B;
		}
		for(int i=0; i<T; i++) {
			System.out.println(sum[i]);
		}
	}
}