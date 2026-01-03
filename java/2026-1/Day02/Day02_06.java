import java.util.Scanner;

public class Day02_06 {
    public static void main(String[] args) {
    //     - **✅ 미션 2:  🔐 비밀번호 맞추기**
    // - 사용자가 비밀번호를 입력한다 
    // 맞으면 “성공 - 자물쇠가 열린다”
    // 틀리면 다시 입력하게 된다. 
    // 성공할때 까지 계속 입력 가능하다

        Scanner input = new Scanner(System.in);

        System.out.print(" 입력 횟수 제한 숫자를 입력해주세요: ");
        int count = Integer.parseInt(input.nextLine());

        String password = "whdkgus123";
        String answer = "";
        
        while (count > 0){
            System.out.print("비밀번호를 입력해주세요: ");
            answer = input.nextLine();

            if(answer.equals(password)) {
                System.out.println("성공 - 자물쇠가 열린다");
                break;
            } else {
                System.out.println("다시 입력");
            }

            count--;
        }
        
    }
}
