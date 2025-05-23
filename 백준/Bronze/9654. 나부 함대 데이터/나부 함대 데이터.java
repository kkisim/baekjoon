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
        sb.append(format("SHIP NAME", "CLASS", "DEPLOYMENT", "IN SERVICE")).append("\n");
        sb.append(format("N2 Bomber", "Heavy Fighter", "Limited", "21")).append("\n");
        sb.append(format("J-Type 327", "Light Combat", "Unlimited", "1")).append("\n");
        sb.append(format("NX Cruiser", "Medium Fighter", "Limited", "18")).append("\n");
        sb.append(format("N1 Starfighter", "Medium Fighter", "Unlimited", "25")).append("\n");
        sb.append(format("Royal Cruiser", "Light Combat", "Limited", "4"));
    }

    String format(String name, String cls, String deploy, String service) {
        return String.format("%-15s%-15s%-11s%-10s", name, cls, deploy, service);
    }

    void print() {
        System.out.print(sb);
    }
}
