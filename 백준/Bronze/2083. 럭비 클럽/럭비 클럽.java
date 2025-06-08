import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void setting() throws IOException {
        while (true) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) continue;

            String[] s = line.split(" ");
            if (s.length != 3) continue;

            String name = s[0];
            int age = Integer.parseInt(s[1]);
            int weight = Integer.parseInt(s[2]);

            if (name.equals("#") && age == 0 && weight == 0) {
                break;
            }

            if (age > 17 || weight >= 80) {
                sb.append(name).append(" Senior\n");
            } else {
                sb.append(name).append(" Junior\n");
            }
        }
    }

    void print() {
        System.out.print(sb);
    }
}
