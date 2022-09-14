/*학번 : 20215247
이름 : 조아현
두 수를 입력받아 두 수 중 큰 값을 출력하는 프로그램 */

package week05;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		int big;
		
		Scanner input = new Scanner(System.in);
		System.out.print("두 수를 입력하시오 :");
		
		x=input.nextInt();
		y=input.nextInt();
		
		big = (x>y)?x:y;
		
		System.out.println("큰 수는 "+big+"입니다.");
		input.close();

	}

}
