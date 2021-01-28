package programers.level2;

public class summer_winter_coding2018_3 {
    public int solution(int n) {
        int ans = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        while(n!=0){
            if(n%2==0){
                n= n/2;
            }
            else{
                n = n - 1;
                ans++;
            }
        }
        return ans;
    }
}
