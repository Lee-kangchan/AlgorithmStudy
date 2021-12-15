package test.devMatchingFinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution3 {

    Character[][] keyBoard = new Character[][]{
            {'q','w','e','r','t','y','u','i','o'},
            {'p','a','s','d','f','g','h','j','k'},
            {'l','z','x','c','v','b','n','m',' '}};
    HashMap<Character, List<Integer>> map = new HashMap<>();
    static int my_X = 0 ,my_Y=0;
    static int your_X = 0, your_Y=0;
    public int solution(String s) {

        for(int i = 0 ; i < keyBoard.length; i++){
            for(int j = 0 ;j < keyBoard[0].length;j++){
                map.put(keyBoard[i][j], Arrays.asList(j,i));

            }
        }

        int answer=AllData(s);
        return answer;
    }
    public int AllData(String s){
        int result = 0 ;
        for(int i = 0 ; i < s.length(); i++){
            String data = "";
            for(int j = i; j < s.length(); j++){
                data+= s.charAt(j);
                result += (data(data) %1000000007);
            }
        }
        return result;
    }
    public int data(String s){
        int answer = 0 ;
        for(int i = 0 ; i <s.length(); i++){
            List<Integer> list = map.get(s.charAt(i));
            your_X = list.get(0);
            your_Y = list.get(1);
            if(i==0){
                my_X= your_X;
                my_Y = your_Y;
            }else{
                answer+= Math.abs(my_X- your_X) + Math.abs(my_Y - your_Y);
                my_X= your_X;
                my_Y = your_Y;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution("abcc"));
    }
}
