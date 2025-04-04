
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
    Deque<Integer> queue = new ArrayDeque<>();

    void setting() throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] type = br.readLine().split(" ");
        String[] value = br.readLine().split(" ");


        for (int i = n - 1; i >= 0; i--) {
            if (type[i].equals("0")) {
                queue.addLast(Integer.parseInt(value[i]));
            }
        }

        int m = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            queue.addLast(Integer.parseInt(input[i]));
            sb.append(queue.pollFirst());
            if (i < m - 1) sb.append(" ");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
