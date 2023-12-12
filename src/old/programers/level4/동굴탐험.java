package old.programers.level4;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class 동굴탐험 {
    public boolean solution(int n, int[][] path, int[][] order) {
        boolean answer = true;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < order.length; i++){
            for(int j = 0 ; j < order[0].length; j++){
                set.add(order[i][j]);
            }
        }

        for(int i = 0 ; i < order.length; i++){
            set.remove(order[i][0]);
            set.remove(order[i][1]);
            boolean success = false;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(order[i][0]);
            while(!queue.isEmpty()){
                int data = queue.poll();
                if(data == order[i][1]){
                    success = true;
                    break;
                }

                for(int j = 0 ; j < path.length; j++){
                    for(int k = 0 ; k < path[0].length; k++) {
                        if (data == path[j][k]) {
                            if (!set.contains(path[j][(k+1)%2])) {
                                queue.add(path[j][(k+1)%2]);
                            }
                        }
                    }
                }
            }
            if(!success){
                return false;
            }
        }

        return true;
    }
}
