import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < keymap.length; i++){
            
            String s = keymap[i];
            
            for(int j = 0; j < s.length(); j++){
                
                char key = s.charAt(j);
                int index = map.getOrDefault(key, -1);
                if(index == -1 || index > j+1){
                    map.put(key, j+1);
                } 
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            
            String target = targets[i];
            int result = 0;
            
            for(int j = 0; j < target.length(); j++){
                
                int temp = map.getOrDefault(target.charAt(j), -1);
                
                if(temp == -1){
                    result = -1;
                    break;
                }
                else result += temp;
                
            }
            
            answer[i] = result;
            
        }
        
        
        return answer;
    }
}