import java.util.Scanner;

public class Day02_05 {
    public static void main(String[] args) {
    //     - **✅ 미션 1:  ⏱️🧨 카운트다운 폭탄 만들기**
    // - 숫자를 입력하면 
    // 그 숫자부터 1초마다 카운트가 세어지고 
    // 카운트가 0이 되면 폭발! 💥 을 출력하고 종료된다.
        Scanner input = new Scanner(System.in);
        
        System.out.print("카운트 숫자를 입력해주세요: ");
        int count = Integer.parseInt(input.nextLine());
        
        while (count >= 0){
            
            try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
            throw new RuntimeException(e);
            }

            if(count == 0) {
                System.out.println("💥 빰! 폭탄이 터졌다!");
            } else {
                System.out.println(count);
            }
            count--;
        }
    }
}
