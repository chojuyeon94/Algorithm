import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static int[] tree;
    private static int N; // 나무의 수
    private static int M; // 나무의 길이
    private static int answer = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        tree = new int[N];
        for (int i = 0; i < N; i++) {
            tree[i] = sc.nextInt();
        }

        Arrays.sort(tree); // 나무를 길이 순대로 정렬

        long start = 0L; // 시작점
        long end = tree[N-1]; // 끝점

        while (start <= end){

            long mid = (start + end) / 2; // 절단기 길이를 시작점과 끝점의 중간값으로 설정
            long sum = 0; // 나무 길이 합

            for (int i =0; i < N; i++) {
                if (tree[i] > mid) {
                    sum += tree[i] - mid; // 길이 합 구하기
                }
            }

                if(sum >= M) start = mid + 1; // 합이 필요한 나무 길이보다 더 크면 시작점을 mid+1로 이동
                else end = mid -1; // 합이 필요한 나무 길이보다 더 작으면 시작점을 mid-1로 이동

        }

        System.out.println(end);

    }

}