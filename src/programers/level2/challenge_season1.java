package programers.level2;

//삼각 달팽이
public class challenge_season1 {
    public int[] solution(int n) {
        int[] answer = {};

       int[][] tri = new int[n][n];
       int sum = 0 ;
        for(int i =1 ; i <= n; i++){
            sum +=i;
        }
        answer = new int[sum];
        int count = n;
        int num = 1;
        int i=0, j=0, k=0, k2=0;
        while(count !=0){
            for(int a = 0; a <count; a++){
                if(k ==0) {
                    tri[k][k2 + a] = num;
                    i = k+a;
                    num++;
                }
                else{
                    tri[k][k2 +a+1] = num;
                    i = k2+a+1;
                    num++;

                }
            }
            count--;
            if(count==0){
                break;
            }
            for(int a = 0; a <count; a++){
                tri[k+a+1][i] = num;
                j = k+a+1;
                num++;
            }
            count--;
            if(count==0){
                break;
            }
            for(int a = 0; a <count; a++){
                tri[j-1-a][i-1-a] = num;
                k = j-1-a;
                k2 = i-1-a;
                num++;
            }
            count--;
        }
        int T = 0 ;
        for(i =0; i<n; i++){
            for(j = 0 ; j<n ; j++){
                if(tri[j][i]!=0) {
                    answer[T] = tri[j][i];
                    T++;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        challenge_season1 challenge_season1 = new challenge_season1();
        System.out.println(challenge_season1.solution(4));
        for(int i : challenge_season1.solution(8)){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : challenge_season1.solution(10)){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : challenge_season1.solution(15)){
            System.out.print(i + " ");
        }
    }
}
