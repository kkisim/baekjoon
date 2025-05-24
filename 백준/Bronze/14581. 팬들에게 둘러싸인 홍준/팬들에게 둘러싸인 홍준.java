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
    String id;

    void setting() throws IOException {
        id = br.readLine();
        sb.append(":fan::fan::fan:\n");
        sb.append(":fan::").append(id).append("::fan:\n");
        sb.append(":fan::fan::fan:");
    }

    void print() {
        System.out.print(sb);
    }
}
