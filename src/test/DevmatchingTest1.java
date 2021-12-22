package test;

import java.util.HashSet;

public class DevmatchingTest1 {
    public String solution(String[] registered_list, String new_id) {
        String answer = "";

        String S ="" ;
        int N = 0 ;

        for(int i = 0 ; i <new_id.length(); i++){
            switch (new_id.charAt(i)){
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    S = new_id.substring(0, i);
                    N = Integer.parseInt(new_id.substring(i));
                    break;
                default:
                    S = new_id;
                    N = 0;
            }
            if(N != 0 ){
                break;
            }
        }
        HashSet<String> hashSet = new HashSet<>();
        for(String s : registered_list){
            if(s.contains(S)){
                hashSet.add(s);
            }
        }
        int i = 0 ;
        while(true){
            String data = (S+N).replace("0","");
            if(hashSet.contains(data)){
                N++;
            }else{
                answer = data;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        DevmatchingTest1 s = new DevmatchingTest1();
        System.out.println(s.solution(new String[] {"card", "ace13", "ace16", "banker", "ace17", "ace14"} , "ace17"));
    }
}
