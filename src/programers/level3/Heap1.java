package programers.level3;

import java.util.ArrayList;
import java.util.Collections;

//이중우선순위큐
public class Heap1 {
    public int[] solution(String[] operations) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for(String s : operations){
            if(s.charAt(0) == 'I'){
                int result = Integer.parseInt(s.replace("I ",""));
                list.add(result);
                Collections.sort(list);
            }
            else if(s.charAt(0) == 'D'){
                int compare = Integer.parseInt(s.replace("D ",""));
                if(list.size() > 0) {
                    if (compare == 1) {
                        list.remove(list.size() - 1);
                    } else if (compare == -1) {
                        list.remove(0);
                    }
                }
            }
        }
        if(list.size()==0){
            return new int[]{0,0};
        }

        return new int[]{list.get(list.size()-1), list.get(0)};
    }

    public static void main(String[] args) {
        Heap1 heap1 = new Heap1();

        System.out.println(heap1.solution(new String[]{"I 16", "D 1"}));
        System.out.println(heap1.solution(new String[]{"I 7", "I 5", "I -5", "D -1"}));
    }
}
