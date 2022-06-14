package week01;

public class FactorialRecursive {

	//재귀 함수를 호출하여 결과를 계산
	
	public static int factor(int n) {
		if (n <= 1)
			return n;
		else 
			return n * factor(n-1);
	}
}
