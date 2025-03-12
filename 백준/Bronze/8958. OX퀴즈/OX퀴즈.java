
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz qz = new Quiz();
        qz.setting();
        qz.cal();
    }
}

class Quiz {
    static Scanner sc = new Scanner(System.in);

    int num;
    String score;

    void setting() {
        num = sc.nextInt();
    }

    void cal() {
        for (int i = 0; i < num; i++) {
            score = sc.next();
            int sco = 0;
            int number = 0;
            for (int j = 0; j < score.length(); j++) {
                if (score.charAt(j) == 'O') {
                    number++;
                    sco += number;
                } else {
                    number = 0;
                }
            }
            print(sco);
        }
    }

    void print(int sco) {
        System.out.println(sco);
    }
}
