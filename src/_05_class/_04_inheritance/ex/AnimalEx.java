package _05_class._04_inheritance.ex;

public class AnimalEx {
    public static void main(String[] args) {
        // Cat 객체 생성
        Cat myCat = new Cat("나비", 3);

        // Dog 객체 생성
        Dog myDog = new Dog("멍멍이", 2);

        // Cat, Dog 객체의 속성 및 메소드 확인
        System.out.println("=== 고양이 정보 ===");
        System.out.println("종 : " + myCat.getSpecies());
        System.out.println("이름 : " + myCat.getName());
        System.out.println("나이 : " + myCat.getAge());
        myCat.makeSound();

        System.out.println("=== 강아지 정보 ===");
        System.out.println("종 : " + myDog.getSpecies());
        System.out.println("이름 : " + myDog.getName());
        System.out.println("나이 : " + myDog.getAge());
        myDog.makeSound();
    }
}
