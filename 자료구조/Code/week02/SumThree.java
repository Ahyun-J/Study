package week02;

import java.util.Scanner;

public class SumThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[100];
		int b, c = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int a = sc.nextInt();

		if (a >= 6) {
			if (a > 297) {
				System.out.println("���� �ٸ� 3���� ���� ������ �����ϴ�.");
			} else {
				for (int i = 1; i < array.length; i++) {
					b = a - array[i];
					c = b - array[i + 1];
					if (c <= 100) {
						if (b != 100) {
							System.out.println(a + "=" + array[i] + "+" + array[i + 1] + "+" + c);
							break;
						}
					}
				}
			}
		} else {
			System.out.println("���� �ٸ� 3���� ���� ������ �����ϴ�.");
		}
	}

}
