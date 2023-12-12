package old.programers.level2;

public class challenge_season1_1 {
    //이진 변환 반복하기
    public int[] solution(String s) {
        int[] answer = new int[2];
        String binary = "1";

        int count = 0;
        int Zero = 0;
        while(!s.equals("1")&&!s.equals("0")){
            binary = "";
            for(int i = 0 ; i < s.length() ; i++){
                if(s.charAt(i) == '1'){
                    binary += "1";
                }else{
                    Zero++;
                }
            }
            s = Integer.toBinaryString(binary.length());
            count++;
        }
        answer[0] = count;
        answer[1] = Zero;
        return answer;
    }
}
