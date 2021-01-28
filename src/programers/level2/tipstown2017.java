package programers.level2;

public class tipstown2017 {
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        int left = a>b ? b : a;
        int right = a<b ? b : a;

        while(true){

            answer++;
            if(left%2!=0&&right-left ==1){
                break;
            }


            left = (left+1)/2;
            right = (right+1)/2;
            n = n/2;

        }

        return answer;
    }
}
