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

    void setting() throws IOException {
        int N = Integer.parseInt(br.readLine());

        int startYear = 2024;
        int startMonth = 8;
        int totalMonths = (N - 1) * 7 + startMonth;

        int year = startYear + (totalMonths - 1) / 12;
        int month = totalMonths % 12;
        if (month == 0) month = 12;

        sb.append(year).append(" ").append(month);
    }

    void print() {
        System.out.print(sb);
    }
}
