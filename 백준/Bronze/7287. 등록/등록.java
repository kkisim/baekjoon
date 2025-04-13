import java.io.*;

public class Main {
    public static void main(String[] args) {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    StringBuilder sb = new StringBuilder();

    void setting() {
        
        sb.append("234").append("\n");
        sb.append("kisimoko").append("\n");
    }

    void print() {
        System.out.print(sb);
    }
}
