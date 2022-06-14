package week03;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 큰 양의 정수를 입력하세요: ");
		int a = sc.nextInt();

		if (find(a) == false)
			System.out.print(a+"은(는) 소수가 아닙니다.");
		else
			System.out.print(a+"은(는) 소수 입니다.");

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
