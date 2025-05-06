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
        String[] s = br.readLine().split(" ");
        long min = Long.parseLong(s[0]);
        long max = Long.parseLong(s[1]);

        int size = (int)(max - min + 1);
        boolean[] isNotSquareFree = new boolean[size];

        for (long i = 2; i * i <= max; i++) {
            long square = i * i;
            long start = ((min + square - 1) / square) * square;

            for (long j = start; j <= max; j += square) {
                isNotSquareFree[(int)(j - min)] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (!isNotSquareFree[i]) count++;
        }

        sb.append(count);
    }

    void print() {
        System.out.println(sb);
    }
}