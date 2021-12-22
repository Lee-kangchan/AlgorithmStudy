package test.devMatchingFinal;

import java.util.Arrays;
import java.util.HashMap;

public class Solution2 {
    public int solution(int n, String[] recipes, String[] orders) {
        int answer = 0;
        HashMap<String, Integer> recipe = new HashMap<>();
        for(int i = 0 ; i < recipes.length; i++){
            String[] arr = recipes[i].split(" ");
            recipe.put(arr[0],Integer.parseInt(arr[1]));
        }
        int[] cook = new int[n];
        for(String s : orders){
            String data[] = s.split(" ");
            boolean bool = true;
            if(cook[0] >= Integer.parseInt(data[1])){
                cook[0]+= (recipe.get(data[0]));
            }
            cook[0]+= (Integer.parseInt(data[1])+ recipe.get(data[0]));
            Arrays.sort(cook);
        }
        for(int i = 0 ; i < cook.length; i++){
            System.out.println(cook[i]);
            answer = Math.max(answer, cook[i]);
        }
        return answer;
    }
}
