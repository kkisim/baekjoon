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
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
        if (Math.abs(a) == Math.abs(b)) return a - b;
        return Math.abs(a) - Math.abs(b);
    });

    void setting() throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x != 0) {
                pq.offer(x);
            } else {
                sb.append(pq.isEmpty() ? 0 : pq.poll()).append('\n');
            }
        }
    }

    void print() {
        System.out.print(sb);
    }
}
