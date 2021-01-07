package stackQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQue1 {
	public static void main(String[] args) {
		int prices[] = {1,2,3,2,3};
		int result[] = solution(prices);
		
		for( int i : result) {
			System.out.println(i);
		}
	}
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count = 0;
        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : prices) {
        	que.offer(i);
        }
        
        while(!que.isEmpty()) {
        	int moneyResult=0;
        	
        	
        	for(int i : que) {
        		System.out.println(i + "vs" + que.peek());
        		moneyResult++;
        		if(que.peek() > i) {
        			break;
        		}
        	}
        	System.out.println("");
        	answer[count] = moneyResult-1;
        	count++;
        	que.poll();
        }
        
        return answer;
    }
}
