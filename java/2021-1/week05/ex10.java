/*학번 : 20215247
이름 : 조아현
학생의 이번 학기 평균 점수를 계산하는 프로그램 */

package week05;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int computer, C, english,math;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("컴퓨터 개론 과목의 점수를 입력하시오. : ");
		computer = input.nextInt();
		System.out.print("C언어 프로그래밍 과목의 점수를 입력하시오. :");
		C = input.nextInt();
		System.out.print("영어 과목의 점수를 입력하시오. : ");
		english = input.nextInt();
		System.out.print("일반 수학 과목의 점수를 입력하시오. :");
		math = input.nextInt();
		
		average = (double)(computer+C+english+math)/4;
		
		System.out.print("평균 점수는" + average +"입니다.");
		input.close();

	}

}
