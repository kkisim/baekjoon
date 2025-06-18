

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

    int N, M;
    int[] box;
    int[] book;

    void setting() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        box = new int[N];
        book = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            box[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            book[i] = Integer.parseInt(st.nextToken());
        }

        int boxIndex = 0;
        int bookIndex = 0;
        int[] used = new int[N];

        while (bookIndex < M && boxIndex < N) {
            if (used[boxIndex] + book[bookIndex] <= box[boxIndex]) {
                used[boxIndex] += book[bookIndex];
                bookIndex++;
            } else {
                boxIndex++;
            }
        }

        int waste = 0;
        for (int i = 0; i < N; i++) {
            waste += (box[i] - used[i]);
        }

        sb.append(waste).append("\n");
    }

    void print() {
        System.out.print(sb);
    }
}
