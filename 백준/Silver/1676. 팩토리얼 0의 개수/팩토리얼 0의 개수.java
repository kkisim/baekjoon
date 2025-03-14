
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fac f = new Fac();
        f.setting();
        f.cal();
        f.print();
    }
}

class Fac {
    static Scanner sc = new Scanner(System.in);
    int num;
    BigInteger result;
    int zeroCount;

    void setting() {
        num = sc.nextInt();
        result = BigInteger.ONE;
    }

    void cal() {
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        String s = result.toString();
        zeroCount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                zeroCount++;
            } else {
                break;
            }
        }
    }

    void print() {
        System.out.println(zeroCount);
    }
}
