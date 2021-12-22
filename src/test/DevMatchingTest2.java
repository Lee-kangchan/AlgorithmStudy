package test;

import java.util.HashSet;

public class DevMatchingTest2 {
    public int solution(int leave, String day, int[] holidays) {
        int answer = -1;
        HashSet<Integer> weekend = new HashSet<>();

        for(int z : holidays){
            weekend.add(z);
        }
        int first_week = 0;
        switch (day) {
            case "MON":
                first_week = 7;
            case "TUE":
                first_week = 6;
            case "WED":
                first_week = 5;
            case "THU":
                first_week = 4;
            case "FRI":
                first_week = 3;
            case "SAT":
                first_week = 2;
            case "SUN":
                first_week = 1;
        }
        for(int i=first_week; i < 30; i+=7 ){
            weekend.add(i);
            weekend.add(i-1);
        }
        weekend.remove(0);

        for(int i= 1 ; i <=30; i++){
            int num = 1;
            int leave_data = leave;
            int days = i ;
            System.out.println("-------------");
            System.out.println("휴가 남은일 :" + leave_data + " 현재 일수 :" + days + " 몇일 갔다왓지 :" + num);
            while(leave_data != 0 && days <= 30){
                for(int j : weekend){
                    if(j == days){
                        leave_data++;
                    }
                }
                leave_data--;
                days++;
                num++;

                System.out.println("휴가 남은일 :" + leave_data + " 현재 일수 :" + days + " 몇일 갔다왓지 :" + num);
            }
            while(true){
                boolean b = false;
                for(int s : weekend){
                    if(days == s){
                        num++;
                        days++;
                        b = true;
                    }
                }
                if(!b){
                    break;
                }
                System.out.println("휴가 남은일 :" + leave_data + " 현재 일수 :" + days + " 몇일 갔다왓지 :" + num);
            }
            answer = answer > num ? answer : num;
        }
        if(answer > 30){
            return 30;
        }
        return answer;
    }

    public static void main(String[] args) {
        DevMatchingTest2 s = new DevMatchingTest2();
        System.out.println(s.solution(4,"FRI"	, new int[]{6, 21, 23, 27, 28}));
    }
}
