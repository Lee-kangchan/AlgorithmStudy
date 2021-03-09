package programers.level2;

import java.util.HashSet;

//후보키
public class kakao2019_blind {
    int t = 1;
    public int solution(String[][] relation) {
        for(String s : relation[0]){
            t = t*2;
        }
        solve(relation, new boolean[relation.length], 1, relation.length, relation[0].length);

        return answer;
    }
    int answer = 0;
    public void solve(String[][] relation, boolean[] check, int bit, int height, int width){
        HashSet<Integer> set = bitmask(bit);

        if(t == bit){
            return;
        }
        for(int i : set){
            if(check[i]){
                solve(relation, check, bit+1, height, width);
                return;
            }
        }
        HashSet<String> s = new HashSet<>();
        for(int i = 0 ; i < height; i++){
            String data = "";
            for(int j : set){
                data += relation[i][j];
            }
            s.add(data);
        }
        if(s.size() == height){
            answer++;
            for(int j : set){
                check[j] = true;
            }
        }

        solve(relation, check, bit+1, height, width);
    }
    public HashSet<Integer> bitmask(int bit){
        String data = Integer.toBinaryString(bit);
        HashSet<Integer> set = new HashSet<>();
        int count = data.length()-1;
        for(String s : data.split("")){
            if(s.equals("1")){
                set.add(count);
            }
            count--;
        }
        return set;
    }

    public static void main(String[] args) {
        kakao2019_blind kakao = new kakao2019_blind();
        System.out.println(kakao.solution(new String[][]{{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}}));
    }
}
