
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
        char ch = br.readLine().charAt(0);
        if (ch == 'N' || ch == 'n') {
            sb.append("Naver D2");
        } else {
            sb.append("Naver Whale");
        }
    }

    void print() {
        System.out.println(sb);
    }
}