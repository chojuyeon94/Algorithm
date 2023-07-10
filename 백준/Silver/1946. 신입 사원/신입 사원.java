import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[][] rank = new int[N][2];
            
            for(int n = 0; n < N; n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                rank[n][0] = Integer.parseInt(st.nextToken()); // 서류 심사 순위
                rank[n][1] = Integer.parseInt(st.nextToken()); // 면접 순위
            }

            // 서류 심사 순위로 오름차순 정렬
            Arrays.sort(rank, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return Integer.compare(o1[0], o2[0]);
                }
            });

            int max = rank[0][1]; // 첫 번째 사람의 면접 순위
            int count = 1; // 서류 1등은 무조건 합격이므로 카운트 1로 시작

            // 나머지 사람들에 대해 탐색(1등 빼고 1부터 시작)
            for(int i = 1; i < N; i++) {
                // 해당 사람의 면접 순위가 이전까지의 최고 면접 순위보다 높다면 합격
                if(rank[i][1] < max) {
                    max = rank[i][1];
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}