package programers.level1;

//자연수 뒤집어 배열로 만들기
public class solution22 {
    public int[] solution(long n) {
        String t = String.valueOf(n);
        int[] answer = new int[t.length()];
        for(int i = 0 ;  i < t.length() ; i++){
            answer[i] = Integer.parseInt(String.valueOf(t.charAt(t.length()-1- i)));
        }

        return answer;
    }
}
