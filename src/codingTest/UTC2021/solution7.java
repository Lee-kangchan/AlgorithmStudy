package codingTest.UTC2021;

public class solution7 {
    public String[] solution(String[] grid, boolean clockwise) {
        String[] answer = new String[grid.length];
        for(int i =0 ; i < answer.length; i++){
            answer[i] = "";
        }
        if(clockwise){
            for(int i = grid.length-1 ; i >= 0; i--){
                for(int j = grid.length-1 ; j >= i; j--){
                    if(i == j){
                        answer[grid.length - i-1] += grid[j].charAt(0)+"";
                        grid[j] = grid[j].substring(1);
                    }else{
                        answer[grid.length - i-1] += grid[j].charAt(1)+""+ grid[j].charAt(0);
                        grid[j] = grid[j].substring(2);
                    }
                }
            }
        }else{
            for(int i = grid.length-1 ; i >= 0; i--){
                for(int j = grid.length-1 ; j >= i; j--){
                    if(i == j){
                        int len = grid[j].length();
                        answer[grid.length - i-1] = grid[j].charAt(len-1)+""+ answer[grid.length - i-1] ;
                        grid[j] = grid[j].substring(0,len-1);
                    }else{
                        int len = grid[j].length();
                        answer[grid.length - i-1] = grid[j].charAt(len-1)+""+ grid[j].charAt(len-2)+answer[grid.length- i -1];
                        grid[j] = grid[j].substring(0,len-2);
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution7 solution7 = new solution7();
        System.out.println(solution7.solution(new String[]{"1","234","56789"},true));
        System.out.println(solution7.solution(new String[]{"1","234","56789"},false));
        System.out.println(solution7.solution(new String[]{"A","MAN","DRINK","WATER11", "abcdefghi"},false));
        System.out.println(solution7.solution(new String[]{"A","MAN","DRINK","WATER11"},true));
    }
}
