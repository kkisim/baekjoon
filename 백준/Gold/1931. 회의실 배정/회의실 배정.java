

import java.io.*;
import java.util.*;

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
    int N;
    Meeting[] meetings;

    void setting() throws IOException {
        N = Integer.parseInt(br.readLine());
        meetings = new Meeting[N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            meetings[i] = new Meeting(start, end);
        }

        Arrays.sort(meetings);

        int count = 0;
        int lastEndTime = 0;

        for (Meeting meeting : meetings) {
            if (meeting.start >= lastEndTime) {
                lastEndTime = meeting.end;
                count++;
            }
        }

        sb.append(count).append('\n');
    }

    void print() {
        System.out.print(sb);
    }

    class Meeting implements Comparable<Meeting> {
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting other) {
            if (this.end == other.end) {
                return this.start - other.start;
            }
            return this.end - other.end;
        }
    }
}
