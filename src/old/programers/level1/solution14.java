package old.programers.level1;

// 에라토스테네스의 체를 사용한 소수찾기 - 최적의 알고리즘
// 나자신의 배수들을 배열에 사용했다고 체크
// 체크안한것들은 이제 소수가 됨
public class solution14 {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n];
        for(int i = 2 ; i < n; i++){
            if(arr[i] == 1){
                continue;
            }
            for(int j = i+ i  ; j < arr.length; j+=i){
                   arr[j-1] = 1;
            }
        }

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]==0){
                answer++;
            }
        }
        return answer;
    }

}
