package programers.level1;

// 음양더하기
public class 월간코드챌린지_시즌2 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0 ; i < signs.length; i++){
            if(signs[i]){
                answer = answer + absolutes[i];
            }else{
                answer = answer - absolutes[i];
            }
        }
        return answer;
    }
}
