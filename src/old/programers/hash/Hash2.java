package old.programers.hash;

import java.util.HashSet;

public class Hash2 {
	public boolean solution(String[] phone_book) {

        
        HashSet<String> set = new HashSet<String>();
        
        for(String i: phone_book) {
        	for(String j:set) {
        		if(i.startsWith(j)||j.startsWith(i)) {
        			return false;
        		}
        	}
        }
        
        
        
        
        return true;
    }
	public static void main(String[] args) {
		
	}
}
