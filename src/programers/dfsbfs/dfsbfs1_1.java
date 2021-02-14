package programers.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class dfsbfs1_1 {
    // 타겟 넘버 BFS로 푸는 방법

    class Pair {
        int cur;
        int index;

        Pair(int cur, int index) {
            this.cur = cur;
            this.index = index;
        }
    }


    public int solution(int[] numbers, int target) {

        int answer = 0;

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0, 0));
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (p.index == numbers.length - 1) {
                if (p.cur == target) {
                    answer += 1;
                }
                continue;
            }
            queue.add(new Pair(p.cur + numbers[p.index + 1], p.index + 1));
            queue.add(new Pair(p.cur - numbers[p.index + 1], p.index + 1));
        }

        return answer;

    }


    public static void main(String[] args) {
        dfsbfs1 dfsbfs1 = new dfsbfs1();
        System.out.println(dfsbfs1.solution(new int[]{1, 1, 1, 1, 1}, 3));
    }
}
