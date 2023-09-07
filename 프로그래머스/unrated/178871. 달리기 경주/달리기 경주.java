import java.util.HashMap; 

class Solution {
    public String[] solution(String[] players, String[] callings) {

        int callingLength = callings.length;
        int playersLength = players.length;
        
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < playersLength; i++) {
            map.put(players[i], i);
        }

        for (int i = 0; i < callingLength; i++) {
            if (map.containsKey(callings[i])) {
                int index = map.get(callings[i]);

                if (index > 0) {
                    String temp = players[index];
                    players[index] = players[index - 1];
                    players[index - 1] = temp;

                    map.put(players[index], index);
                    map.put(players[index - 1], index - 1);
                }
            }
        }

        return players;
    }
    
}