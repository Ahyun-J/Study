/*학번 : 20215247
이름 : 조아현
키와 몸무게를 입력받아 표준체중과 비만도를 계산하는 프로그램 */

package week05;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c,g;
		double m, b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("키와 몸무게를 입력하세요 : ");
		c = input.nextInt();
		g = input.nextInt();
		
		m = (c-100)*0.9;
		b = (g-m)/m*100;
		
		System.out.println("표준 체중은 "+m+", 비만도는 "+b+"입니다.");
		input.close();
		

	}

}
