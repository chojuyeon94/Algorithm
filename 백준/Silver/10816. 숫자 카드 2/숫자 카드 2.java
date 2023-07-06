import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){

            int target = Integer.parseInt(st.nextToken());
            bw.write((upperBound(arr, target)) - lowerBound(arr, target) + " ");

        }

        br.close();
        bw.close();

    }

    public static int lowerBound(int[] arr, int target){

        int low = 0;
        int high = arr.length;

        while(low < high){

            int mid = (low + high) / 2;

            if(target <= arr[mid]) high = mid;
            else low = mid + 1;

        }

        return low;

    }

    public static int upperBound(int[] arr, int target){

        int low = 0;
        int high = arr.length;

        while(low < high){

            int mid = (low + high) / 2;

            if(target < arr[mid]) high = mid;
            else low = mid + 1;

        }

        return low;

    }


}