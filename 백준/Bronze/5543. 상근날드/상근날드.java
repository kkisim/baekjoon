import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int result;

    void setting() throws Exception {
        // 햄버거 3개
        int b1 = Integer.parseInt(br.readLine());
        int b2 = Integer.parseInt(br.readLine());
        int b3 = Integer.parseInt(br.readLine());

        // 음료 2개
        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());

        int minBurger = Math.min(b1, Math.min(b2, b3));
        int minDrink  = Math.min(d1, d2);

        result = minBurger + minDrink - 50;
        sb.append(result);
    }

    void print() {
        System.out.print(sb);
    }
}
