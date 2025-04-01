
import java.io.*;
import java.util.*;

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
        int n = Integer.parseInt(br.readLine());

        String[] aStr = br.readLine().split(" ");
        String[] bStr = br.readLine().split(" ");

        Integer[] A = new Integer[n];
        Integer[] B = new Integer[n];

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(aStr[i]);
            B[i] = Integer.parseInt(bStr[i]);
        }

        Arrays.sort(A);                                
        Arrays.sort(B, Collections.reverseOrder());    
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i] * B[i];
        }

        sb.append(sum);
    }

    void print() {
        System.out.println(sb);
    }
}
