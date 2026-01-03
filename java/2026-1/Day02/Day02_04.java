import java.util.Scanner;

public class Day02_04 {
    public static void main(String[] args) {
    //🔥 챌린지 미션 2-2: 🚦신호등 만들기 - 입력횟수 제한 
    //    - 문제정의
    // - 처음 사용자로부터 입력 횟수 카운트를 받는다
    //     - 만약 입력횟수를 넘게되면 프로그램을 즉시 종료한다.
    // - 매번 사용자로부터 입력값을 받는다
    // - 초록불, 노란불이 입력되면 입력한 내용을 그대로 출력한다.
    // - **“빨간불”** 이 입력되면 프로그램을 즉시 종료한다.


    Scanner input = new Scanner(System.in);
    String currentLight = "";

    System.out.print("입력 횟수 카운트를 입력하세요: ");
    int count = Integer.parseInt(input.nextLine());
    
    // 색 미입력 상태 : 0

    while (count > 0){

        System.out.println("색을 입력하시오 (초록불 / 노란불 / 빨간불): ");
        currentLight = input.nextLine();

        boolean lightPass = (currentLight.equals("초록불")) || (currentLight.equals("노란불"));

        if (currentLight.equals("빨간불")) {
            break;
        }
        
        if (lightPass) {
            System.out.println(currentLight);
            count--;
        } else
            System.out.println("입력 오류");

        }

        
    }   
}
