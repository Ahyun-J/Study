package week01;

public class FactorialRecursive {

	//��� �Լ��� ȣ���Ͽ� ����� ���
	
	public static int factor(int n) {
		if (n <= 1)
			return n;
		else 
			return n * factor(n-1);
	}
}
