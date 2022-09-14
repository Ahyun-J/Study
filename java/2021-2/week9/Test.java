package week9;

public class Test {
	public static void checkNegative(int number)  {
	try {	if (number < 0) {
			throw new MyException("음수는 안됩니다.");
			//new �뒗 �깮�꽦 諛쒖깮�떆耳� 以섏빞�븯湲� �뻹臾몄뿉
			//throws 媛� �뾾�뼱�룄 throw �븘�슂
		}
		System.out.println("다행히 음수가 아니군요");
	}catch(MyException ex) {
		System.out.println(ex.toString());
		//System.out.println("�쓬�닔�꽕�슂");
		}
	}

	public static void main(String[] args) {
			//checkNegative(1);
			checkNegative(-1);
	}
}
