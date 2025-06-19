import java.io.*;
import java.util.*;

public class Main {
    static class C {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        void setting() throws IOException {
            int Z = Integer.parseInt(br.readLine());

            for (int i = 0; i < Z; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken()); 
                int K = Integer.parseInt(st.nextToken()); 

                int count = (N - 1 + (K - 2)) / (K - 1); 
                int totalSockets = 1 + count * (K - 1);
                int remaining = totalSockets - N;

                sb.append(remaining).append("\n");
            }
        }

        void print() {
            System.out.print(sb);
        }
    }

    public static void main(String[] args) throws IOException {
        C c = new C();
        c.setting();
        c.print();
    }
}
