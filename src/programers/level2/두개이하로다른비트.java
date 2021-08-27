package programers.level2;

public class 두개이하로다른비트 {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i = 0 ; i < numbers.length ; i++){
            long result = 0;
            if(numbers[i] % 2 == 0){
                result = numbers[i] +1;
            }else{
                String value = "0" + Long.toBinaryString(numbers[i]);
                for(int j = value.length()-1 ; j >=0 ; j--){
                    if(value.charAt(j) == '0'){
                        value = value.substring(0,j) + "10"+value.substring(j+2);
                        break; }
                }
                result = Long.parseLong(value,2);
            }

            answer[i] = result;

        }
        return answer;
    }
}
