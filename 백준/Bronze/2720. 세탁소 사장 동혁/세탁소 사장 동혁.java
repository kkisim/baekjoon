
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Money money = new Money();
        money.setting();
        money.cal();
    }
}

class Money {
    static Scanner sc = new Scanner(System.in);
    int num;
    int Q = 25;
    int D = 10;
    int N = 5;
    int P = 1;
    int[] arr;

    void setting() {
        num = sc.nextInt();
        arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void cal() {
        for (int i = 0; i < num; i++) {
            int money = arr[i];

            int Q_count = money / Q;
            money %= Q;

            int D_count = money / D;
            money %= D;

            int N_count = money / N;
            money %= N;

            int P_count = money / P;

            print(Q_count, D_count, N_count, P_count);
        }
    }

    void print(int Q_count, int D_count, int N_count, int P_count) {
        System.out.printf("%d %d %d %d\n", Q_count, D_count, N_count, P_count);
    }
}
