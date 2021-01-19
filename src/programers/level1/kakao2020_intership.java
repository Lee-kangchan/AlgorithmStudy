package programers.level1;

public class kakao2020_intership {
    // 카카오 인턴 키패드 누르기
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left =10, right = 12 ;
        for(int i =0 ; i < numbers.length; i++){
            switch (numbers[i]){
                case 1:
                case 4:
                case 7:
                    answer += "L";;
                    left = numbers[i];
                    break;
                case 2:
                case 5:
                case 8:
                case 0:
                    if(numbers[i] == 0){
                        numbers[i] =11;
                    }
                    int L=left;
                    int R=right;
                    while(numbers[i] != L && numbers[i] != R){
                        System.out.println(numbers[i]+"---"+L +"---"+ R);
                        switch(L){
                            case 1:
                            case 4:
                            case 7:
                            case 10:
                                L = L+1;
                                break;
                            case 2:
                            case 5:
                            case 8:
                            case 11:
                                if(L>numbers[i]){
                                    L = L-3;
                                }else if(L<numbers[i]){
                                    L = L+3;
                                }
                                break;
                        }
                        switch(R){
                            case 3:
                            case 6:
                            case 9:
                            case 12:
                                R = R-1;
                                break;
                            case 2:
                            case 5:
                            case 8:
                            case 11:
                                if(R>numbers[i]){
                                    R = R-3;
                                }else if(R<numbers[i]){
                                    R= R+3;
                                }
                                break;
                        }
                    }
                    if(numbers[i]==R && numbers[i]==L){
                        if(hand.equals("right")){
                            answer += "R";
                            right = numbers[i];
                        }else if(hand.equals("left")){
                            answer += "L";;
                            left = numbers[i];
                        }
                    }else if(numbers[i]==R){
                        answer += "R";
                        right = numbers[i];
                    }else if(numbers[i]==L){
                        answer += "L";
                        left = numbers[i];
                    }
                    break;
                case 3:
                case 6:
                case 9:
                    answer += "R";
                    right = numbers[i];
                    break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        kakao2020_intership kakao = new kakao2020_intership();
        System.out.println(kakao.solution(new int[]{1,3,4,5,8,2,1,4,5,9,5},"right"));
    }
}
