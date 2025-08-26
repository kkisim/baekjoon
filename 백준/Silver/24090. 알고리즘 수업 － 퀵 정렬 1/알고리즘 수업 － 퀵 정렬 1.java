
import java.io.*;

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
    long K;
    int[] arr;

    long cnt = 0;
    int ans1 = -1, ans2 = -1;
    boolean found = false;

    void setting() throws Exception {
        String[] f = br.readLine().trim().split("\\s+");
        N = Integer.parseInt(f[0]);
        K = Long.parseLong(f[1]);

        String[] s = br.readLine().trim().split("\\s+");
        arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(s[i]);

        quick_sort(arr, 0, N - 1);

        if (found) {
            int x = Math.min(ans1, ans2);
            int y = Math.max(ans1, ans2);
            sb.append(x).append(' ').append(y);
        } else {
            sb.append(-1);
        }
    }

    void quick_sort(int[] a, int p, int r) {
        if (found) return;
        if (p < r) {
            int q = partition(a, p, r);
            if (found) return;
            quick_sort(a, p, q - 1);
            if (found) return;
            quick_sort(a, q + 1, r);
        }
    }

    int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p - 1;

        for (int j = p; j <= r - 1; j++) {
            if (found) return r;
            if (a[j] <= x) {
                i++;
                swap(a, i, j);
                if (found) return r;
            }
        }
        if (i + 1 != r) {
            swap(a, i + 1, r);
        }
        return i + 1;
    }

    void swap(int[] a, int i, int j) {
        int v1 = a[i], v2 = a[j];
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        cnt++;
        if (!found && cnt == K) {
            ans1 = v1;
            ans2 = v2;
            found = true;
        }
    }

    void print() {
        System.out.println(sb.toString());
    }
}
