package old.programers.level2;

//스킬트리
public class summer_winter_coding2018 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Skilldata[] skillPrev = new Skilldata[skill_trees.length];
        for(int i =0 ; i < skillPrev.length ; i++){
            skillPrev[i] = new Skilldata();
        }


        for(int i = 0 ; i<skill.length() ; i++){
            for(int j =0 ; j< skill_trees.length; j++){
                for(int k = 0 ; k< skill_trees[j].length();k++){
                    if(skill_trees[j].charAt(k) == skill.charAt(i)){
                        if(i == 0 ){
                            skillPrev[j].skill =  skill.charAt(i);
                            skillPrev[j].date = k;
                        }
                        else{
                            if(skill.charAt(i-1)==skillPrev[j].skill && skillPrev[j].date <k){
                                skillPrev[j].skill =  skill.charAt(i);
                                skillPrev[j].date = k;
                            }
                            else{
                                skillPrev[j].bool = true;
                            }
                        }

                    }
                }
            }
        }
        for(int i = 0 ; i< skillPrev.length; i++){
            System.out.println(skillPrev[i].skill + " -- "+ skillPrev[i].date + " -- " + skillPrev[i].bool);
            if(!skillPrev[i].bool){
                answer++;
            }
        }
        return answer;
    }
}

class Skilldata{
    char skill;
    int date;
    boolean bool;

}