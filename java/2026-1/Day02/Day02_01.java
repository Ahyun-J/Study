import java.util.Scanner;

public class Day02_01 {
    public static void main(String[] args) {

        //🔥 챌린지 미션 1:  🍺 편의점 술 판매 프로그램
        // - “19세 이상”
        // - “신분증 소지”

        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("신분증이 있나요? (true / false): ");
        boolean hasID = Boolean.parseBoolean(scanner.nextLine());

        // TODO: 조건을 완성하시오
        if (age >= 19 && hasID) {
            System.out.println("술 구매 가능");
        } else {
            System.out.println("술 구매 불가");
        }

    }
}