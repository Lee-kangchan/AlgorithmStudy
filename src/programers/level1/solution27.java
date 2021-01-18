package programers.level1;

public class solution27 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int Max =0;
        int Min =99999;
        for(int i =1  ; i <= n ; i ++){
            if(n%i == 0 && m%i == 0 ){
                Max =i;
            }
        }
        for(int i = n*m ; i >= m ; i --){
            if(i%m == 0 && i%n == 0 ){
                Min = i;
            }
        }
        answer[0] = Max;
        answer[1] = Min;
        return answer;
    }
}
