package programers.level1;

//두 정수 사이의 합
public class solution8 {

    // a와 b중 작은거에서 큰값사이의 크기를 구하는 것
    public long solution(int a, int b) {
        long answer = 0;
        int max = a> b ? a : b;
        int min = a> b ? b : a;

        for(int i = min ; i <= max ; i++){
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
