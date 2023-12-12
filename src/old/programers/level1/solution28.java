package old.programers.level1;

//콜라츠 추측
public class solution28 {
    public int solution(int num) {
        int answer = 0;
        long t = num;
        while(t!=1){
            if(answer == 500){
                answer = -1;
                break;
            }
            if(t%2==0){
                t = t/2;
            }else{
                t = (t*3 )+1;
            }
            answer++;


        }
        return answer;
    }
}
