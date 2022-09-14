/* 프로그램명 : ex01.java
   프로그램 설명 : System.out.println을 이용한 기본 출력 프로그램
   프로그램 작성일 : 2021.03.24
   프로그램 최종수정일 : 2021.03.24	
   프로그램 작성자 : 조아현
*/

package ex01;

public class ex05 {
	 public static void main(String[] args) {
		    int r = 5;
		    double area = 0.0;
		    
		    area = r*r*3.14;
		 
		    System.out.println("반지름 5를 가지는 원의 면적은 " + area + "입니다. "); // 면적이 78.5로 소수점 한 자리 까지 표시됨
		  System.out.printf("반지름 %d를 가지는 원의 면적은%f 입니다. \n" ,r,area); // 면적이 78.500000으로 출력 됨 %f를 사용하면 소수점 뒤의 숫자가 6개가 나온다.
		 System.out.printf(%f",area); // 78.500000으로 수만 나오는데 소수점 뒤에가 많이 출력 됨


			}
		}


