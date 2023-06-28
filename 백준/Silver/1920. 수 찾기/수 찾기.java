import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(scanner.nextInt());
        }

        int M = scanner.nextInt();
        int[] numbersToFind = new int[M];

        for (int i = 0; i < M; i++) {
            numbersToFind[i] = scanner.nextInt();
        }

        scanner.close();

        for (int number : numbersToFind) {
            if (set.contains(number)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}