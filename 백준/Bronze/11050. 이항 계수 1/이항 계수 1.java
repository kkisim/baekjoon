import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Combination c = new Combination();
        c.setting();
        c.cal();
        c.print();
    }
}

class Combination {
    static Scanner sc = new Scanner(System.in);
    int N, K;
    int result;

    void setting() {
        N = sc.nextInt();
        K = sc.nextInt();
    }

    int factorial(int x) {
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    void cal() {
        result = factorial(N) / (factorial(K) * factorial(N - K));
    }

    void print() {
        System.out.println(result);
    }
}
