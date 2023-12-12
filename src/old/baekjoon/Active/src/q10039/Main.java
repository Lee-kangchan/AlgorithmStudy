package old.baekjoon.Active.src.q10039;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class Main
{
  public static void main(String[] args) throws NumberFormatException, IOException
  {
    Scanner sc = new Scanner(System.in);
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int score[] = new int[5];
    
    int sum = 0;
    for (int i=0 ; i<5 ; i++) {
    	score[i] = sc.nextInt();
    	if(score[i]<40) {
    		score[i]= 40;
    	}
    	
    	sum = sum + score[i];
    	
    }
    
    
    System.out.println(sum/5);
    
    
  }
}

