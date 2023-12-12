package old.programers.level3;

import java.util.HashSet;
//방문길이
public class SummerWinter_coding {
    public int solution(String dirs) {
        int answer = 0;
        int x =0  , y = 0;
        HashSet<String> set = new HashSet<>();
        for(int i  = 0 ; i  < dirs.length() ; i++){
            if(dirs.charAt(i) =='L' && x > -5){
                x--;
                set.add(String.valueOf(x)+String.valueOf(y)+String.valueOf(x+1) + String.valueOf(y));
            }else if(dirs.charAt(i) == 'U' && y< 5){
                y++;
                set.add(String.valueOf(x)+String.valueOf(y-1)+String.valueOf(x) + String.valueOf(y));
            }else if(dirs.charAt(i) == 'R' && x< 5){
                x++;
                set.add(String.valueOf(x-1)+String.valueOf(y)+String.valueOf(x) + String.valueOf(y));
            }else if(dirs.charAt(i) == 'D' && y > -5){
                y--;
                set.add(String.valueOf(x)+String.valueOf(y)+String.valueOf(x) + String.valueOf(y+1));
            }
        }

        for(String t : set){
            System.out.println(t);
        }
        return set.size();
    }
}
