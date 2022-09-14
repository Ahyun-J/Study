package week13;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student [] st = {
						new Student("name0","phone0"),
						new Student("name1","phone1"),
						new Student("name2","phone2"),
						new Student("name3","phone3"),
						new Student("name4","phone4")
						};
		
		ArrayList <Student> alist = new <Student> ArrayList();
		
		for(int i = 0; i < 5 ; i++) {
		alist.add(st[i]);}
		
		
		for(int i =0;i<alist.size();i++) {
		System.out.println(alist.get(i));}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n이름을 입력하시면 전화번호를 드립니다 : ");
		String a = sc.next();
		
		for(Student s : alist) {
			if(s.getName().equals(a)) {
				System.out.println(a+"의 전화번호 = "+ s.getPhone());
			}
		}
		
		System.out.print("\n이름을 입력하시면 정보를 삭제합니다 : ");
		String b = sc.next();
		for(int i = 0; i<alist.size();i++) {
			if(alist.get(i).getName().equals(b)) {
				alist.remove(i);
			}
		}
	
		for(int i =0;i<alist.size();i++) {
		System.out.println(alist.get(i));}

		System.out.println("\n20215247_조아현");
	}

}
