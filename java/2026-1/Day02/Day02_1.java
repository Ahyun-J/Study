package com.example.java_lecture;

import java.util.Scanner;

public class Day02_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("티켓이 있나요? (true / false): ");
        boolean hasTicket = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("보호자가 있나요? (true / false): ");
        boolean hasParents = Boolean.parseBoolean(scanner.nextLine());

        // TODO: 조건을 완성하시오
        if (age >= 19 && hasTicket) {
            System.out.println("입장 가능");
        } else if (age < 19 && hasParents && hasTicket) {
            System.out.println("입장 가능");
        } else {
            System.out.println("입장 불가");
        }

    }
}


//Scanner scanner = new Scanner(System.in);
//
//System.out.print("나이를 입력하세요: ");
//int age = Integer.parseInt(scanner.nextLine());
//
//// int age = 85;
//
//if (age >= 60) {
//        System.out.println("노인");
//} else if (age >= 20) {
//        System.out.println("성인");
//} else {
//        System.out.println("미성년자");
//}


//Scanner scanner = new Scanner(System.in);
//	System.out.println("나이를 입력해주세요: ");
//
//// 사용자로 부터 나이를 입력받는다
//String ageInput = scanner.nextLine();
//// 글자 -> 숫자로 바꾸기
//int age = Integer.parseInt(ageInput);
//
//	System.out.print("티켓이 있나요? (true / false): ");
//// 사용자로 부터 티켓을 입력 받는다
//String ticketInput = scanner.nextLine();
//// 글자 -> 불리언으로 바꾸기
//boolean hasTicket = Boolean.parseBoolean(ticketInput);
//
//// 1. 미니 미션 - 입장 가능한 나이 = 변수에 해당 조건을 넘어보자
//
//boolean ageApproved = age >= 12;
//
//// 2. 미니 미션 - 조건 부분에 변수 하나만 들어가게 해보자
//// 최종 승인 여부
//boolean finalCheck = ageApproved && hasTicket;
//
//	if (finalCheck) {
//        System.out.println("입장 가능");
//	} else {
//            System.out.println("입장 불가");
//	}