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
        int num = Integer.parseInt(br.readLine());

        long[] arr = new long[num + 1];  
        arr[0] = 0;
        if (num > 0) arr[1] = 1;

        for (int i = 2; i <= num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        sb.append(arr[num]);
    }

    void print() {
        System.out.print(sb);
    }
}
