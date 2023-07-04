import java.util.*;


public class Main {

    static ArrayList<Integer>[] node; // 연결 리스트
    static boolean[] visited; // 방문 확인 용

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int start = sc.nextInt();

        node = (ArrayList<Integer>[]) new ArrayList[n+1];

        for(int i = 1; i <= n; i++){
            node[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < m; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            node[a].add(b);
            node[b].add(a);

        }

        for(int i = 1; i <= n; i++){
            Collections.sort(node[i]); // 작은 것부터 방문하기 위해 순서 정렬
        }

        visited = new boolean[n + 1];
        dfs(start);
        System.out.println();
        
        Arrays.fill(visited, false); // 방문 상태 리셋
        
        bfs(start);

    }

    public static void dfs(int k){

        if(visited[k]) return; // 이미 방문했으면 매서드 종료

        visited[k] = true; // 방문 확인
        System.out.print(k + " "); // 출력

        for(int j : node[k]){
            if(!visited[j]) dfs(j); // j노드를 방문 안했으면 dfs 실시
        }
    }

    public static void bfs(int start){

        Queue<Integer> queue = new LinkedList<Integer>(); // 탐색할 노드 저장용 큐
        queue.add(start);
        visited[start] = true; // 방문 확인

        while(!queue.isEmpty()){

            int k = queue.remove(); // 큐에서 빼고

            System.out.print(k + " "); // 출력
            for(int j : node[k]){

                if(!visited[j]){ 
                    visited[j] = true;
                    queue.add(j); // j노드 방문 안했으면 방문 확인 후 큐에 추가
                }
            }

        }


    }

}