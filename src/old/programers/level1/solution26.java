package old.programers.level1;

//짝수와 홀수
public class solution26 {
    public String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        return answer;
    }
}
