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

    void setting() throws Exception {
        String[] nk = br.readLine().trim().split("\\s+");
        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);

        int[] A = new int[N];
        String[] parts = br.readLine().trim().split("\\s+");
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(parts[i]);

        int swapCnt = 0;
        boolean printed = false;

        
        for (int last = N - 1; last >= 1; last--) {
            boolean changed = false;
            for (int i = 0; i < last; i++) {
                if (A[i] > A[i + 1]) {
                  
                    swapCnt++;
                    if (swapCnt == K) {
                        int x = A[i], y = A[i + 1];
                        if (x > y) { int t = x; x = y; y = t; }
                        sb.append(x).append(' ').append(y).append('\n');
                        printed = true;

                        return;
                    }

                    int tmp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = tmp;
                    changed = true;
                }
            }

            if (!changed) break;
        }

        if (!printed) sb.append(-1).append('\n');
    }

    void print() {
        System.out.print(sb.toString());
    }
}
