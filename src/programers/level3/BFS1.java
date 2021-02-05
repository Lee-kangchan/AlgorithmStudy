package programers.level3;

import java.util.LinkedList;
import java.util.Queue;

// 깊이/너비 우선 탐색(DFS/BFS) : 단어변환
public class BFS1 {
    public int solution(String begin, String target, String[] words){
        int answer = 0 ;
        Queue<queueData> queue = new LinkedList<>();

        queueData queueData = new queueData();
        queueData.word = begin;
        queue.offer(queueData);

        while(!queue.isEmpty()){
            queueData data = queue.poll();
            if(data.word.equals(target)){
                return data.count;
            }
            if(data.count>=words.length){
                return 0;
            }
            for(String word : words){
                if(compare(data.word, word)){
                    queueData wordData = new queueData();
                    wordData.word = word;
                    wordData.count = data.count+1;

                    queue.offer(wordData);
                }
            }
        }



        return answer;
    }
    public boolean compare(String a , String b){
        int count = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                count++;
            }
        }
        if(count == 1){
            return true;
        }else {
            return false;
        }
    }
    class queueData{
        String word;
        int count;
    }
}
