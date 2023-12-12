package old.programers.level1;

public class solution24 {
    //정수 제곱근 판별
    public long solution(long n) {
        long answer = 0;
        int sqrt = (int)Math.sqrt(n);
        double doubleSqrt = Math.sqrt(n);
        if(sqrt== doubleSqrt){
            answer = (long)Math.pow((sqrt +1),2);
        }else{
            answer = -1;
        }
        return answer;
    }
}
