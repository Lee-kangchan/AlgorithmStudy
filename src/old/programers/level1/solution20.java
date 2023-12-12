package old.programers.level1;

// 이상한 문자 만들기
public class solution20 {
    public String solution(String s) {
        String answer = "";

        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            if (Character.getType(s.charAt(j)) == 12) {
                answer += s.charAt(j);

                i = 0;
            } else if (Character.getType(s.charAt(j)) == 1 || Character.getType(s.charAt(j)) == 2) {
                if (i % 2 == 0) {
                    answer += Character.toUpperCase(s.charAt(j));
                    i++;
                } else if (i % 2 == 1) {
                    answer += Character.toLowerCase(s.charAt(j));
                    i++;
                }
            } else {
                answer += s.charAt(j);
                i++;
            }

        }
        return answer;
    }

}
