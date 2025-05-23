import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    StringBuilder sb = new StringBuilder();

    void setting() {
        sb.append("NFC West       W   L  T\n");
        sb.append("-----------------------\n");
        sb.append("Seattle        13  3  0\n");
        sb.append("San Francisco  12  4  0\n");
        sb.append("Arizona        10  6  0\n");
        sb.append("St. Louis      7   9  0\n");
        sb.append("\n");
        sb.append("NFC North      W   L  T\n");
        sb.append("-----------------------\n");
        sb.append("Green Bay      8   7  1\n");
        sb.append("Chicago        8   8  0\n");
        sb.append("Detroit        7   9  0\n");
        sb.append("Minnesota      5  10  1");
    }

    void print() {
        System.out.print(sb);
    }
}
