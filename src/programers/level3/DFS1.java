package programers.level3;

// 깊이/너비 우선 탐색(DFS/BFS) : 단어변환
public class DFS1 {
    public int solution(String begin, String target, String[] words){
        solve(begin, target, words, 0);
        return answer;
    }

    int answer = 0;
    public void solve(String begin, String target, String[] words, int count){
        if(0== words.length){
            return;
        }
        if(begin.equals(target)){
            if(answer == 0 || answer > count){
                answer = count;
            }
            return;
        }
        for(String word : words) {
            if(compare(begin,word)){
                String[] arr = new String[words.length-1];
                int count2 = 0;
                for(String word2 : words){
                    if(!word2.equals(word)){
                        arr[count2] = word2;
                        count2++;
                    }
                }
                solve(word, target, arr, count+1);
                break;
            }
        }
    }
    public boolean compare(String a , String b){
        int count = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b.charAt(i)){
                count++;
            }
        }
        if(count == 1){
            return true;
        }else {
            return false;
        }
    }


}
