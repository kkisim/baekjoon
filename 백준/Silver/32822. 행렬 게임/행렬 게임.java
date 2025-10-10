import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception { new C().setting(); }
}

class C {
    int N, M;
    int[][] A;
    int[] colBest; 
    long ans;
    StringBuilder sb = new StringBuilder();

    void setting() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        colBest = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
                int b = Integer.parseInt(st.nextToken());
                int diff = Math.abs(A[i][j] - b);
                if (diff > colBest[j]) colBest[j] = diff;
            }
        }

        int read = 0;
        st = null;
        while (read < M) {
            if (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens() && read < M) {
                int beta = Integer.parseInt(st.nextToken()) - 1; // 0-index
                ans += colBest[beta];
                read++;
            }
        }

        print();
    }

    void print() {
        System.out.println(ans);
    }
}
