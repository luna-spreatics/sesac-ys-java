package _05_class._05_abstract.ex1;

public class StudentEx {
    public static void main(String[] args) {
        // Kim 객체 생성 및 출력
        Kim kim = new Kim("김철수", "마포 고등학교", 17, "20221010");
        System.out.println(kim.name + " 학생의 정보");
        System.out.println("학교 : " + kim.school);
        System.out.println("나이 : " + kim.age);
        System.out.println("학번 : " + kim.studentId);
        kim.todo();

        // Baek 객체 생성 및 출력
        Baek baek = new Baek("백영희", "마포 고등학교", 17, "20221012");
        System.out.println(baek.name + " 학생의 정보");
        System.out.println("학교 : " + baek.school);
        System.out.println("나이 : " + baek.age);
        System.out.println("학번 : " + baek.studentId);
        baek.todo();
    }
}
