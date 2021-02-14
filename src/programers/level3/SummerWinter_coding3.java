package programers.level3;

//기지국 설치
public class SummerWinter_coding3 {
    public int solution(int n, int[] stations, int w) {
        boolean check[] = new boolean[n];
        int answer = 0;
        for (int i : stations) {
            for (int j = 0; j <= w; j++) {
                if (i + j - 1 < n) {
                    check[i + j] = true;
                }
                if (i - j - 1 >= 0) {
                    check[i - j] = true;
                }
            }
        }
        int count = 0;
        while (count < check.length) {
            if (!check[count]) {
                int min = count, max = count, mid = 0;
                answer++;
                while (count < check.length ) {
                    if(!check[count]) {
                        max = count;
                        count++;
                    }else{
                        break;
                    }
                }
                mid = (max + min) / 2;
                for (int k = 0; k <= w; k++) {
                    if (mid + k - 1 < check.length && mid + k - 1 >= 0) {
                        check[mid + k - 1] = true;
                    }
                    if (mid - k - 1 >= 0) {
                        check[mid - k - 1] = true;
                    }
                }
                count = 0 ;
            } else {
                count++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SummerWinter_coding3 summerWinter_coding3 = new SummerWinter_coding3();
        System.out.println(summerWinter_coding3.solution(11, new int[]{4,3}, 1));
        System.out.println(summerWinter_coding3.solution(16, new int[]{9}, 2));
    }
}
