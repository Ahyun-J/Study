public class DoWhile {
	public static void main(String args[]) {
		int N = 1;
		System.out.println("* ������ 3�� *");
		
		do {
			System.out.println(" " + 3 + "*" + N + " = " + (3*N));
			N++;
		} while(N < 10);
	}
	
}
		/* 
		do-while�� ������ ���� �ۼ��� ���� �ִ�
		do {
		System.out.println(" " + 3 + "*" + N + " = " + (3*N));
		} while(++N < 10);
		*/