package _05_class._05_abstract.ex1;

public class Baek extends Student {
    // 생성자
    public Baek(String name, String school, int age, String studentId) {
        super(name, school, age, studentId);
    }

    // to do 메소드 오버라이딩
    public void todo() {
        System.out.println("점심은 백종원 피자");
    }
}
