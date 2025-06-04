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

    HashMap<String, Integer> colorMap = new HashMap<>();

    void setting() throws IOException {
        makeMap();

        String one = br.readLine();
        String two = br.readLine();
        String three = br.readLine();

        int value = colorMap.get(one) * 10 + colorMap.get(two);
        long result = (long) (value * Math.pow(10, colorMap.get(three)));

        sb.append(result).append("\n");
    }

    void makeMap() {
        String[] colors = {
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
        };

        for (int i = 0; i < colors.length; i++) {
            colorMap.put(colors[i], i);
        }
    }

    void print() {
        System.out.print(sb);
    }
}
