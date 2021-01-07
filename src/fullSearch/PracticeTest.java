package fullSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PracticeTest {
	public static int[] solution(int[] answers) {
		 int a[] = {1,2,3,4,5};
		int b[] = {2,1,2,3,2,4,2,5};
		int c[] = {3,3,1,1,2,2,4,4,5,5};
		int s[] = new int[3];
		for(int t=0; t<answers.length;t++) {
			s[0] = a[t%a.length] == answers[t] ? s[0]+1 : s[0];
			s[1] = b[t%b.length] == answers[t] ? s[1]+1 : s[1];
			s[2] = c[t%c.length] == answers[t] ? s[2]+1 : s[2];
			System.out.println(s[0]+" " + s[1]+" " + s[2]);
		}
		int maxScore = Math.max(s[0], Math.max(s[1],s[2]));
		List<Integer> list = new ArrayList<Integer>(); 
		for(int i=0 ; i<s.length ; i++) {
			if(maxScore == s[i]) {list.add(i+1);}
		}
		int []answer = new int[list.size()];
		for(int i=0; i<answer.length ; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		int[] aaaa = solution(answers);
		
		for(int i=0; i< aaaa.length ; i++) {
			System.out.println(aaaa[i]);
		}
	}
}
