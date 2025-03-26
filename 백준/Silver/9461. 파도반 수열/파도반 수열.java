
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Wave w = new Wave();
        w.setting();
        w.print();
    }
}

class Wave {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    long[] arr = new long[101]; 
    int test;

    void setting() throws IOException {
        test = Integer.parseInt(br.readLine());

        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;
        arr[5] = 2;

        for (int i = 6; i < 101; i++) {
            arr[i] = arr[i - 1] + arr[i - 5]; 
        }

        while (test-- > 0) {
            int testnum = Integer.parseInt(br.readLine());
            sb.append(arr[testnum]).append('\n');
        }
    }

    void print() {
        System.out.print(sb);
    }
}
