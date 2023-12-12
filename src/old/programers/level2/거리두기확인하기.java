package old.programers.level2;

public class 거리두기확인하기 {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        int x[] = new int[]{1,1,-1,-1};
        int y[] = new int[]{1,-1,1,-1};
        int x1[] = new int[]{1,0,0,-1};
        int y1[] = new int[]{0,1,-1,0};
        for(int i = 0 ; i < places.length; i++){
            answer[i] = 1;
            for(int j = 0 ; j < 5; j++){
                for(int k = 0 ; k < 5 ; k++){
                    if(places[i][j].charAt(k) == 'P'){
                        for(int C = 0; C < 4; C++){

                            if(j + y1[C] >= 0 && k + x1[C] >=0 && j + y1[C] < 5 && k + x1[C] < 5 ) {
                                if (places[i][j + y1[C]].charAt(k + x1[C]) == 'P') {
                                    answer[i] = 0;
                                    break;
                                }
                            }
                            if(j + y1[C] + y1[C] >= 0 && k + x1[C]+ x1[C] >=0 && j + y1[C]+ y1[C] < 5 && k + x1[C]+ x1[C] < 5 ) {
                                if (places[i][j + y1[C]].charAt(k + x1[C]) == 'O') {

                                    if (places[i][j + y1[C] + y1[C]].charAt(k + x1[C] + x1[C]) == 'P') {
                                        answer[i] = 0;
                                        break;
                                    }
                                }
                            }
                        }
                        for(int C = 0 ; C < 4; C++){
                            if(j + y[C] >= 0 && k + x[C] >=0 && j + y[C] < 5 && k + x[C] < 5 ){
                                if(places[i][j + y[C]].charAt(k) == 'O'){
                                    if(places[i][j+y[C]].charAt(k+x[C]) == 'P'){
                                        answer[i] = 0;
                                        break;
                                    }
                                }
                                if(places[i][j].charAt(k+x[C]) == 'O'){
                                    if(places[i][j+y[C]].charAt(k+x[C]) == 'P'){
                                        answer[i] = 0;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if(answer[i] ==0) break;
                }
                if(answer[i] ==0) break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        거리두기확인하기 s = new 거리두기확인하기();
        System.out.println(s.solution(new String[][]{{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "OOOPP"}}));
    }
}
