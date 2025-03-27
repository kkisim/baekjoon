
import java.io.*;
import java.util.*;

public class Main {
    static int T, M, N, K;
    static int[][] field;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1}; // 우 좌 하 상
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        new C().solve();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T, M, N, K;
    int[][] field;
    boolean[][] visited;
    int[] dx = {0, 0, 1, -1}; // 우 좌 하 상
    int[] dy = {1, -1, 0, 0};

    void solve() throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String[] tokens = br.readLine().split(" ");
            M = Integer.parseInt(tokens[0]);
            N = Integer.parseInt(tokens[1]);
            K = Integer.parseInt(tokens[2]);

            field = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                String[] pos = br.readLine().split(" ");
                int x = Integer.parseInt(pos[0]);
                int y = Integer.parseInt(pos[1]);
                field[y][x] = 1;
            }

            int count = 0;
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (field[y][x] == 1 && !visited[y][x]) {
                        dfs(x, y);
                        count++;
                    }
                }
            }

            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }

    void dfs(int x, int y) {
        visited[y][x] = true;

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if (field[ny][nx] == 1 && !visited[ny][nx]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
