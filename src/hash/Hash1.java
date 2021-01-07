package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Hash1 {
	 public static String solution(String[] participant, String[] completion) {
	        String answer ="";
	        HashMap<String,Integer> map = new HashMap<String,Integer>();
	        for(String i :participant ) {
	        	if(map.get(i)==null) {
	        		map.put(i, 1);
	        	}
	        	else {
	        	map.put(i, map.get(i)+1);
	        	}
	        }
	        
	        for(String i:completion) {
	        	map.put(i, map.get(i)-1);
	        }
	        for(String i :participant){
	            if(map.get(i)>0){
	                answer=i;
	            }
	        }
	        
	        return answer;
	    }
    
    public static void main(String[] args) {
    	String[] arr = {"mislav","stanko","ana"};
    	String[] arr2 = {"stanko","ana"};
		String t= solution(arr,arr2);
	}
   
}
