/* 프로그램명 : ex01.java
   프로그램 설명 : System.out.println을 이용한 기본 출력 프로그램
   프로그램 작성일 : 2021.03.24
   프로그램 최종수정일 : 2021.03.24	
   프로그램 작성자 : 조아현
*/

package ex01;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =5;
		int y =7;
		
		System.out.println("x:" +x+ ", y:" + y) ;
		
		int temp = x;
		x = y ;
		y = temp;
	
		System.out.println("x:" +x+ ", y:" + y) ;

	}

}
