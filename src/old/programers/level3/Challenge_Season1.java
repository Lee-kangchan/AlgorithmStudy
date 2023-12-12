package old.programers.level3;


// 월간 코드 챌린지 시즌 1 풍선터트리기
public class Challenge_Season1 {
    public int solution(int[] a) {
        int answer = 2; // 처음과 끝은 무조건 남길 수 있다.
        int l = a[0], r = a[a.length-1];
        for (int i = 1; i < a.length-1; i++) { // 가운데 풍선을 걸러낸다.
            if(l > a[i]) {
                l = a[i];
                answer++;
                System.out.println("left:"+a[i]);
            }
            if(r > a[a.length-1-i]) {
                r = a[a.length-1-i];
                answer++;
                System.out.println("right:"+a[a.length-1-i]);
            }
        }
        return l ==r ? answer-1 : answer; // l과 r이 같으면 중복 발생
    }

    public static void main(String[] args) {
        Challenge_Season1 challenge_season1 = new Challenge_Season1();
        System.out.println(challenge_season1.solution(new int[]{9,-1,-5}));
        System.out.println("----------------------------------------------");
        System.out.println(challenge_season1.solution(new int[]{-16, 27,65,-2,58,-92,-71,-68,-61,-33}));
    }
}
