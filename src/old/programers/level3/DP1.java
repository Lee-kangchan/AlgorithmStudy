package old.programers.level3;

// 동적 계획법 N으로 표현
public class DP1 {
    public int solution(int N, int number) {
        solve(0, N, number, 0);

        return answer;
    }
    int answer = -1;
    public void solve(int count , int N, int number, int result){

        if(count> 8 || (answer != -1 && answer < number)){
            return;
        }
        if(result == number){
            if( answer == -1){
                answer =count;
            }else{
                answer = Math.min(answer, count);
            }

            return;
        }

        int T = 0;
        for(int i=0 ; i < 8-count; i++){
            T = T *10 + N;
            solve(count+i+1, N, number, result+T);
            solve(count+i+1, N, number, result-T);
            solve(count+i+1, N, number, result*T);
            solve(count+i+1, N, number, result/T);

        }
    }
}
