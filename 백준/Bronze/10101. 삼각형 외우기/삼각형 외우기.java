
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
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int sum = a + b + c;

        if (sum != 180) {
            sb.append("Error");
        } else if (a == 60 && b == 60 && c == 60) {
            sb.append("Equilateral");
        } else if (a == b || b == c || a == c) {
            sb.append("Isosceles");
        } else {
            sb.append("Scalene");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
