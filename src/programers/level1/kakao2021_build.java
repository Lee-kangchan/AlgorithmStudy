package programers.level1;

//신규 아이디 추
public class kakao2021_build {
    public String solution(String new_id) {
        String answer = "";
        String answer2 = "";
        //1번
        answer = new_id.toLowerCase();
        //2번
        answer2 = answer.replaceAll("[^-_.a-z0-9]","");
        answer2 = answer2.replaceAll("[.]{2,}",".");
        answer2 = answer2.replaceAll("^[.]|[.]$", "");
        //5번
        if(answer2.length() == 0){
            answer2 += "a";
        }

        System.out.println("5번: "+answer2);
        //6번
        if(answer2.length() >= 16){
            answer2 = answer2.substring(0,15);
            answer2 = answer2.replaceAll("^[.]|[.]$", "");
        }
        System.out.println("6번: "+answer2);
        //7번
        if(answer2.length() <=2){
            answer2 = answer2 + answer2.charAt(answer2.length()-1) ;
        }

        System.out.println("7번: "+answer2);

        return answer2;
    }
}
