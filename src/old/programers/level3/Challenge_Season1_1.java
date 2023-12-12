package old.programers.level3;

import java.util.HashSet;

// 스타 수열
public class Challenge_Season1_1 {
    public int solution(int[] a) {
        int answer = -1;
        HashSet<Integer> set = new HashSet<>();
        int arr[] = new int[a.length+1];
        for(int i = 0 ; i <a.length ; i++){
            arr[a[i]]++;
        }
        for(int i = 0 ; i < arr.length ; i ++) {
            if(arr[i] == 0) continue;
            if(arr[i] <= answer) continue;
            int count =0;
            for (int j = 0; j < a.length -1 ; j++) {
                if(a[j] !=i &&a[j+1] != i) continue;
                if(a[j] == a[j+1]) continue;
                    count++;
                    j++;
            }
            answer = Math.max(answer, count);
        }
        return answer*2;
    }
}