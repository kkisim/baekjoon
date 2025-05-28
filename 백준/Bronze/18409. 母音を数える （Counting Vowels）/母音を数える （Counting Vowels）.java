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
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) count++;
        }

        sb.append(count).append("\n");
    }

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o';
    }

    void print() {
        System.out.print(sb);
    }
}
