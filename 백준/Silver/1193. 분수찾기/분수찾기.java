
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        new FractionFinder().solve();
    }
}

class FractionFinder {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void solve() throws IOException {
        int X = Integer.parseInt(br.readLine());

        int line = 1;
        int sum = 0;

  
        while (sum + line < X) {
            sum += line;
            line++;
        }


        int pos = X - sum;

        int numerator, denominator;

        if (line % 2 == 0) {

            numerator = pos;
            denominator = line - pos + 1;
        } else {

            numerator = line - pos + 1;
            denominator = pos;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
