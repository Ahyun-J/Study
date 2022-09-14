package week9;

public class BankAccount {
	private int balance;
	
	public void deposit(int amount) { 
		this.balance = balance + amount;
		}
	
	public void withdraw (int amount) throws NegativeBalanceException{
		if(amount > balance) {
			throw new NegativeBalanceException("잔고가 음수입니다.");
		}
		else {
			this.balance -= amount;
		}
	}
	public int getBalance() {
		return balance;
	}
}
