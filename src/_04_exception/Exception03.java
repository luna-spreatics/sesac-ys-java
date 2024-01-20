package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 배열 크기 입력
            System.out.print("배열 크기 입력해주세요: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
            }

            // 배열 생성
            int[] arr = new int[size];

            // 배열 요소 입력
            System.out.print(size + "개의 정수를 입력하세요: ");

            for (int i = 0; i < size; i++) {
                System.out.print("정수 " + (i+1) + ": ");
                arr[i] = scanner.nextInt();
            }

            // 중복된 요소 찾기
            ArrayList<Integer> duplicates = findDuplicates(arr);

            // 중복된 요소 출력
            if(duplicates.isEmpty()) {
                System.out.println("중복된 요소가 없습니다.");
            } else {
                System.out.println("중복된 요소: " + duplicates);
            }

        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력 형식입니다. 정수를 입력하세요.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // 중복된 요소를 찾는 메소드
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length -1; i++) {
            // 1 2 3 4 5
            // 1에 대해서 2,3,4,5 => i = 0, j = 1 ~ length-1
            // 2에 대해서 3,4,5 중복
            // 3에 대해서 4,5
            // 4에 대해서 5
            for (int j = i + 1; j < arr.length; j++) {
                // 1 2 1 1
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    // 중복된 요소만 추가
                    duplicates.add(arr[i]);
                    // -> duplicates : [ 1 ]
                }
            }
        }
        return duplicates;
    }
}
