package programers.level2;
//카카오 프렌즈 컬러링북
public class kakao2017 {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[] answer = new int[2];

        for(int i =0 ; i < m; i++){
            for(int j=0; j<n ; j++){
                if(picture[i][j]!=0){
                    System.out.println(picture[i][j]);
                    numberOfArea++;
                    maxSizeOfOneArea = maxSizeOfOneArea == 0 ? maxSizeOfOneArea : Math.max(check(picture, i, j, picture[i][j]), maxSizeOfOneArea);
                }
            }
        }


        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    public int check(int[][] picture, int x, int y, int check){
        if(x<0 || y<0 || x>= picture.length || y >= picture[0].length||picture[x][y] ==0 || picture[x][y] != check){
            return 0;
        }
        picture[x][y] = 0;
        return 1 + check(picture, x+1, y , check) + check(picture, x-1, y, check) + check(picture, x, y+1, check) + check(picture, x, y-1, check);

    }
}
