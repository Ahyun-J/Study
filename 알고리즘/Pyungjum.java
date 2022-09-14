public class Pyungjum {
	public static void main(String[] args) {
		int I = 80;
		
//		switch(I/10) {
//			case 9: case 10:
//				System.out.println("A");
//				break;
//			case 8:
//				System.out.println("B");
//				break;
//			case 7:
//				System.out.println("C");
//				break;
//			case 6:
//				System.out.println("D");
//				break;
//			default:
//				System.out.println("F");
//		}

		if(I >= 90) {
			System.out.println("A");
		}else if(I >= 80) {
			System.out.println("B");
		}else if(I >= 70) {
			System.out.println("C");
		}else if(I >= 60) {
			System.out.println("D");
		}else{
			System.out.println("F");
		}
		
	}
}
