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

    void setting() throws IOException {
        String[] input = br.readLine().split(" ");
        String ab = input[0] + input[1];
        String cd = input[2] + input[3];

        long sum = Long.parseLong(ab) + Long.parseLong(cd);
        sb.append(sum);
    }

    void print() {
        System.out.println(sb);
    }
}
