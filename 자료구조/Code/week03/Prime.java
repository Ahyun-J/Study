package week03;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("1���� ū ���� ������ �Է��ϼ���: ");
		int a = sc.nextInt();

		if (find(a) == false)
			System.out.print(a+"��(��) �Ҽ��� �ƴմϴ�.");
		else
			System.out.print(a+"��(��) �Ҽ� �Դϴ�.");

	}

	public static boolean find(int n) {

		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;

	}

}
