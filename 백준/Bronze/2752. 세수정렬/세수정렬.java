import java.io.*;
import java.util.*;

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
        String[] input = br.readLine().split(" ");
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);  

        sb.append(arr[0]).append(" ").append(arr[1]).append(" ").append(arr[2]);
    }

    void print() {
        System.out.print(sb);
    }
}
