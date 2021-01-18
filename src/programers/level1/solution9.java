package programers.level1;

import java.util.Arrays;
import java.util.Comparator;

//문자열 내 마음대로 정렬하기
public class solution9 {
    //해당 index의 자료를 비교했지만 같을경우 전체 문자를 비교를 한다.
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n)== o2.charAt(n)){
                    return o1.compareTo(o2);
                }

                return o1.charAt(n) - o2.charAt(n);
            }
        });
        return strings;
    }
}
