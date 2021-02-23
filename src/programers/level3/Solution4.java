package programers.level3;
//최고의 집합
public class Solution4 {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        if(n > s){
            return new int[]{-1};
        }
        else if(n == s){
            return new int[]{1};
        }
        else{
            if(s % n == 0){
                for(int i = 0 ; i < n ; i ++){
                  answer[i] = s/n;
                }
            }else {
                int num = s%n;
                for(int i = n -1 ; i > 0 ; i++){
                    answer[i] = s/n;
                    if(num != 0 ){
                        answer[i]+=1;
                        num--;
                    }
                }

            }
        }
        return answer;
    }
}
