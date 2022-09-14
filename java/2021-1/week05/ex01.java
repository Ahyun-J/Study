/*학번 : 20215247
이름 : 조아현
반지름을 입력받아 부피와 면적을 구하는 프로그램*/

package week05;
//import java.util.*;
import java.util.Scanner;


public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		double v, s;
		Scanner input = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요 : ");
		r = input.nextInt();
		
		v = (4.0/3.0)*3.14*r*r*r;
		s = 4.0*3.14*r*r;
		
		System.out.println("반지름"+r+"의 부피는 "+v+"면적은 "+s+"입니다.");
		input.close();

	}

}
