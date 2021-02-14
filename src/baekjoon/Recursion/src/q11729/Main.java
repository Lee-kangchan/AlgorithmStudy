package baekjoon.Recursion.src.q11729;


import java.io.*;

public class Main {
    public static BufferedReader br;
    public static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = (int) Math.pow(2, N) - 1;

        System.out.println(count);
        hanoi(N, 1, 2, 3);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void hanoi(int n, int from, int by, int to) throws IOException {
        if (n == 0) {
            return;
        }

        hanoi(n - 1, from, to, by);
        bw.write(from + " " + to + "\n");
        hanoi(n - 1, by, from, to);
    }
}
/*
 * 
 * 1. n 개의 원반이 있을 때 n - 1개의 원반은 첫 번째 칸에서 두 번째 칸으로 이동한다.

hanoi(n - 1, from, to, by)

2. n 번째 원반을 첫 번째 칸에서 세 번째 칸으로 옮긴다.

move(from, to)

3. 두 번째 칸에 있는 n - 1개의 원반을 세 번째 칸으로 이동한다.

hanoi(n - 1, by, from, to)
 */