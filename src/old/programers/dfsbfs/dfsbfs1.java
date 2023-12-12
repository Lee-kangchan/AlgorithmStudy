package old.programers.dfsbfs;

public class dfsbfs1 {

    // 타겟넘버 DFS로 푸는 방법
    public int solution(int[] numbers, int target) {

        int  answer = solve(numbers, target, 0,0);

        return answer;

    }
    public int solve(int [] numbers, int target, int G, int count){
        if(numbers.length <= count){
            if(G == target){
               return 1;
            }
            return 0;
        }

        int result = 0 ;
        int no = count;
        count++;
        result += solve(numbers, target, G+ numbers[no], count);
        result += solve(numbers, target, G- numbers[no], count);

        return result ;

    }
    public static void main(String[] args) {
        dfsbfs1 dfsbfs1 = new dfsbfs1();
        System.out.println(dfsbfs1.solution(new int[]{1,1,1,1,1}, 3));
    }
}
