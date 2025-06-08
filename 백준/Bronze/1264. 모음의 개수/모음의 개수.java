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
            if (line == null) break;         
            if (line.equals("#")) break;      

            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                char ch = Character.toLowerCase(line.charAt(i));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            sb.append(count).append("\n");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
