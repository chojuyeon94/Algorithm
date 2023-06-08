import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(bufferedReader.readLine());

        System.out.println(greedy(sugar));


    }

   public static int greedy(int sugar){

        int count = 0;

        while(sugar >= 0 && sugar % 5 != 0){
            sugar -= 3;
            count++;
        }

        if(sugar < 0) return -1;
        else return count + sugar / 5;


   }

}