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
        int A = Integer.parseInt(br.readLine()); // 1000円札
        int B = Integer.parseInt(br.readLine()); // 10000円札

        int total = A * 1000 + B * 10000;
        sb.append(total);
    }

    void print() {
        System.out.println(sb);
    }
}
