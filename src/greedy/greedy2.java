package greedy;

//조이스틱
public class greedy2 {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int minlen = len -1 ;

        // 모든 경우의 수를 따지기 위해 모든 문자열 모든 글자에서 반복
        for(int i = 0  ; i <len ; i++){

            // 왼쪽 방향키를 눌럿을 때 빠른지 아니면 오른쪽 방향키를 눌렀을때 빠른지
            int F = name.charAt(i) - 'A';
            int B = 1+ 'Z' - name.charAt(i);
            answer += F>B ? B : F;

            // 커서는 글자의 양 보다 1개더 많음 |A|B|C|A|A|C|
            int next = i + 1;
            // 만약 A를 발견시 A가 반복되는 갯수를 구함
            while(next<len && name.charAt(next) == 'A'){
                ++next;
            }

            // 커서의 움직임이 제일 작은 값을 찾는 것 해당 문자에서 앞쪽, 뒤쪽중에서 값이 낮은 값을 고름
            minlen = Math.min(minlen, i+len-next+Math.min(i, len-next));

        }

        return answer+ minlen ;
    }

    public static void main(String[] args) {
        int prev = 'A';
        int next = 'Z';
        greedy2 greedy2 = new greedy2();
        System.out.println(greedy2.solution("JEROEN"));
        System.out.println(greedy2.solution("JAN"));
        System.out.println(greedy2.solution("AABAAAB"));

        System.out.println(greedy2.solution("AABAABAA"));
        System.out.println(greedy2.solution("AAAAA"));
        System.out.println(greedy2.solution("ABAABBAAABBBAAAA"));
        System.out.println(greedy2.solution("BBBBBB"));
    }
}
