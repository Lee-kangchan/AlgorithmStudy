package old.baekjoon.Active.src.q5543;
//상근날드
import java.util.*;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A ;
		int B ;
		int C;
		int D;
		int E;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		E = sc.nextInt();
		
		int buggerMin = A<B ? C<A? C:A :C<B? C:B ; 
		int drink = D<E ? D : E ;
		
		System.out.println(buggerMin+drink-50);
	}
}