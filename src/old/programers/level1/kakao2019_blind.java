package old.programers.level1;

import java.util.Arrays;
import java.util.Comparator;

// 실패율
public class kakao2019_blind {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        data[] data = new data[N];

        for(int i =0 ; i < N;i++){

            double count = 0, t=0;
            data[i]= new data();
            data[i].num = i+1;
            for(int j=0; j< stages.length; j++){
                if(stages[j] >= data[i].num){
                    count++;
                }
                if(stages[j] == data[i].num){
                    t++;
                }
            }
            System.out.println(count +" t" + t);
            data[i].fail = t/count;
        }

        Arrays.sort(data, new Comparator<kakao2019_blind.data>() {
            @Override
            public int compare(kakao2019_blind.data o1, kakao2019_blind.data o2) {
                return Double.compare(o2.fail,o1.fail);
            }
        });

        for(int i =0 ; i<data.length;i++){
            answer[i] = data[i].num;
            System.out.println(data[i].fail);
        }
        return answer;
    }
    class data{
        int num;
        double fail;
    }
    public static void main(String[] args) {
        kakao2019_blind kakao2019_blind = new kakao2019_blind();
        System.out.println();
        for( int i : kakao2019_blind.solution(5,new int[]{2,1,2,6,2,4,3,3})){
            System.out.println(i);
        }
    }

}
