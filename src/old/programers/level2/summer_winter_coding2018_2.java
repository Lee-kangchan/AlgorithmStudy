package old.programers.level2;

import java.util.ArrayList;

//소수 만들기
public class summer_winter_coding2018_2 {
    public int solution(int[] nums) {
        int answer = -1;
        String data = "";
        ArrayList<Integer> list = new ArrayList<>();
        solve(list, nums, 0, 1, 2);

        return list.size();
    }
    public void solve(ArrayList<Integer> set, int[] nums, int x,int y, int z){
        int result = nums[x]+nums[y]+nums[z];

        System.out.print(result + "  ");
        if(check(result)){
            set.add(result);
        }
        if(x == nums.length-3 && y == nums.length-2 && z == nums.length - 1){
            return;
        }
        else if(y == nums.length-2 && z == nums.length - 1){
            solve(set, nums, x+1, x+2, x+3);
        }
        else if(z== nums.length-1){
            solve(set, nums, x, y+1, y+2);
        }else{
            solve(set, nums, x, y, z+1);
        }



    }
    public boolean check(int num){
        if(num >= 2){
            for(int i=2; i < num; i++){
                if(num%i==0){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
}
