package Sort.src;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort1 {
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] result = solution(array, commands);
		for(int i : result) {
			System.out.print(i+" ");
		}
		
	}
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
        	for(int j=commands[i][0]-1 ; j<=commands[i][1]-1; j++) {
        		arr.add(array[j]);
        	}
        	int[] t = new int[arr.size()];
        	for(int j=0;j<arr.size();j++) {
        		System.out.print(arr.get(j));
        		t[j] = arr.get(j);
        	}
        	System.out.println("");
        	Arrays.sort(t);
        	answer[i] = t[commands[i][2]-1];
        	
        }
        
        return answer;
    }
}
