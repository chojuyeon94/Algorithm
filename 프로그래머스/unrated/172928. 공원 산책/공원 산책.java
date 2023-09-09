class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int[] answer = new int[2];
        
        int x = -1;
        int y = -1;
        
        int width = park[0].length();
        int height = park.length;
            
            
        for(int i = 0; i < height; i++){
            if(park[i].indexOf("S") != -1){
                x = park[i].indexOf("S");
                y = i;
                break;
            }
        }
        
        for(int i = 0; i < routes.length; i++){
            
            String[] splitString = routes[i].split(" ");
            String direction = splitString[0];
            int distance = Integer.parseInt(splitString[1]);
            
            int currentX = x;
            int currentY = y;
            
            if(direction.equals("E")){
                
                boolean flag = true;
                
                for(int j = 0; j < distance; j++){
                    
                    currentX++;
                    if(currentX >= width){
                        flag = false;
                        break;
                    }
                    
                    else if(park[currentY].charAt(currentX) == 'X'){
                        flag = false;
                        break;
                    }
                    
                    
                    
                }
                
                if(flag) x = currentX;
                
            }
            
            if(direction.equals("W")){
                
                boolean flag = true;
                
                for(int j = 0; j < distance; j++){
                    
                    currentX--;
                    if(currentX < 0){
                        flag = false;
                        break;
                    }
                    
                    else if(park[currentY].charAt(currentX) == 'X'){
                        flag = false;
                        break;
                    }
                    
                    
                    
                }
                
                if(flag) x = currentX;
                
            }
            
            if(direction.equals("S")){
                
                boolean flag = true;
                
                for(int j = 0; j < distance; j++){
                    
                    currentY++;
                    if(currentY >= height){
                        flag = false;
                        break;
                    }
                    
                    else if(park[currentY].charAt(currentX) == 'X'){
                        flag = false;
                        break;
                    }
                    
                    
                    
                }
                
                if(flag) y = currentY;
                
            }
            
            if(direction.equals("N")){
                
                boolean flag = true;
                
                for(int j = 0; j < distance; j++){
                    
                    currentY--;
                    if(currentY < 0){
                        flag = false;
                        break;
                    }
                    
                    else if(park[currentY].charAt(currentX) == 'X'){
                        flag = false;
                        break;
                    }
                    
                    
                    
                }
                
                if(flag) y = currentY; 
                
            }
            
            
            
        }
        
        answer[0] = y;
        answer[1] = x;
        
        return answer;
            
        
    }
}