import java.util.Scanner;


public class Main {
    static int[] numArr;
    private static int N; // 정수의 개수
    private static int S; // 정수의 합
    private static int answer = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        S = sc.nextInt();

        numArr = new int[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = sc.nextInt();
        }
        
        dfs(0, 0); // 0번 인덱스부터 탐색
        
        if (S == 0) System.out.println(answer - 1); // S = 0일때 따로 0 처리
        else  System.out.println(answer);

    }

    private static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == S) answer++; // 합이 S가 됐을 때, 가짓수 1 추가
            return;
        }
        dfs(depth + 1, sum + numArr[depth]); // 지금 인덱스를 추가
        dfs(depth + 1, sum); // 지금 인덱스 추가안함
    }

}