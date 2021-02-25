package programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

//파일명 정렬
public class kakao2018_blind2 {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1.split("[0-9]")[0].toLowerCase();
                String b = o2.split("[0-9]")[0].toLowerCase();
                String a1 = o1.replace(a,"");
                String b1 = o2.replace(b,"");
                int aa=0, bb=0;
                System.out.println(a1+"---"+b1);
                if(a.equals(b)){
                    for(int i = 0 ; i < a1.length(); i++){
                        if(a1.charAt(i)>='0'&&a1.charAt(i)<='9'){
                            aa = aa*10 + Integer.parseInt(a1.charAt(i)+"");
                        }else{
                            break;
                        }
                    }
                    for(int i = 0 ; i < b1.length(); i++){
                        if(b1.charAt(i)>='0'&&b1.charAt(i)<='9'){
                            bb = bb*10 + Integer.parseInt(b1.charAt(i)+"");
                        }else{
                            break;
                        }
                    }
                    System.out.println("귀여ㅛㅁ"+aa+"-"+bb);
                    return aa-bb;
                }else{
                    return a.compareTo(b);
                }

            }
        });
        return files;
    }



    public static void main(String[] args) {
        kakao2018_blind2 k = new kakao2018_blind2();
        for(String s : k.solution(new String[]{"img000012345", "img1.png", "img2", "IMG02"})){

        }
    }
}
