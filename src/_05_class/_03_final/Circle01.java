package _05_class._03_final;

import java.util.Scanner;

public class Circle01 {
    // 반지름 final 필드
    private final int radius;
    // PI 상수
    private static final double PI = 3.141592;

    public Circle01(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 반지름 입력
        System.out.println("원의 반지름을 입력해주세요: ");
        int radius = scanner.nextInt();

        // Circle 객체 생성
        Circle01 circle = new Circle01(radius);

        // 반지름과 넓이 출력
        System.out.println("원의 반지름 : " + circle.radius);
        System.out.println("원의 넓이 : " + circle.calculateArea());

        scanner.close();
    }

}
