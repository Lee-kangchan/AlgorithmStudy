package old.programers.level3;

import java.util.*;

public class 다단계칫솔판매 {

    public static HashMap<String, Integer> map = new HashMap<>();
    public static int answer[];
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        answer = new int[enroll.length];
        int seller_len = seller.length;
        for(int i = 0 ; i < enroll.length; i++){
            map.put(enroll[i], i);
        }
        for(int i = 0 ; i < seller_len; i++){
            answer[map.get(seller[i])] +=  amount[i] * 90;
            sell_road(referral,seller[i],amount[i]*100);
        }
        return answer;
    }

    public void sell_road(String referral[], String enroll_current, int money){

        int i = map.get(enroll_current);
        if(referral[i].equals("-")  ) return;
        double allMoney = money * 0.1;
        if(allMoney < 1) return;
        answer[map.get(referral[i])] +=  (int)(allMoney - (int)(allMoney * 0.1));
        sell_road(referral,referral[i], (int)allMoney);

    }

    public static void main(String[] args) {
        다단계칫솔판매 s = new 다단계칫솔판매();
        System.out.println(s.solution(new String[]{"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"}, new String[]{"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"}
        ,new String[]{"young", "john", "tod", "emily", "mary"}, new int[]{12, 4, 2, 5, 10}));
    }
}
