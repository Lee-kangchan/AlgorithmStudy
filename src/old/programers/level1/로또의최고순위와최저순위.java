package old.programers.level1;

public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int win = 0;
        for(int i = 0 ; i < lottos.length; i++){
            if(lottos[i] == 0 ){
                zero++;
            }else{
                for(int j = 0 ; j < win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        win++;
                        break;
                    }
                }
            }
        }
        int win_max = win + zero;

        switch (win_max){
            case 6:
                answer[0] = 1;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 2:
                answer[0] = 5;
                break;
            case 1:
            case 0:
                answer[0] = 6;
        }
        switch (win){
            case 6:
                answer[1] = 1;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 2:
                answer[1] = 5;
                break;
            case 1:
            case 0:
                answer[1] = 6;
        }
        return answer;
    }
}
