
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Sort s = new Sort();
        s.read();
        s.sorting();
        s.print();
    }
}

class Member {
    int age;
    String name;

    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class Sort {
    int num;
    List<Member> members;

    void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        members = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            members.add(new Member(age, name));
        }
    }

    void sorting() {
       
        members.sort(Comparator.comparingInt(m -> m.age));
    }

    void print() {
        StringBuilder sb = new StringBuilder();
        for (Member m : members) {
            sb.append(m.age).append(" ").append(m.name).append('\n');
        }
        System.out.print(sb);
    }
}
