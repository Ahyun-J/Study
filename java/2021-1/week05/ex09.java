/*학번 : 20215247
이름 : 조아현
10000보다 작은 정수를 입력받아서 분리하여 출력하는 프로그램*/

package week05;
import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, N_1000;
		int N_100;
		int N_10;
		int N_1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 :");
		
		number = input.nextInt();
		
		 N_1000 = number / 1000 ;
		 number = number %1000;
		 
		 N_100 = number / 100 ;
		 number = number%100;
		 
		 N_10 = number / 10 ;
		 number = number%10;
		 
		 N_1 = number ;
		 
		 
		System.out.println("천의 자리 : " + N_1000);
		System.out.println("백의 자리 : " + N_100);
		System.out.println("십의 자리 : " + N_10);
		System.out.println("일의 자리 : " + N_1);
		input.close();

	}

}
