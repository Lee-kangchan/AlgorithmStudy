package test;

import java.util.ArrayList;
import java.util.Stack;

public class KTest3 {
    public String solution(int n, int k, String[] cmd) {
        String answer = "";
        ArrayList<String > list = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            list.add(i+"");
        }
        int current= k ;
        Stack<Object> stack =new Stack();
        for(int i = 0 ; i < cmd.length; i++){
            if(cmd[i].length() >2) {
                String commend = cmd[i].split(" ")[0];
                int count = Integer.parseInt(cmd[i].split(" ")[1]);
                if (commend.equals("D")) {
                    current = current+ count;
                } else if (commend.equals("U")){
                    current = current - count;
                }
            }else{
                if(cmd[i].equals("C")){
                    stack.add(list.clone());
                    list.remove(current);
                    if(current == list.size()){
                        current= current-1;
                    }
                }else if(cmd[i].equals("Z")){
                    list = (ArrayList<String>) stack.peek();
                    stack.pop();
                }
            }

        }
        for(int i = 0 ; i < n ; i++){
            if(list.contains(i+"")){
                answer+="O";
            }
            else{
                answer+="X";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        KTest3 kTest3 =new KTest3();
        //System.out.println(kTest3.solution(8,2,new String[]{"D 2","C","U 3","C","D 4","C","U 2","Z","Z"}));
        //System.out.println(kTest3.solution(8,2,new String[]{"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"}));

        //System.out.println(kTest3.solution(1,0,new String[]{"C"}));
        System.out.println(kTest3.solution(8,7,new String[]{"C","C","C","Z","Z","Z"}));
    }
}
