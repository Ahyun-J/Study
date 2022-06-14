package week01;

public class FactorialLoop {
	
	//for 또는 while 루프를 사용하여 결과를 계산
	
	
	
	public static int factor(int n) {
		int fact = 1;
		
		for(int i = n; i >=1 ; i--) {
			fact *= i;
		}
		return fact;
	}
}
