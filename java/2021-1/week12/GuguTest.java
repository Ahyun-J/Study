/*학번 : 20215247
이름 : 조아현
실습2.
* ● main을 가지는 GuguTest 클래스 작성
● dan2 객체 생성
● setDan메서드를 이용 사용자로부터 입력받은 단을 출력하기 위해 dan 설정
● printGugu() 메소드를 이용 해당 단 출력
● setDan 메서드로 단을 8단으로 변경
● printGugu() 메소드를 이용 단 출력*/

package week12;

import java.util.Scanner;

class Gugu {
		private int dan;
		
		public void setDan(int d) {
			dan = d;
		}
		public void printGugu() {
			System.out.printf("해당하는 단 : %d\n\n", dan);
			for(int i=1; i<=9;i++) {
				System.out.printf("%d*%d = %d\n", dan, i, (dan*i));
			}
		}
		
	}

	public class GuguTest {
		public static void main (String[]args) {
			
			int Dan;
			Scanner input = new Scanner(System.in);
			
			Gugu dan2 = new Gugu();
			System.out.print("수 입력 : ");
			Dan = input.nextInt();
			dan2.setDan(Dan);
			dan2.printGugu();
			
			input.close();
	}



}
