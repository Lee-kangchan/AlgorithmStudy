package programers.level1;
//3진법 뒤집기
public class solution4 {
    public int solution(int n) {
        int answer = 0;
        int num = 1;

        // 해당 번호의 3진수가 가질수 있는 최대의 값을 찾음
        while(num * 3 <= n ){
            num = num*3;
        }

        // 3진수 역순으로 해야기 때문에 최대값부터 시작하여 3을 계속 나눔
        while(n != 0 ){
            answer += (n%3)*num;
            n = n/3;
            num = num /3;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution4 solution4 = new solution4();
        System.out.println(solution4.solution(45));
    }
}
