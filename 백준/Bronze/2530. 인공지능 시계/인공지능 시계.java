import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void setting() throws IOException {
        String[] time = br.readLine().split(" ");
        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        int sec = Integer.parseInt(time[2]);

        int duration = Integer.parseInt(br.readLine());

        int totalSec = hour * 3600 + min * 60 + sec + duration;

        int resultHour = (totalSec / 3600) % 24;
        int resultMin = (totalSec % 3600) / 60;
        int resultSec = totalSec % 60;

        sb.append(resultHour).append(" ").append(resultMin).append(" ").append(resultSec);
    }

    void print() {
        System.out.print(sb);
    }
}
