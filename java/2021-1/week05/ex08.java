/*학번 : 20215247
이름 : 조아현
시간을 초단위로 입력해 입력된 시간이 몇 시간 몇분 몇초에 해당하는지 계산하는 프로그램*/

package week05;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 필요한 변수선언부
		 int hour = 0;
		 int minute = 0;
		 int second = 0;
		 int value = 0;
		 //입력 및 계산부분
		 
		 Scanner input = new Scanner(System.in);
		
		 System.out.print("초단위 시간을 입력하세요:");
		 
		 value = input.nextInt();
		 
		 second = value % 60 ;
		 
		 value = value / 60;
		 
		 minute = value % 60;
		 
		 hour = value / 60;
		 //출력부분
		 
		 System.out.printf( "%d 시간 %d 분 %d초입니다." , hour , minute , second ); 
		 // System.out.print( hour + "시간" + minute + "분" + second +"초입니다.");

		 input.close();
	}

}
