

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
    int n;
 
    void setting () throws NumberFormatException, IOException {
    	n = Integer.parseInt(br.readLine());
    	for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                sb.append(i).append('\n');
                n /= i;
            }
        }

   
        if (n > 1) {
            sb.append(n).append('\n');
        }
    	
    }

    void print() {
        System.out.print(sb);
    }
}
