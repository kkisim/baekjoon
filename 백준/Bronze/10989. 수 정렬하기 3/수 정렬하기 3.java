

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Asc a = new Asc();
        a.setting();
        a.cal();
        a.print();
    }
}

class Asc {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int num;
    int[] arr;

    void setting() throws IOException {
        num = Integer.parseInt(br.readLine());
        arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    void cal() {
        Arrays.sort(arr);
    }

    void print() {
        for (int i = 0; i < num; i++) {
            sb.append(arr[i]).append('\n'); 
        }
        System.out.print(sb); 
    }
}
