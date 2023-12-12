package old.codingTest.codeChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Setember2 {
    int data = 0 ;
    int chance = 0 ;
    int x = 0;
    int y = 0 ;
    public int[] solution(String[] grid) {
        int[] answer = {};
        int len = (grid.length * grid[0].length()) * (grid.length * grid[0].length());
        int position = 0 ;
        Stack<String> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < 4; i++){
            int[][][] cycle = new int[grid.length][grid[0].length()][4];
            data = 0;
            chance=0;
            x= 0;
            y = 0 ;
            position = i;

            do{
                int check = 1 ;
                if(x==0 && y== 0 && position ==i  ){
                    list.add(chance);
                    break;
                }
                System.out.println("check하자");
                for(int n = 0 ; n < grid.length; n++){
                    for(int m = 0 ; m < grid[0].length(); m++){
                        for(int l = 0 ; l < 4 ; l ++){

                            System.out.print(cycle[n][m][l]);
                         if(cycle[n][m][l] == 0){
                             check = 0;
                             break;
                         }
                        }
                        System.out.println();
                        if(check == 0){
                            break;
                        }
                    }

                    if(check == 0){
                        break;
                    }
                }

                if(check == 1){
                    String d = "";
                    for(int z = 0 ; z< grid.length; z++){
                        for(int y = 0 ; y < grid[0].length(); y++){
                            for(int c =0 ; c < 4; c++){
                                d += cycle[z][y][c];
                            }
                        }
                    }
                    if(stack.contains(d)){
                        break;
                    }
                    stack.add(d);
                    list.add(chance);
                    break;
                }
                light(cycle, grid[x].charAt(y)+"",position );


            }while(len * 2 > chance );
        }

        answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    // 0 오른쪽 방향   1 윗방향  2 왼쪽 방향  3 아랫방향
    public int light(int cycle[][][], String grid,  int position){ //position 을 반환
        if(grid.equals("S")){
            if(position == 0){
                x = x+ 1 < cycle.length ? x+1 : 0;
            }
            else if(position == 1){
                y = y+ 1 < cycle[0].length ? y+1 : 0;
            }else if(position == 2){
                x = x-1 >= 0? x-1 : cycle.length-1 ;
            }else if(position == 3){
                y = y-1 >= 0? y-1 : cycle[0].length-1 ;
            }
        }else if(grid.equals("L")){
            if(position == 0){
                y = y-1 >= 0? y-1 : cycle[0].length-1 ;
                position = 1;
            }
            else if(position == 1){
                x = x+ 1 < cycle.length ? x+1 : 0;
                position = 2;
            }else if(position == 2){
                y = y+ 1 < cycle[0].length ? y+1 : 0;
                position = 3;
            }else if(position == 3){
                x = x-1 >= 0? x-1 : cycle.length-1 ;
                position = 0;
            }
        }else if(grid.equals("R")){
            if(position == 0){
                y = y-1 >= 0? y-1 : cycle[0].length-1 ;
                position = 3;
            }
            else if(position == 1){
                x = x+ 1 < cycle.length ? x+1 : 0;
                position = 0;
            }else if(position == 2){
                y = y+ 1 < cycle[0].length ? y+1 : 0;
                position = 1;
            }else if(position == 3){
                x = x-1 >= 0?  x-1 : cycle.length-1;
                position = 2;
            }
        }
        if(cycle[x][y][position] == 0){
            cycle[x][y][position] =1;
        }
        chance++;
        return position;
    }
}
