package old.programers.level1;

public class solution5 {
    //가운데 글자 가져오기
    public String solution(String s) {
        String answer = "";
        if(s.length()%2 ==0){
            answer = answer + s.charAt(s.length()/2-1);
            answer = answer + s.charAt(s.length()/2);
        }else{
            answer = answer + s.charAt(s.length()/2);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution5 solution5 = new solution5();
        System.out.println(solution5.solution("qwer"));
    }
}
