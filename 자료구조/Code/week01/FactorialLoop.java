package week01;

public class FactorialLoop {
	
	//for �Ǵ� while ������ ����Ͽ� ����� ���
	
	
	
	public static int factor(int n) {
		int fact = 1;
		
		for(int i = n; i >=1 ; i--) {
			fact *= i;
		}
		return fact;
	}
}
