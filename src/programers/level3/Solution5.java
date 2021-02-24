package programers.level3;

//가징 긴 팰린드
public class Solution5 {
    public int solution(String s)
    {
        int answer = 0;

        for(int i = s.length()-1; i >= 0 ; i--){
            for(int j = 0 ; j < s.length(); j++){
                System.out.println("-----");
                if(j + i >= s.length()){
                    break;
                }
                boolean check = false;
                for(int k = 0 ; k < i/2+1; k++){
                    System.out.println(s.charAt(j+k) +""+ s.charAt(j+i - k));
                    if(s.charAt(j+k) != s.charAt(j+i - k)){
                        check = true;
                        break;
                    }
                }
                if(check){
                    continue;
                }
                answer = i+1;
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        System.out.println(solution5.solution("ecdabbcadc"));
    }
}
