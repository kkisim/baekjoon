import java.io.*;
import java.util.*;

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
    ArrayDeque<int[]> deque = new ArrayDeque<>();

    void setting() throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(s[i]);
            deque.addLast(new int[]{i + 1, value});
        }

        while (!deque.isEmpty()) {
            int[] now = deque.pollFirst();
            int idx = now[0];
            int move = now[1];

            sb.append(idx).append(" ");

            if (deque.isEmpty()) break;

            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < -move; i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }
    }

    void print() {
        System.out.print(sb);
    }
}
