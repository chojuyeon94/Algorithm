import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int time[][] = new int[n][2];

        for(int i = 0; i < n; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            time[i][0] = Integer.parseInt(stringTokenizer.nextToken()); //회의 시작시간
            time[i][1] = Integer.parseInt(stringTokenizer.nextToken()); //회의 종료시간
        }

        Arrays.sort(time, (a, b) -> {
            if(a[1] == b[1]) return a[0] - b[0];
            else return a[1] - b[1];
        });

        System.out.println(greedy(time, n));


    }

   public static int greedy(int[][] time, int n){

        int count = 0;
        int prevEndTime = 0;

        for(int i = 0; i < n; i++){
            if(prevEndTime <= time[i][0]){
                prevEndTime = time[i][1];
                count++;
            }
        }

        return count;

   }

}