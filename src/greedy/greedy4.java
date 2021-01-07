package greedy;

public class greedy4 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        for(int i =0 ; i < people.length; i ++){
            if(people[i] != -1){
                int boat = limit - people[i];
                people[i] = -1;
                int count = -1;
                for(int j = i+1 ; j < people.length; j++){
                    int max = 0;
                    if(boat >= people[j]&& people[j]!=-1){
                        count = j;
                        max = Math.max(max , people[j]);
                    }
                }
                if(count!=-1){
                    people[count] = -1;
                }
                answer++;
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
