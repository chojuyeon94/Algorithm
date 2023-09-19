import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[4];
        
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        
        if(map.size() == 1) return 1111 * a;
        else if(map.size() == 2){
            
            for(int key : map.keySet()){
                
                if(map.get(key) == 3) return (7 * key + a + b + c + d) * (7 * key + a + b + c + d);
                
                else if(map.get(key) == 2){
                    
                    int otherKey = 0;
                    for(int other : map.keySet()){
                        if(other != key) otherKey = other;      
                }
                    return (key + otherKey) * Math.abs(key - otherKey);  
            }
        }     
    }
        
        else if(map.size() == 3){
            
            int twiceNum = 0;
            int result = 1;
            
            for(int key : map.keySet()){
                if(map.get(key) == 2) twiceNum = key;
                else result *= key;
                
            }
            
            return result;
            
        }
        
        else return Math.min(Math.min(a, b), Math.min(c, d));
        
        return -1;
    }

        
}