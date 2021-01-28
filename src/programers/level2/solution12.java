package programers.level2;

// 파보나치 수
public class solution12 {
    public int solution(int n) {
        int answer = 0;
        int a= 0 , b= 1;
        for(int i = 0 ; i < n ; i ++ ){
            int c = (a+b) % 1234567;
            a = b% 1234567;
            b = c% 1234567;
        }
        return b;
    }
    public int solve(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 0;
        }
        return solve(n-1)+ solve(n-2);
    }
}
