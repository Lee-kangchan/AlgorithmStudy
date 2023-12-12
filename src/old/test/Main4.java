package old.test;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Main4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] data = input.split(" ");
        HashMap<String, Double> category = new HashMap<>();
        for(int i = 0 ; i <data.length; i++){
            category.put((char)('A'+i)+"",Double.valueOf(data[i]));
        }
        String input2 = br.readLine();
        int len = Integer.parseInt(input2.split(" ")[0]);
        int len2 = Integer.parseInt(input2.split(" ")[1]);
        String[][] show = new String[len][len2];
        for(int i = 0 ; i < len; i++){
            String data2 = br.readLine();
            show[i] = data2.split("");
        }
        String[][] show2 = new String[len][len2];
        for(int i = 0 ; i < len; i++){
            String data2 = br.readLine();
            show2[i] = data2.split("");
        }
        //////////////////////////////////////////////

        ArrayList<content> Ydata = new ArrayList<>();
        ArrayList<content> Odata = new ArrayList<>();
        for(int i = 0 ; i < len ; i ++){
            for ( int j = 0 ; j < len2; j++){
                if(show[i][j].equals("O")){
                    Odata.add(new content(j,i,show2[i][j]));
                }
                if(show[i][j].equals("Y")){
                    Ydata.add(new content(j,i,show2[i][j]));
                }
            }
        }
        Collections.sort(Odata, new Comparator<content>() {
            @Override
            public int compare(content o1, content o2) {
                return category.get(o2.movie).compareTo(category.get(o1.movie));
            }
        });
        Collections.sort(Ydata, new Comparator<content>() {
            @Override
            public int compare(content o1, content o2) {
                return category.get(o2.movie).compareTo(category.get(o1.movie));
            }
        });
        for(int i = 0 ; i < Ydata.size(); i++){
            System.out.println(Ydata.get(i).movie + " " + category.get(Ydata.get(i).movie) + " " + Ydata.get(i).y + " " + Ydata.get(i).x);
        }
        for(int i = 0 ; i < Odata.size(); i++){
            System.out.println(Odata.get(i).movie + " " + category.get(Odata.get(i).movie) + " " + Odata.get(i).y + " " + Odata.get(i).x);
        }

    }
    static class content{
        int x;
        int y;
        String movie;
        public content(int x, int y, String movie){
            this.x = x;
            this.y = y;
            this.movie= movie;
        }
    }
}
