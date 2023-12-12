package old.programers.level3;

//줄 서는 방법
public class Solution {
    public int[] solution(int n, long k){
        int[] answer = new int[n];
        boolean[] number = new boolean[n+1];
        long num = 1 ;
        for(int i = 1 ; i <= n ; i ++){
            num = num * i;
        }
        long num2 = 0 ;
        for(int i = n ; i >=1 ; i--){
            int j = 0 ;
            int count = 1 ;
            while(j < n){
                System.out.println((num2 + (num/i)*(count-1)) +" < k <= "+ (num2+(num/i)* count) );
                j++;
                if(number[j]){
                    continue;
                }
                if(num2 + (num/i)*(count-1) < k && num2 + (num/i)*count >= k){
                    number[j] = true;
                    answer[n-i] = j;
                    num2 = num2 +  (num / i )* (count-1);
                    num = num/i;
                    break;
                }
                count++;

            }
            System.out.println("check");
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i : solution.solution(3,5)){
            System.out.println(i);
        }
    }
}
