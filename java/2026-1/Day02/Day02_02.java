import java.util.Scanner;

public class Day02_02 {
    public static void main(String[] args) {

        //🔥 챌린지 미션 2:  🎁 이벤트 참여 가능 여부 체크 
        // - “기존회원이거나”
        // - “쿠폰이 있으면 참여 가능”

        Scanner scanner = new Scanner(System.in);

        System.out.print("기존회원이신가요? (true / false): ");
        boolean Member = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("쿠폰이 있나요? (true / false): ");
        boolean hasCoupon = Boolean.parseBoolean(scanner.nextLine());

        // TODO: 조건을 완성하시오
        if (Member || hasCoupon) {
            System.out.println("참여 가능");
        } else {
            System.out.println("참여 불가");
        }

    }
}