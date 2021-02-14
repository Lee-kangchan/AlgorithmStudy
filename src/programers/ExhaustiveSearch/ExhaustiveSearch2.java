package programers.ExhaustiveSearch;

//카펫
public class ExhaustiveSearch2 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        solve(1, yellow, brown, yellow, answer);
        return answer;
    }
    public void solve(int x, int y, int brown, int yellow, int[] answer){
        System.out.println(x+"----"+y);
        System.out.println(x*y +"----------"+ ((x+2)*2 + (y+2)*2 -4) );
        if(((x*y) == yellow && ((x+2)*2 + (y+2)*2 -4) == brown)){
            answer[0] =  x>y ? x+2: y+2;
            answer[1] =  x>y ? y+2 : x+2;
        }
        if(answer[0]!=0){
            return;
        }
        if(((x)*(y)) > yellow|| y == 1 ){
            return;
        }

        int max = x;
        int min = y;
        for(int i = 1 ; i < yellow/2+1 ; i++){
            if(yellow%i ==0&& max<i){
                max = i;
                break;
            }
        }
        for(int j = yellow ; j >= 1 ; j--){
            if(yellow%j ==0&& min>j){
                min = j;
                break;
            }
            System.out.println(j);
        }
        solve(max, min, brown, yellow, answer);
    }

    public static void main(String[] args) {
        ExhaustiveSearch2 exhaustiveSearch2 = new ExhaustiveSearch2();
        for(int i : exhaustiveSearch2.solution(8,1)){
            System.out.println(i);
        }
    }
}
