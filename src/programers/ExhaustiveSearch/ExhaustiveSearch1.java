package programers.ExhaustiveSearch;

import java.util.HashSet;

//Level2.소수찾기  완전탐색
public class ExhaustiveSearch1 {
    public int solution(String numbers) {
        HashSet<Integer> answer = new HashSet<>();
        solve(numbers, "", answer);

        for(int i : answer){
            System.out.println(i);
        }
        return answer.size();
    }
    public void solve(String numbers, String str, HashSet<Integer> set) {
        if(!str.equals("")){
            if(condition(Integer.parseInt(str))){
                set.add(Integer.parseInt(str));
            }
        }

        for(int i = 0 ; i < numbers.length(); i ++){
            String first = numbers.substring(0,i) + numbers.substring(i+1, numbers.length());
            String second = str+numbers.charAt(i);
            solve(first, second,set);
        }
    }


    public Boolean condition(int numbers){

        if (numbers < 2){
            return false;
        }
        for(int i = 2 ; i < numbers ; i++){
            if(numbers%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ExhaustiveSearch1 exhaustiveSearch1 = new ExhaustiveSearch1();
        System.out.println(exhaustiveSearch1.solution(new String("17")));
        System.out.println("--");
        System.out.println(exhaustiveSearch1.solution(new String("011")));
    }
}
