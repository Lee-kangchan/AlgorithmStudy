package old.programers.weekly.week5;

public class 모음사전 {
    public int solution(String word) {
        int answer = 0;
        String alpha[] = new String[]{"A","E","I","O","U"};
        for(int i = 0 ; i < alpha.length; i++){
            String word_1 = alpha[i];
            answer++;
            if(word_1.equals(word)) return answer;
            for(int j = 0 ; j < alpha.length; j++){
                String word_2 = word_1 + alpha[j];
                answer++;
                if(word_2.equals(word)) return answer;
                for(int k = 0 ; k < alpha.length; k++){
                    String word_3 = word_2 + alpha[k];
                    answer++;
                    if(word_3.equals(word)) return answer;
                    for(int n = 0 ; n < alpha.length; n++){
                        String word_4 = word_3 + alpha[n];
                        answer++;
                        if(word_4.equals(word)) return answer;
                        for(int m = 0 ; m < alpha.length; m++){
                            String word_5 = word_4 + alpha[n];
                            answer++;
                            if(word_5.equals(word)) return answer;
                        }
                    }
                }
            }
        }
        return answer;
    }

}
