import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String nm[] = bufferedReader.readLine().split(" ");
        String num[] = bufferedReader.readLine().split(" "); 
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] numberList = new int[n];

        for (int i = 0; i < n; i++) {
            numberList[i] = Integer.parseInt(num[i]);
        }

        System.out.println(bfs(numberList, n, m));


    }

    public static int bfs(int[] numberList, int n, int m){

        int result = 0;

        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                   int sum = numberList[i] + numberList[j] + numberList[k];
                    
                   if(m == sum) return sum;
                   if(result < sum && sum < m) result = sum;

                }
            }

        }

        return result;

    }

}