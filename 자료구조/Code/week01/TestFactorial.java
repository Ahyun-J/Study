package week01;

import java.util.Scanner;

public class TestFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("N을 입력해주세요 : ");
		
		int n = sc.nextInt();
		
		FactorialRecursive re = new FactorialRecursive();
		System.out.println("재귀함수\n"+n+"!"+" = "+re.factor(n));
		
		FactorialLoop lo = new FactorialLoop();
		System.out.println("루프\n"+n+"!"+" = "+lo.factor(n));
		
		// ============================
		
		int N = 5;
		int rRecursive = 0;
		int rLoop = 0;
		
		rRecursive = FactorialRecursive.factor(N);
		rLoop = FactorialLoop.factor(N);
		
		System.out.printf("[N=%d] Recr: %d, Loop: %d\n", N, rRecursive, rLoop);
		
	}

}
