package programers.level3;

// 동적 계획법: 정수 삼각형
public class DP2 {
    public int solution(int[][] triangle) {
        int answer = 0;
        solve(triangle.length-1, triangle);
        return max;
    }
    int max = 0 ;
    public void solve(int layer, int[][] triangle){

        layer = layer-1;
        for(int i = 0 ; i< triangle[layer].length; i++){
            triangle[layer][i] += triangle[layer+1][i] > triangle[layer+1][i+1] ? triangle[layer+1][i] : triangle[layer+1][i+1];
        }
        if(layer == 0){
            max = triangle[0][0];
            return;
        }
        solve(layer-1, triangle);
        return ;
    }
}
