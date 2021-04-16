package programers.level3;

//멀리 뛰기
public class Solution7 {
    public long solution(int n) {
        long answer = 0;
        long a =1 , b = 2;
        long num = 0;
        if(n==1){
            return a;
        }else if(n==2) {
            return b;
        }
        for(int i = 3 ; i <= n ; i++){
            num = (a+ b) %1234567;
            a = b;
            b = num;
        }


        return num%1234567;
    }

    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.solution(1));

        System.out.println(solution7.solution(2));
        System.out.println(solution7.solution(3));
        System.out.println(solution7.solution(4));
        System.out.println(solution7.solution(5));
        System.out.println(solution7.solution(6));
    }
}
