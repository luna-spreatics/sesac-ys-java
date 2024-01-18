package _02_control_statement;

public class Practice4 {
    // 원의 넓이 계산하는 메소드
    public void getArea(int r) {
        System.out.printf("반지름이 %d 인 원의 넓이 : %f", r, r * r * Math.PI).println();
    }

    // 직사각형의 넓이 계산하는 메소드
    public void getArea(int x, int y) {
        System.out.printf("가로 %d, 세로 %d 인 직사각형의 넓이 : %d", x, y, x * y).println();
    }

    // 삼각형의 넓이 계산하는 메소드
    public void getArea(int w, int h, boolean isTriangle) {
        System.out.printf("밑변 %d, 높이 %d 인 삼각형의 넓이 : %f", w, h, 0.5 * w * h).println();
    }

    public static void main(String[] args) {
        Practice4 pr  = new Practice4();
        pr.getArea(5);
        pr.getArea(4, 7);
        pr.getArea(6, 3, true);
    }
}
