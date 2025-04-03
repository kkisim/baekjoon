
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
    int[] A, tmp;
    int N, K, count, result;

    void setting() throws IOException {
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);

        A = new int[N];
        tmp = new int[N];
        count = 0;
        result = -1;

        String[] elements = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(elements[i]);
        }

        merge_sort(0, N - 1);
        sb.append(result).append('\n');
    }

    void merge_sort(int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(p, q);
            merge_sort(q + 1, r);
            merge(p, q, r);
        }
    }

    void merge(int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }

        while (i <= q) {
            tmp[t++] = A[i++];
        }

        while (j <= r) {
            tmp[t++] = A[j++];
        }

        i = p;
        t = 0;

        while (i <= r) {
            A[i++] = tmp[t++];
            count++;
            if (count == K) {
                result = A[i - 1];
                return;
            }
        }
    }

    void print() {
        System.out.print(sb);
    }
}
