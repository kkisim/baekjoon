import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N;
    int[] h;
    int visible;

    void setting() throws Exception {
        N = Integer.parseInt(br.readLine().trim());
        h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(br.readLine().trim());
        }

        int maxHeight = 0;
        visible = 0;
        // 오른쪽에서 왼쪽으로 스캔
        for (int i = N - 1; i >= 0; i--) {
            if (h[i] > maxHeight) {
                visible++;
                maxHeight = h[i];
            }
        }
        sb.append(visible);
    }

    void print() throws Exception {
        System.out.print(sb.toString());
    }
}
