package old.programers.level3;

// 2*n 타일링
public class Solution1 {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println();



    }
    public int solution(int n){
        int a = 1 , b = 2;
        int result = 0;

        for(int i = 3 ; i <n ; i++) {
            result = (a+b) %1000000007;
            a= b;
            b = result;
        }
        return  result;
   }
}
