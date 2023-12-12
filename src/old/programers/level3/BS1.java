package old.programers.level3;

// 이분탐색 - 입국심사
public class BS1 {
    public long solution(int n, int[] times) {
        long answer = 0;
        long left =0 , mid = 0 , right = 0 ;

        for(int time : times){
            if(time > right){
                right = time;
            }
        }
        right = right * n;
        while(left <= right){
            long data = 0;
            mid = (left + right) /2;
            for(int time : times){
                data = data + mid / time;
            }
            if(data > n){
                right = mid -1;
            }else{
                answer = mid;
                left = mid + 1;
            }

        }
        return answer;
    }
}