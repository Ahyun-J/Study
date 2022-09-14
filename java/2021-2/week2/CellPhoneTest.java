package week2;

import java.util.Scanner;

public class CellPhoneTest {
	 public static void main(String[] args) {
		  
		  CellPhone [] cell = new CellPhone[5];
		  
		  cell[0] = new CellPhone("010-5720-4011",true);
		  cell[1] = new CellPhone("010-4922-2997",true);
		  cell[2] = new CellPhone("010-7741-0446",true);
		  cell[3] = new CellPhone("010-5702-0881",true);
	      cell[4] = new CellPhone("010-9615-5570",true);
	      
	      for(CellPhone c : cell)
	    	  System.out.println(c);
	      
	      Scanner scan = new Scanner(System.in);
	      System.out.print("전화 번호를 입력하시면 전원 상태를 알려드립니다.:");
	      String a = scan.next();
	      
	      for(CellPhone c : cell)
	    	  if(c.getTel().contentEquals(a)) {
	    		  System.out.println("전원 상태 : "+ c.getPow() );
	    		  
	    	  }
	      
	  }

	 
//
//	    CellPhone p1 = new CellPhone();
//
//	    System.out.println("전체 폰의 갯수= "+ CellPhone.getCount());
//
//	 
//
//	    CellPhone p2 = new CellPhone("111-111-1111");
//
//	    System.out.println("전체 폰의 갯수= "+ CellPhone.getCount());
//
//	 
//
//	    System.out.println(p2);
//
//	    p2.powerToggle(); //p2.power <- false
//
//	    System.out.println(p2);
//
//	  }
}
