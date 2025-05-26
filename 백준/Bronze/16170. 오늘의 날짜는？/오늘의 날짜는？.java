import java.io.*;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

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
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneOffset.UTC);

        DateTimeFormatter y = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter m = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd");

        sb.append(utcNow.format(y)).append("\n");
        sb.append(utcNow.format(m)).append("\n");
        sb.append(utcNow.format(d)).append("\n");
    }

    void print() {
        System.out.print(sb);
    }
}
