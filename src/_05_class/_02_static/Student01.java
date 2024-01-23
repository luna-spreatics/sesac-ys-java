package _05_class._02_static;

public class Student01 {
    // 1. 필드 정의
    private String name;
    private String studentID;
    private int grade;

    // 클래스 변수 (static 변수) 총 학생수
    private static int totalStudents = 0;

    public Student01(String name, String studentID, int grade) {
        // 생성자로 이름, 학번, 학년 초기화, totalStudents 증가
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
        totalStudents++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // displayInfo 메서드 정의
    public void displayInfo() {
        System.out.println("\n=== 학생 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentID);
        System.out.println("학년: " + grade);
    }

    // 클래스 변수 getter
    public static int getTotalStudents() { return totalStudents; }

    public static void main(String[] args) {
        // 학생 생성
        Student01 std1 = new Student01("김새싹", "20230101", 1);
        Student01 std2 = new Student01("박지은", "20222425", 2);
        Student01 std3 = new Student01("김동", "20220101", 3);

        std1.displayInfo();
        std2.displayInfo();
        std3.displayInfo();

        // 총 학생 수 출력
        System.out.println("총 학생수는: " + Student01.getTotalStudents());
    }
}
