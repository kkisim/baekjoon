import java.io.*;

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

    String jaehwan;
    String doctor;

    void setting() throws IOException {
        jaehwan = br.readLine();
        doctor = br.readLine();

        int jaeA = jaehwan.length() - 1;  
        int docA = doctor.length() - 1;

        if (jaeA >= docA) {
            sb.append("go");
        } else {
            sb.append("no");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
