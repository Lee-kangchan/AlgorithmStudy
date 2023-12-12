package old.programers.level1;
// 문자열 내 p와 y의 갯수
public class solution10 {
    boolean solution(String s) {
        boolean answer = true;
        int P = 0 ;
        int Y = 0 ;

        for(int i =0 ; i <s.length(); i++){
            if(s.charAt(i)=='P'||s.charAt(i)=='p'){
                P++;
            }
            else if(s.charAt(i)=='Y'||s.charAt(i)=='y'){
                Y++;
            }
        }
        System.out.println(P+" "+Y);
        if(P==Y){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}
