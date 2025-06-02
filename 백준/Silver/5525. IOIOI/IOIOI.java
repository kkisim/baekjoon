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

    int n, m;
    String s;

    void setting() throws IOException {
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        s = br.readLine();

        int count = 0; 
        int pattern = 0; 

        for (int i = 1; i < m - 1;) {
            if (s.charAt(i - 1) == 'I' && s.charAt(i) == 'O' && s.charAt(i + 1) == 'I') {
                pattern++;
                if (pattern == n) {
                    count++;
                    pattern--; 
                }
                i += 2;
            } else {
                pattern = 0;
                i++;
            }
        }

        sb.append(count).append("\n");
    }

    void print() {
        System.out.print(sb.toString());
    }
}
