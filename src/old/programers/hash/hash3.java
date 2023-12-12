package old.programers.hash;

import java.util.*;

public class hash3 {
    public int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> map = new HashMap<>(); // 장르와 얼마나 들었는지
        HashMap<String, PriorityQueue<Integer>> map2 = new HashMap<>(); // 장르와 순서
        int count = 1 ;
        for( int i =0 ; i < plays.length; i++){
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // 우선순위 큐 생성
            if(map.get(genres[i]) != null){ // 장르에 아직 값이없다면

                priorityQueue = map2.get(genres[i]); // 장르의 들은 양을 불러오기
                map.put(genres[i], map.get(genres[i]) + plays[i]); // 더하기
                priorityQueue.offer(plays[i]);
                map2.put(genres[i], priorityQueue);

            }else{ // 장르에 값이 있다면
                map.put(genres[i], plays[i]);
                priorityQueue.offer(plays[i]);
                map2.put(genres[i], priorityQueue);
            }

        }
        ArrayList<String> no = new ArrayList<>(map.keySet()); // 중복되지않은 장르
        Collections.sort(no, ((o2, o1) -> (map.get(o1).compareTo(map.get(o2))))); // 정렬 장르의 크기가 누가 더큰지

        ArrayList<Integer> result = new ArrayList<>();

        for(String s : no){
            count = 0;
            Integer[] list2 = new Integer[map2.get(s).size()];
            int len=0;
            for(int i : map2.get(s)){
                list2[len] = i;
                len++;
            }
            Arrays.sort(list2,Collections.reverseOrder()); // 리스트 역순
            for(int i : list2){ // 2개씩 출력해야기 때문에
                if(count!=2){
                    result.add(i);
                    count++;
                }
            }
        }
        int[] answer = new int[result.size()];
        for(int i = 0 ; i < answer.length; i++){

            for(int j = 0 ; j < plays.length; j++){
                if(result.get(i) == plays[j]){ // 똑같은 숫자가 있을 수 도 있기 때문에에
                    answer[i] = j;
                    plays[j] = 0;
                    break;

                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        hash3 stack1 = new hash3();
        System.out.println(stack1.solution(new String[]{"classic", "classic","classic", "classic","pop"}, new int[]{500,150,800,800,2500}));
    }
}
