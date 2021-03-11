package programers.level2;

import java.util.*;

//후보키
public class kakao2019_blind {

    Comparator<Integer> comp = new Comparator<Integer>() {
        int countBits(int n){
            int ret = 0 ;
            while(n!=0){
                if((n&1) != 0) ++ ret;
                n = n >>1;
            }
            return ret;
        }
        @Override
        public int compare(Integer o1, Integer o2) {
            int x = countBits(o1), y= countBits(o2);
            return x-y;

        }
    };
    public int solution(String[][] relation){
        int answer = 0;
        int row = relation.length;
        int cols = relation[0].length;
        List<Integer> candidates = new LinkedList<>();

        for(int i = 1 ; i < 1 << cols; ++i){
            if(check(relation, row, cols, i)){
                candidates.add(i);
            }
        }
        Collections.sort(candidates, comp);

        while(candidates.size() != 0) {
            int n = candidates.remove(0);
            ++answer;
            for(Iterator<Integer> it = candidates.iterator(); it.hasNext();){
                int c = it.next();
                if((n & c) == n)
                    it.remove();
            }
        }
        return answer;
    }
    boolean check(String[][] relation, int row, int cols, int subset){
        for( int a = 0 ; a < row-1 ; a++){
            for(int b= a + 1 ; b < row;b++){
                boolean check = true;
                for(int k = 0; k < cols; k++){
                    if((subset & 1 << k)==0) continue;
                    if(!relation[a][k].equals(relation[b][k])){
                        check = false;
                        break;
                    }
                }
                if(check) return false;
            }
        }
        return true;
    }
}
