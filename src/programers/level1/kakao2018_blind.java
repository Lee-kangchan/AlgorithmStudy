package programers.level1;

// 비밀 지도
public class kakao2018_blind {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String b1[] = new String[n];
        String b2[] = new String[n];
        String answer[] = new String[n];

        for(int i = 0 ; i < n ; i ++){
            b1[i] = Integer.toBinaryString(arr1[i]);
            b2[i] = Integer.toBinaryString(arr2[i]);
            answer[i] = "";
            while(b1[i].length() != n || b2[i].length() != n){
                if(b1[i].length() < n) {
                    b1[i] = "0" + b1[i];
                }
                if(b2[i].length() < n) {
                    b2[i] = "0" + b2[i];
                }
            }
            for(int j = 0 ; j<n; j++){

                if(b1[i].charAt(j)=='1' || b2[i].charAt(j)=='1'){
                    answer[i] += "#";
                }
                else{
                    answer[i] += " ";
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        kakao2018_blind kakao2018_blind = new kakao2018_blind();
        for(String s: kakao2018_blind.solution(5, new int[]{9,20,28,18,11}, new int[]{30,1,21,17,28})){
            System.out.println(s);
        }
    }
}
