package _05_class._04_inheritance.ex;

// Cat 클래스, Animal 클래스를 상속 받음
public class Cat extends Animal {
    // 생성자
    public Cat(String name, int age) {
        // Animal 클래스의 생성자 호출하여 초기화
        super("고양이", name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }
}
