import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CAL c = new CAL();
        c.setting();
        c.cal();
        c.print();
    }
}

class CAL {
    static Scanner sc = new Scanner(System.in);
    int a;
    int b;
    int gcd;
    int lcm;

    void setting() {
        a = sc.nextInt();
        b = sc.nextInt();
    }

    int getGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    void cal() {
        gcd = getGCD(a, b);
        lcm = (a * b) / gcd;
    }

    void print() {
        System.out.println(gcd); 
        System.out.println(lcm); 
    }
}
