
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
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[3];
            for (int j = 0; j < 3; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(a); 

            sb.append("Scenario #").append(i).append(":\n");
            if ((long)a[0] * a[0] + (long)a[1] * a[1] == (long)a[2] * a[2]) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }

            if (i != T) sb.append("\n"); 
        }
    }

    void print() {
        System.out.print(sb);
    }
}
