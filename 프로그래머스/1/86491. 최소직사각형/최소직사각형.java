import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] width = new int[sizes.length]; //가로 길이
        int maxWidth = 0;
        int[] length = new int[sizes.length]; //세로 길이
        int maxLength = 0;
        
        for(int i=0;i<sizes.length;i++){
            width[i]=Math.max(sizes[i][0],sizes[i][1]); 
            //0번째부터 두 수 중 큰 수를 가로에 담음, [60,70,60,80]
            length[i]=Math.min(sizes[i][0],sizes[i][1]); 
            // 두 수 중 작은 수를 세로에 담음, [50,30,30,40]
        }
        for(int i=0;i<sizes.length;i++){
            if(width[i]>maxWidth) maxWidth=width[i]; //width 배열 중 큰 수를 구함
            if(length[i]>maxLength) maxLength=length[i];//length 배열 중 큰 수를 구함
        }
        answer = (maxWidth*maxLength);
        return answer;
    }
}