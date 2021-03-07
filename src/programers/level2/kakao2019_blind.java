package programers.level2;

//후보키
public class kakao2019_blind {
    public int solution(String[][] relation) {
        int answer = 0;

        return answer;
    }
    public void solve(String[][] relation, int count, boolean[] bool, String data){

        if(count != 0) {
            for(int j = 0 ; j < relation[0].length ; j++) {
                boolean check = false;
                if(!bool[j]) {
                    for (int i = 0; i < relation.length; i++) {
                        for (int k = 0; k < relation.length; j++) {
                            if (relation[k][j].equals(data + relation[i][j])) {
                                check = true;
                            }
                        }
                    }
                }

            }
        }
    }
}
