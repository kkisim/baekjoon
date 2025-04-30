
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        C w = new C();
        w.setting();
        w.bfs();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n, k;
    boolean[] visited = new boolean[100001];

    void setting() throws IOException {
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        k = Integer.parseInt(s[1]);
    }

    void bfs() {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(n, 0));
        visited[n] = true;

        while (!q.isEmpty()) {
            Node now = q.poll();
            int x = now.pos;
            int time = now.time;

            if (x == k) {
                sb.append(time).append('\n');
                return;
            }

            if (x - 1 >= 0 && !visited[x - 1]) {
                visited[x - 1] = true;
                q.add(new Node(x - 1, time + 1));
            }
            if (x + 1 <= 100000 && !visited[x + 1]) {
                visited[x + 1] = true;
                q.add(new Node(x + 1, time + 1));
            }
            if (x * 2 <= 100000 && !visited[x * 2]) {
                visited[x * 2] = true;
                q.add(new Node(x * 2, time + 1));
            }
        }
    }

    void print() {
        System.out.print(sb);
    }

    static class Node {
        int pos;
        int time;

        Node(int pos, int time) {
            this.pos = pos;
            this.time = time;
        }
    }
}
