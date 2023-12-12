package old.programers.level1;

public class solution12 {
    public boolean solution(String s) {

        // 4와 6이 아닐때
        if(s.length() >=4 || s.length()<= 6){
            return false;
        }


        // 숫자인지 아닌지? 아스키코드를 사용
        for(int i =0 ; i < s.length(); i++){
            System.out.println(i);
            if(s.charAt(i) <'0' || s.charAt(i) > '9'){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        solution12 solution12 = new solution12();
        System.out.println(solution12.solution("123456z"));
    }
}
