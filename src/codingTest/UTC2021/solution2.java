package codingTest.UTC2021;

public class solution2 {
    public String solution(String[] log) {
        String answer = "";
        int time = 0 ;
        for(int i = 0 ; i < log.length; i+=2){
            String first[] = log[i].split(":");
            String end[] = log[i+1].split(":");
//            if(first[0].charAt(0) =='0') first[0] = first[0].charAt(1)+"";
//            if(first[1].charAt(0) =='0') first[1] = first[1].charAt(1)+"";
//            if(end[0].charAt(0) =='0') end[0] = end[0].charAt(1)+"";
//            if(end[1].charAt(0) =='0') end[1] = end[1].charAt(1)+"";
            System.out.println(first[0]+":"+first[1]);
            System.out.println(end[0]+":"+end[1]);
            int s = Integer.parseInt(end[1]) - Integer.parseInt(first[1]);
            int m = Integer.parseInt(end[0]) - Integer.parseInt(first[0]);
            System.out.println("계산값은" + s +":" + m);
            int result = s * 60 + m;
            if(result < 5) ;
            else if(result <= 105) time += result;
            else time += 105;
        }
        System.out.println(time+"분나왓다");
        int s = time/60;
        int m = time%60;

        if(s < 10){
            answer += "0"+s+":";
        }else{
            answer += s+":";
        }
        if(m < 10){
            answer += "0"+m;
        }else{
            answer += m;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution2 solution2 = new solution2();
        System.out.println(solution2.solution(new String[]{"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"}));
    }
}
