package _08_collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionEx1 {
    public static void main(String[] args) {
        // 사용자로부터 입력 받기 위한 Scanner
        Scanner scanner = new Scanner(System.in);

        // 중복 제거 위한 HashSet 생성
        Set<Integer> uniqueIntegers = new HashSet<>();

        System.out.println("정수를 입력하세요. -1 입력시 종료.");

        while (true) {
            System.out.println("정수 입력: ");
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }
            uniqueIntegers.add(input);
        }

        // 입력 종료 후 중복 제거된 정수 출력
        System.out.println("정수 목록: " + uniqueIntegers);

        scanner.close();
    }
}
