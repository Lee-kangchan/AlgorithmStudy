package old.programers.level2;

import java.util.HashSet;

// 2018 KAKAO BLIND [1차]뉴스 클러스터링
public class 뉴스클러스트링 {
    public int solution(String str1, String str2) {
        int answer = 0;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        HashSet<String> Allset = new HashSet<>();
        HashSet<String> Eset = new HashSet<>();
        HashSet<String> Aset = new HashSet<>();
        HashSet<String> Bset = new HashSet<>();

        for(int i = 0 ; i < str1.length()-1; i++){
            String data = (str1.charAt(i) +""+ str1.charAt(i+1)).replaceAll("[^a-z]","");
            if(data.length() !=2){
                continue;
            }

            while(Aset.contains(data)){
                data += data;
            }
            Allset.add(data);
            Aset.add(data);

        }
        for(int i =0 ; i < str2.length()-1; i++){
            String data = (str2.charAt(i) +""+ str2.charAt(i+1)).replaceAll("[^a-z]","");
            if(data.length() !=2){
                continue;
            }
            while(Bset.contains(data)){
                data += data;
            }
            Allset.add(data);
            Bset.add(data);
        }
        for(String s : Aset){
            for(String b : Bset){
                if(s.equals(b)){
                    Eset.add(b);
                }
            }
        }
        System.out.println(Eset.size() +","+ Allset.size());
        if(Allset.size() ==0){
            return 65536;
        }
        answer = (int)Math.floor((double) Eset.size() / Allset.size() * 65536);
        return answer;


    }

    public static void main(String[] args) {
        뉴스클러스트링 kakao = new 뉴스클러스트링();
        System.out.println(kakao.solution("E=M*C^2","e=m*c^2"));
        System.out.println(kakao.solution("aa1+aa2","AAAA12"));
    }
}
