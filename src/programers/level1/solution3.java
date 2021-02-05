package programers.level1;


//2016년
public class solution3 {
    public String solution(int a, int b) {
        String answer = "";
        // 1월 1일 구간은 뺌
        int count=b-1;
        for(int i = 1 ; i < a ; i++){
            switch(i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    count = count + 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    count = count + 30;
                    break;
                case 2: // 윤년이라 29일
                    count = count + 29;
                    break;
            }
        }
        count = count % 7;
        // 금요일부터 시작
        switch (count){
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5:
                answer = "WED";
                break;
            case 6:
                answer = "THU";
                break;
            case 0:
                answer = "FRI";
                break;
            case 1:
                answer = "SAT";
                break;
        }

        return answer;
    }
    public static void main(String[] args) {
        solution3 solution3 = new solution3();
        System.out.println(solution3.solution(5, 24));
    }
}
