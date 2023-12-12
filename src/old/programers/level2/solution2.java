package old.programers.level2;

//멀쩡한 사각형
public class solution2 {
    public long solution(int w, int h) {
       long a = w;
       long b = h;

        long answer = a*b-a-b+gcd(a,b);
        // 가로 세로 한칸씩 빼면 흰칸이 중복으로 빼진 것들이 규칙적으로 하나 씩있다
        // 최대공약수가 중복된 갯수 이것을 더해줘야함
        return answer;
    }
    //유클리드 알고리즘 최대 공약수 찾기
    public long gcd(long x , long y ){
        while(y > 0){
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        solution2 solution2 = new solution2();
        System.out.println(solution2.solution(1,12));
    }
}
