package com.example.java_lecture;

import java.util.Scanner;

public class Day02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("반복할 카운트 숫자를 입력해주세요: ");
        int limit = Integer.parseInt(scanner.nextLine());
        while (limit < 1) {
            System.out.println("다시 입력해주세요");

            System.out.println("반복할 카운트 숫자를 입력해주세요: ");
            limit = Integer.parseInt(scanner.nextLine());
        }


        // 숫자
        int number = 1;
        while(number <=  limit) {
            // 3. 로직 실행
            System.out.println("숫자: number " + number);

            try {
                Thread.sleep(3000); // 3초 딜레이
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // 4. 숫자에다가 1을 더했다
            number = number + 1;
            // 6. 숫자 = 3
        }
//        System.out.println("반복문 종료됨 number: " + number);
        System.out.println("프로그램을 종료합니다.");
    }
}


//public static void main(String[] args) {
//    int i = 1;
//
//// 1. 조건 확인 4. 다시 조건 확인 5. 조건에 부합하면 실행 아니면 종료
//    while (i <= 5) {
//        // 2. 실행
//        System.out.println(i);
//
//        try {
//            Thread.sleep(1000); // 1초 멈추기
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        // 3. 값 변경
//        i++;
//    }
//}


//public static void main(String[] args) {
//
//    boolean isRunning = true;
//
//    while (isRunning) {
//        System.out.println("계속하시려면 true: ");
//        System.out.println("중단하시려면 false: ");
//
//        Scanner scanner = new Scanner(System.in);
//        isRunning = Boolean.parseBoolean(scanner.nextLine());
//
//        System.out.println("반복된다 ");
//    }
//    System.out.println("프로그램이 종료됩니다.");
//}