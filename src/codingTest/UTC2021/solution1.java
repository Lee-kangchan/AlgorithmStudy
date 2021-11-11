package codingTest.UTC2021;

public class solution1 {
    public int[] solution(int[] arr) {
        int[] answer = new int[3];
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            answer[arr[i]-1]++;
            max = max > answer[arr[i]-1] ? max : answer[arr[i]-1];
        }
        for(int i=0 ; i < answer.length; i++){
            answer[i] = max - answer[i];
        }
        return answer;
    }
}
