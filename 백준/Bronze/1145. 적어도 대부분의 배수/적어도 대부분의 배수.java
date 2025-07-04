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

    int[] arr = new int[5];

    void setting() throws IOException {
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int num = 1;
        while (true) {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                if (num % arr[i] == 0) {
                    count++;
                }
            }

            if (count >= 3) {
                sb.append(num);
                break;
            }

            num++;
        }
    }

    void print() {
        System.out.println(sb);
    }
}
