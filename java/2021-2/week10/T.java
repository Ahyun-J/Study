package week10;

public class T {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l =0;
		
		System.out.println(args[0]);
		
		for(int i = 0; i < args[0].length() ; i++) {
			if(args[0].charAt(i)>='0' && args[0].charAt(i) <= '9') {
				 l += 1;
			}
		}
		System.out.println("¼ýÀÚ = " + l);
		

		// TODO Auto-generated method stub
		
//		String a = "java programming";
//		
//		String b = a.substring(5);
//		System.out.println(b);
//		
//		String c = a.substring(5,7);
//		System.out.println(c);
//		
//	}
//
//}

	}
}
