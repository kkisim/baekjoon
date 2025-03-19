
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Hasher h = new Hasher();
        h.read();
        h.hash();
        h.print();
    }
}

class Hasher {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int r = 31;
    final int M = 1234567891;

    int len;
    String str;
    long result = 0;

    void read() throws IOException {
        len = Integer.parseInt(br.readLine());
        str = br.readLine();
    }

    void hash() {
        long power = 1; 
        for (int i = 0; i < len; i++) {
            int value = str.charAt(i) - 'a' + 1;
            result = (result + value * power) % M;
            power = (power * r) % M;
        }
    }

    void print() {
        System.out.println(result);
    }
}
