package old.programers.level2;

//최댓값과 최솟값
public class solution10 {
    public String solution(String s) {


        String[] ans = s.split(" ");
        int max =Integer.parseInt(ans[0]);
        int min =Integer.parseInt(ans[0]);

        for(int i = 1 ; i < ans.length ; i++ ){
            max = Math.max(max, Integer.parseInt(ans[i]));
            min = Math.min(min, Integer.parseInt(ans[i]));
        }

        String answer = min +" "+ max;
        return answer;
    }
}
