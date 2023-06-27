import java.util.*;

public class Main {
    static int[] heights = new int[9];
    static int[] answer = new int[7];
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            heights[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(heights);
        combinationSum(0, 0, 0);
    }

    public static void combinationSum(int start, int depth, int sum) {
        
        if (depth == 7) {
            if (sum == 100) {
                for (int i = 0; i < 7; i++) {
                    System.out.println(answer[i]);
                }
                System.exit(0); //프로그램 종료
            }
            return;
        }
            
        for (int i = start; i < 9; i++) {
            answer[depth] = heights[i];
            combinationSum(i + 1, depth + 1, sum + heights[i]); // 재귀로 다시 호출해서 정답 배열에 숫자 추가
        }
    }
  
}