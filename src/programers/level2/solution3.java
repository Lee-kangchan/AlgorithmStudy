package programers.level2;

public class solution3 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        int count = 0;

        while(n !=0 ){
            count = n%3;
            if(0 == count){
                n = n/3 -1;
                count = 4;
            }else{
                n= n/ 3;
            }
            answer.insert(0,count);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        solution3 solution3 = new solution3();
        System.out.println(solution3.solution(5));
    }
}
