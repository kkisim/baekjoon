
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        DoomNumber d = new DoomNumber();
        d.read();
        d.find();
        d.print();
    }
}

class DoomNumber {
    int n;
    int count = 0;
    int result = 666;

    void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
    }

    void find() {
        while (true) {
            if (String.valueOf(result).contains("666")) {
                count++;
                if (count == n) {
                    break;
                }
            }
            result++;
        }
    }

    void print() {
        System.out.println(result);
    }
}
