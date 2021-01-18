package programers.level1;

//하샤드 수
public class solution30 {
    public boolean solution(int x) {
        boolean answer = true;
        String t = String.valueOf(x);

        int sum = 0 ;
        for(int i =0  ; i < t.length();i++){
            sum += Integer.parseInt(String.valueOf(t.charAt(i)));
        }

        if(x%sum ==0){
            answer = true;
        }else{
            answer = false;
        }


        return answer;
    }
}
