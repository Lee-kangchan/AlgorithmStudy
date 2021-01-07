package While.src.q1110;
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int T = sc.nextInt();
    int A = T;
    int count = 0;
    do{
    	count++;
      A = ((A%10)*10)  + (((A/10) + (A%10))%10);
    }while(A != T);
    System.out.println(count);
  }
}

