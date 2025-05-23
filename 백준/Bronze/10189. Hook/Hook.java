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
        sb.append("#  # #### #### #  #\n");
        sb.append("#### #  # #  # # #\n");
        sb.append("#### #  # #  # # #\n");
        sb.append("#  # #### #### #  #");
    }

    void print() {
        System.out.print(sb);
    }
}
