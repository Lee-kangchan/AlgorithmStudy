package programers.weekly.week2;

public class 상호평가 {
    public String solution(int[][] scores) {
        String answer = "";
        int scores_cols = scores.length;
        int scores_rows = scores[0].length;
        for(int j = 0 ; j < scores_cols; j++){
            int sum = 0;
            int my_score = scores[j][j];
            int max_my_score = scores[j][j];
            int min_my_score = scores[j][j];
            for(int i = 0 ; i< scores_rows; i++){
               if(i != j) {
                   if (max_my_score <= scores[i][j] && max_my_score != 0) {
                       max_my_score = 0;
                   }
                   if (min_my_score >= scores[i][j] && min_my_score != 0) {
                       min_my_score = 0;
                   }
               }
                sum += scores[i][j];
            }
            if(max_my_score != 0 || min_my_score != 0){
                sum = sum - max_my_score - min_my_score;
                sum = sum / (scores_cols-1);
            }else {
                sum = sum / scores_rows;
            }
            System.out.println(sum);
            String rank = "";
            rank = sum >= 90 ? "A" : sum >= 80 ? "B" : sum >= 70 ? "C" : sum>= 50 ? "D" : "F";
            answer += rank;
        }
        return answer;
    }
}
