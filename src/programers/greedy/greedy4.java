package programers.greedy;

import java.util.Arrays;

// 구명 보트
public class greedy4 {
    public int solution(int[] people, int limit) {
        int answer = 0;

        //사람의 몸무게 순으로 정렬한다.
        Arrays.sort(people);
        int j = 0 ;

        // 몸무게가 제일 많이 나가는 사람부터 반복문을 돌린다
        // 탈출하지 못한 몸무게가 제일 작은 사람과 몸무게가 제일 많이 나가는 사람을 태워보낸다
        // 하지만 보트의 무게 제한이 있어서 두명의 몸무게를 더했을 때 limit 넘어가면 두명이 못탄다
        // 몸무게 많은사람과 적은사람을 합쳐서 무게 제한이 넘길경우 몸무게 많이 나가는 사람은 누구와 타도 탈 수가 없다. (그래서 큰 몸무게부터)
        for(int i = people.length -1 ; i >= j; i--){
            if(people[i] + people[j] <= limit){
                answer ++;
                j++;
            }else{
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        greedy4 greedy4 = new greedy4();

        System.out.println(greedy4.solution(new int[]{70, 50, 80, 50}, 100));
        System.out.println(greedy4.solution(new int[]{70, 80, 50}, 100));
        System.out.println(greedy4.solution(new int[]{160, 150, 140, 60, 50, 40}, 200));

    }
}
