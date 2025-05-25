
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N, target;
    int[][] map;
    int[] dx = {-1, 0, 1, 0}; // 상 우 하 좌
    int[] dy = {0, 1, 0, -1};
    int ansX, ansY;

    void setting() throws IOException {
        N = Integer.parseInt(br.readLine());
        target = Integer.parseInt(br.readLine());
        map = new int[N][N];

        int x = N / 2;
        int y = N / 2;
        int dir = 0;
        map[x][y] = 1;
        if (target == 1) {
            ansX = x + 1;
            ansY = y + 1;
        }

        for (int num = 2, step = 1; num <= N * N; step++) {
            for (int d = 0; d < 2; d++) { // 같은 step 크기로 2방향 이동
                for (int i = 0; i < step; i++) {
                    x += dx[dir];
                    y += dy[dir];
                    if (x >= 0 && x < N && y >= 0 && y < N) {
                        map[x][y] = num;
                        if (num == target) {
                            ansX = x + 1;
                            ansY = y + 1;
                        }
                        num++;
                    }
                }
                dir = (dir + 1) % 4;
            }
        }
    }

    void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");
        }
        sb.append(ansX).append(" ").append(ansY);
        System.out.print(sb);
    }
}
