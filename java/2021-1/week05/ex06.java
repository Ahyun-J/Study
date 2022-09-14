/*학번 : 20215247
이름 : 조아현
주어진 조건을 관계연산과 논리연산으로 결과를 출력하는 프로그램 */

package week05;
//import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int age,computer,english,math,absence,leap,num ;
		char married, gender ;
		double sum, average;
		
		married = 'N';
		gender = 'W';
		age = 18;
		computer = 80;
		english = 90;
		math = 65;
		leap = 2021;
		absence = 3;
		num = 15;
		
		sum = computer + english + math;
		average = sum / 3.0;
		
		System.out.println("1. 미혼인가 : " + (married == 'Y'));
		System.out.println("2. 나이가 19세 이상이고 남자인가 : "+ (age >= 19 && gender == 'M'));
		System.out.println("3. 컴퓨터와 영어 그리고 수학 모두가 90점 이상인가 : " + (computer >= 90 && english >= 90 && math >= 90));
		System.out.println("4. 총점이 200점 이상이거나 평균이 60점 이상인가 : " +  (sum >= 200 || average >= 60));  
		System.out.println("5. 점수가 60점 미만이거나 결석횟수가 4번 이상인가 : "+ (computer <60 && english<60 && math < 60 || absence >= 4));
		System.out.println("6. 현재의 년도가 윤년인가 : " + ((leap % 4 == 0 )? "윤년":"윤년아님"));
		System.out.println("7. 입력된 숫자가 짝수인가 : " + ((num % 2 == 0)? "짝수":"홀수"));
		System.out.println("8. 입력된 숫자가 3과 5의 공배수인가 : " + ((num % 3 == 0)&&(num % 5 == 0)));
		
	}
		
}
		/*
		 * int n; int a;
		 * 
		 * Scanner input = new Scanner(System.in); System.out.print("미혼인가? Y/N : ");
		 * 
		 * n = input.nextInt();
		 * 
		 * String str = (n == Y)? "미혼이다":"미혼이 아니다.";
		 * 
		 * 
		 * System.out.println("a"); input.close();
		 
	}

}


 * 1. 미혼인가 ( ex: married == ‘y’) 
 * 2. 나이가 19세 이상이고 남자인가 ( ex : age >= 19 && gender == ‘m’) 
 * 3. 컴퓨터와 영어 그리고 수학 모두가 90점 이상인가 ( computer >= 90 && english >= 90 && math >= 90 == 's' 
 * 4. 총점이 200점 이상이거나 평균이 60점 이상인가  (total >= 200 || average >= 60 = 'g')
 * 5. 점수가 60점 미만이거나 결석횟수가 4번 이상인가  (score < 60 || absence >= 4 = 'b')
 * 6. 현재의 년도가 윤년인가 (year % 4 == 0 )? "윤년":"윤년아님";
 * 7. 입력된 숫자가 짝수인가 (x % 2 == 0)? "짝수":"홀수";
 * 8. 입력된 숫자가 3과 5의 공배수인가 (y % 3 == 0)&&(y % 5 == 0) == 'h'
 */