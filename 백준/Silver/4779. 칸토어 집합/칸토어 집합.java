import java.io.*;

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
    String input;

    void setting() throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            int length = (int) Math.pow(3, n);
            char[] arr = new char[length];
            for (int i = 0; i < length; i++) arr[i] = '-';
            cantor(arr, 0, length);
            sb.append(arr).append('\n');
        }
    }

    void cantor(char[] arr, int start, int len) {
        if (len < 3) return;
        int div = len / 3;
        for (int i = start + div; i < start + 2 * div; i++) {
            arr[i] = ' ';
        }
        cantor(arr, start, div);
        cantor(arr, start + 2 * div, div);
    }

    void print() {
        System.out.print(sb);
    }
}