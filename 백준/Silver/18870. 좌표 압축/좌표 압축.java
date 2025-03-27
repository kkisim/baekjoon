

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

    void setting() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] origin = new int[n];
        int[] sorted = new int[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            origin[i] = Integer.parseInt(input[i]);
            sorted[i] = origin[i];
        }

        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], idx++);
            }
        }

        for (int i = 0; i < n; i++) {
            sb.append(map.get(origin[i])).append(' ');
        }
    }

    void print() {
        System.out.print(sb);
    }
}
