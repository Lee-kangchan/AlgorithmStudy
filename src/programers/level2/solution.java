package programers.level2;

// 가장 큰 정사각형 찾기
public class solution {
    public int solution(int[][] board) {
        int answer = 0, row = board.length, col = board[0].length;
        int[][] map = new int[row + 1][col + 1];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                map[i + 1][j + 1] = board[i][j];
            }
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (map[i][j] != 0) {
                    map[i][j] = Math.min(Math.min(map[i - 1][j], map[i][j - 1]), map[i - 1][j - 1]) + 1;
                    answer = Math.max(answer, map[i][j]);
                }
            }
        }

        return answer * answer;
    }


    public static void main(String[] args) {
        solution solution = new solution();
        System.out.println(solution.solution(new int[][]{{0,0,0,0},{0,0,0,0}}));

    }
}