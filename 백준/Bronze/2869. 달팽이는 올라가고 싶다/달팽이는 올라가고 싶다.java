
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        snail s = new snail();
        s.setting();
        s.cal();
        s.print();
    }
}

class snail {
    static Scanner sc = new Scanner(System.in);
    int up;
    int down;
    int V;
    int count;

    void setting() {
        up = sc.nextInt();
        down = sc.nextInt();
        V = sc.nextInt();
    }

    void cal() {
        count = (V - down + (up - down - 1)) / (up - down); 
    }

    void print() {
        System.out.println(count);
    }
}
