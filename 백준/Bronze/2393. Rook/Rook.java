import java.io.*;
import java.math.BigInteger;

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
    	sb.append("  ___  ___  ___\n");
        sb.append("  | |__| |__| |\n");
        sb.append("  |           |\n");
        sb.append("   \\_________/\n");
        sb.append("    \\_______/\n");
        sb.append("     |     |\n");
        sb.append("     |     |\n");
        sb.append("     |     |\n");
        sb.append("     |     |\n");
        sb.append("     |_____|\n");
        sb.append("  __/       \\__\n");
        sb.append(" /             \\\n");
        sb.append("/_______________\\\n");

    }

    void print() {
        System.out.print(sb);
    }
}
