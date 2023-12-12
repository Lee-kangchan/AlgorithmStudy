package old.programers.level2;

public class solution4 {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        solve(arr, arr.length, answer);
        return answer;
    }
    public void solve(int[][] arr, int temp, int[] answer){
        int prev = arr[0][0];

        if(temp == 0){
            return;
        }
        int[][] arr2 = new int[temp/2][temp/2];
        int[][] arr3 = new int[temp/2][temp/2];
        int[][] arr4 = new int[temp/2][temp/2];
        int[][] arr5 = new int[temp/2][temp/2];

        for(int i = 0; i< arr.length; i++){
            for(int j =0 ; j<arr.length; j++){
                if(temp>=2) {
                    if (i < temp / 2 && j < temp / 2) {
                        arr2[i][j] = arr[i][j];
                    } else if (i < temp / 2 && j >= temp / 2) {
                        arr3[i][j - (temp / 2)] = arr[i][j];
                    } else if (i >= temp / 2 && j < temp / 2) {
                        arr4[i - (temp / 2)][j] = arr[i][j];
                    } else if (i >= temp / 2 && j >= temp / 2) {
                        arr5[i - (temp / 2)][j - (temp / 2)] = arr[i][j];
                    }
                }
                if(prev != arr[i][j]){
                    prev = -1;
                }
            }
        }
        if(prev != -1){
            answer[prev]++;
            return;
        }
        if(temp == 1){
            return;
        }
        solve(arr2, temp/2, answer);
        solve(arr3, temp/2, answer);
        solve(arr4, temp/2, answer);
        solve(arr5, temp/2, answer);
    }

    public static void main(String[] args) {
        solution4 solution4 = new solution4();
        for(int i : solution4.solution(new int[][]{{1,1,0,0},{1,0,0, 0},{1,0,0,1},{1,1,1,1}})){
            System.out.println(i);
        }
    }
}
