package _02_control_statement;

import java.util.Scanner;

public class Practice3 {
    public void calc(double x, double y) {
        System.out.printf("덧셈 결과: %.1f", x + y).println();
        System.out.printf("뺄셈 결과: %.1f", x - y).println();
        System.out.printf("나눗셈 결과: %f", x / y).println();
        System.out.printf("곱셈 결과: %.1f", x * y).println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practice3 pr = new Practice3();

        System.out.println("숫자 두개 입력해주세요 : ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        pr.calc(n1, n2);
        sc.close();
    }
}
