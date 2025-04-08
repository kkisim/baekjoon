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
    char[][] map;
    int n;

    void setting() throws IOException {
        n = Integer.parseInt(br.readLine());
        map = new char[n][2 * n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                map[i][j] = ' ';
            }
        }
        draw(n, 0, n - 1);

        for (int i = 0; i < n; i++) {
            sb.append(map[i]).append('\n');
        }
    }
    void draw(int size, int x, int y) {
        if (size == 3) {
            map[x][y] = '*';
            map[x + 1][y - 1] = '*';
            map[x + 1][y + 1] = '*';
            for (int i = -2; i <= 2; i++) {
                map[x + 2][y + i] = '*';
            }
            return;
        }

        int half = size / 2;
        draw(half, x, y);                      
        draw(half, x + half, y - half);        
        draw(half, x + half, y + half);        
    }

    void print() {
        System.out.print(sb);
    }
}
