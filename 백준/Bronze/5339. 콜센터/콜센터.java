import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    StringBuilder sb = new StringBuilder();

    void setting() {
        sb.append("     /~\\\n");
        sb.append("    ( oo|\n");
        sb.append("    _\\=/_\n");
        sb.append("   /  _  \\\n");
        sb.append("  //|/.\\|\\\\\n");
        sb.append(" ||  \\ /  ||\n");
        sb.append("============\n");
        sb.append("|          |\n");
        sb.append("|          |\n");
        sb.append("|          |");
    }

    void print() {
        System.out.print(sb);
    }
}
