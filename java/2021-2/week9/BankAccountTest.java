package week9;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount b = new BankAccount();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("저축 : ");
		int a1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("저축: ");
		int a2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("출금 : ");
		int a3 = sc.nextInt();
		sc.nextLine();
		
		b.deposit(a1);
		System.out.println("저축 "+ a1 +", 잔고 = " +
				b.getBalance());
		
		b.deposit(a2);
		System.out.println("저축 "+ a2 +", 잔고 = " +
				b.getBalance());
		
		try {
			b.withdraw(a3);
			System.out.println("출금 "+ a3 +", 잔고 = " +
					b.getBalance());
		}
		catch(NegativeBalanceException n){
			System.out.println("출금 "+ a3 +"," + n.getMessage() 
			+ "잔고 = " + b.getBalance());
		}
		finally {
			System.out.println("\n20215247_조아현");
		}

	}

}