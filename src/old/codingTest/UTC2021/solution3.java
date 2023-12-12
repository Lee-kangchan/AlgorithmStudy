package old.codingTest.UTC2021;

import java.util.HashMap;
import java.util.Map;

public class solution3 {
    public int solution(String[] ings, String[] menu, String[] sell) {
        int answer = 0;
        Map<String ,Integer> ing = new HashMap<>();
        Map<String, Integer> menus = new HashMap<>();
        for(int i = 0 ; i < ings.length; i++){
            ing.put(ings[i].split(" ")[0], Integer.parseInt(ings[i].split(" ")[1]));
        }
        for(int i = 0 ; i <menu.length; i++){
            String[] data = menu[i].split(" ");
            int money = Integer.parseInt(data[2]);
            for(int j= 0 ; j < data[1].length();j++){
                money = money - ing.get(data[1].charAt(j)+"");
            }
            menus.put(data[0], money);
        }
        for(int i= 0 ; i < sell.length; i++){
            for(int j = 0 ; j < Integer.parseInt(sell[i].split(" ")[1]); j++){
                answer += menus.get(sell[i].split(" ")[0]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution3 solution3 = new solution3();
        System.out.println(solution3.solution(new String[]{"r 10", "a 23", "t 124", "k 9"}
                , new String[]{"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"}
                , new String[]{"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"}));
    }
}
