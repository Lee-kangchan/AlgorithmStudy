package old.programers.level2;

public class 행렬테두리회전하기 {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int arr[][] = new int[rows+1][columns+1];
        int count= 0;
        for(int i = 1 ; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                count++;
                arr[i][j] = count;
            }
        }
        for(int i = 0 ; i < queries.length; i++){
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int x2 = queries[i][2];
            int y2 = queries[i][3];
            answer[i] = arr[x1][y1];
            int data = arr[x1][y1];
            int data2 = 0 ;
            for(int j = y1+1; j <= y2; j++){
                data2 = arr[x1][j];
                arr[x1][j] = data;
                data = data2;
                answer[i] =  Math.min(answer[i], data);
            }
            for(int j = x1+1; j <= x2; j++){
                data2 = arr[j][y2];
                arr[j][y2] = data;
                data = data2;
                answer[i] =  Math.min(answer[i], data);
            }
            for(int j = y2-1; j >= y1; j--){
                data2 = arr[x2][j];
                arr[x2][j] = data;
                data = data2;
                answer[i] =  Math.min(answer[i], data);
            }
            for(int j = x2-1; j >= x1; j--){
                data2 = arr[j][y1];
                arr[j][y1] = data;
                data = data2;
                answer[i] =  Math.min(answer[i], data);
            }
            for(int k = 1 ; k <= rows; k++){

                for(int j = 1; j <= columns; j++){
                    System.out.print(arr[k][j] + " ");

                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
        return answer;
    }
}
