import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        System.out.println(sequence(n));


    }

    public static int sequence(int n){

        if(n < 100) return n;
        else{

            int first;
            int second;
            int third;
            int count = 99;
            if(n == 1000) n--;

            for(int i = 100; i <= n; i++){
                 first = (i / 100) % 10;
                 second = (i / 10) % 10;
                 third = i % 10;

                 if (first - second == second - third) count++;
            }


            return count;


        }


    }



}