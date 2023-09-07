import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] targets) {
        
        Arrays.sort(targets, Comparator.comparingInt(a -> a[1]));
        
        int answer = 0;
        double lastMissile = -1;
        
        for(int[] target : targets){
            
            if(target[0] > lastMissile || target[1] < lastMissile){
                
                answer++;
                lastMissile = target[1] - 0.1;
                
            }
            
        }
        
        return answer;
    }
}