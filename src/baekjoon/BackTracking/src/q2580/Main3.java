package baekjoon.BackTracking.src.q2580;
import java.util.*;

public class Main3 {
    static int[][] board = new int[9][9];
    static ArrayList<int[]> list = new ArrayList<>(); // ��ĭ�� ��ǥ�� ����
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
                if((board[i][j] = sc.nextInt())==0) // �Է°��� 0�̸�
                    list.add(new int[]{i, j}); // ����Ʈ�� ����
        //�Է� ��    
        sudoku(0);
    }
    static void sudoku(int count){
        if(count == list.size()){ // �� ĭ�� ��� ä���
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++)
                    System.out.print(board[i][j] + " ");
                System.out.println();
            }
            System.exit(0); // ��� �� ����
        }
        int y = list.get(count)[0];
        int x = list.get(count)[1];
        for(int i=1; i<=9; i++){
            if (isPromising(x, y, i)) {
                board[y][x] = i; // �����ϸ� �ְ�
                sudoku(count+1);
                board[y][x] = 0; // �ȵǸ� �ʱ�ȭ
            }
        }
    }
    static boolean isPromising(int x, int y, int num){
        // x�� �˻�
        for(int i=0; i<9; i++)
            if (num == board[y][i]) return false;
        // y�� �˻�
        for(int i=0; i<9; i++)
            if (num == board[i][x]) return false;
        // ���� �簢�� �˻�
        int x_ = x/3*3; // ���� �簢�� ù x��ǥ
        int y_ = y/3*3; // ���� �簢�� ù y��ǥ
        for(int i= y_; i<y_+3; i++)
            for(int j= x_; j<x_+3; j++)
                if(num == board[i][j]) return false;
        return true;
    }
}