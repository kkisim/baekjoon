
import java.io.*;
import java.util.HashSet;

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
    HashSet<String> set = new HashSet<>();

    void setting() throws IOException {
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                set.add(sub);
            }
        }

        sb.append(set.size());
    }

    void print() {
        System.out.println(sb);
    }
}
