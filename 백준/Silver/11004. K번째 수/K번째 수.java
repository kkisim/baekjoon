import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    StringBuilder sb = new StringBuilder();
    FastScanner fs;

    void setting() throws Exception {
        fs = new FastScanner(System.in);

        int N = fs.nextInt();
        int K = fs.nextInt(); // 1-based

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = fs.nextInt();

        int kIdx = K - 1; // 0-based index
        quickSelect(arr, 0, N - 1, kIdx);

        sb.append(arr[kIdx]);
    }

    void print() {
        System.out.print(sb.toString());
    }

    // ---------------- QuickSelect ----------------
    void quickSelect(int[] a, int left, int right, int k) {
        while (left < right) {
            int pivotIndex = partition(a, left, right);

            if (k <= pivotIndex) right = pivotIndex;
            else left = pivotIndex + 1;
        }
    }

    // Hoare partition: 반환값은 "왼쪽 구간의 끝 인덱스"
    int partition(int[] a, int left, int right) {
        // pivot: 가운데 값(랜덤까지는 아니어도 11004에서 충분히 잘 통과하는 편)
        int pivot = a[(left + right) >>> 1];

        int i = left - 1;
        int j = right + 1;

        while (true) {
            do { i++; } while (a[i] < pivot);
            do { j--; } while (a[j] > pivot);

            if (i >= j) return j;

            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }

    // ---------------- FastScanner ----------------
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = readByte();
            } while (c <= ' '); // 공백 스킵

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = readByte();
            }

            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return val * sign;
        }
    }
}
