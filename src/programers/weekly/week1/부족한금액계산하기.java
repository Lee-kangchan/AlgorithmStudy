package programers.weekly.week1;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        int sum = 0 ;
        int price2 = 0;
        for(int i = 0 ; i < count ; i++){
            price2 += price;
            sum += price2;
        }
        return sum > money ? sum - money : 0 ;
    }
}
