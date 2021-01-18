package programers.level1;

//핸드폰 번호 가리기
public class solution31 {
    public String solution(String phone_number) {
        String answer = "";
        for(int i =0 ; i<phone_number.length()-4;i++){
            answer +="*";
        }
        for(int i = phone_number.length()-4 ; i<phone_number.length();i++){
            answer += phone_number.charAt(i);
        }
        return answer;
    }
}
