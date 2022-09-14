package week10;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
		 String id="abcdef";
		 //userid를 입력 받아 저장된 id와 일치하는지 비교하여 결과를 출력(대소문자 구분)
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("아이디를 입력하세요 : ");
		 String userid = sc.next();
		 
		 if(userid.equals(id)) {
			 System.out.println("userid가 일치합니다.");
		 } else {
			 System.out.println("userid가 일치하지 않습니다.");
		 }
		 System.out.println("\n20215247_조아현");
		}
}
