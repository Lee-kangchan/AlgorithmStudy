package programers.sort;

import java.util.Arrays;

public class Sort2 {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        int h = 0;
        int k = 0;
        Arrays.sort(citations);


        //
        for (int i = 0; i < citations.length; i++) {
            h = citations[i];
            k =  citations.length - i;
            if (k == h) {
                answer = k;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sort2 sort2 = new Sort2();
        System.out.println(sort2.solution(new int[]{3, 0, 6, 1, 5}));

    }
}
