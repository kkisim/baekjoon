
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
    int count;

    void setting() throws IOException {
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            count = 0;
            int result = isPalindrome(str);
            sb.append(result).append(" ").append(count).append('\n');
        }
    }

    int recursion(String s, int l, int r) {
        count++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    void print() {
        System.out.print(sb);
    }
}
