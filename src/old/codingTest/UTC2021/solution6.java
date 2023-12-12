package old.codingTest.UTC2021;

public class solution6 {
    public String solution(double time, String[][] plans) {
        String answer = "";
        double Monday = 13;
        double Monday_work = 5;
        double Friday = 18;
        double Friday_work = 8.5;

        for(int i = 0 ; i < plans.length; i++){
            double time2 = time;
            int plan_first = Integer.parseInt(plans[i][1].replace("PM","").replace("AM",""));
            int plan_end = Integer.parseInt(plans[i][2].replace("PM","").replace("AM",""));
            if(plans[i][1].contains("PM")) plan_first+=12;
            if(plans[i][2].contains("PM")) plan_end+=12;
            if(plan_first < Friday){
                double over = Friday - plan_first > Friday_work ? Friday_work : Friday - plan_first;
                time2 -= over;
            }
            if(plan_end > Monday){
                double over = plan_end - Monday > Monday_work ? Monday_work : plan_end - Monday;
                time2 -= over;
            }
            if( time2 >= 0){
                return plans[i][0];
            }
        }
        return answer;
    }
}
