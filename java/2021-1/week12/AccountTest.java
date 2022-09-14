/*학번 : 20215247
이름 : 조아현
실습 3. 다음 제시된 클래스를 작성하시오. 
* 은행 계좌를 객체로 표현하기 위한 클래스를 다음과 같이 작성하시오. 
● 지정한 금액만큼 예금잔액에 누적하는 deposit 메서드를 작성하시오. ( 이때 마이너스 금액은 입금되지 않도록 제어문을 이용하시오.)
● 지정한 금액만큼 예금잔액에서 출금하는 withdraw 메서드를 작성하시오. ( 이때 출금금액이 마이너스이 아닌지를 확인하고 
출금하고자 하는 금액이 마이너스면 출금되지 않도록하며, 출금금액이 예금잔액보다 크면 또한 출금되지 않도록 제어문을 이용하시오.)
● main 메서드를 가지는 AccountTest 클래스를 작성하시오. 
● 두 개의 Account 객체를 생성하고 속성(멤버변수)을 set메서드를 이용해 지정하시오. 
● 두 계좌(Account 객체)에 대한 내용을 toString 메서드를 이용해 출력하시오. 
● 각각에 대해 입출금 처리를 메서드로 표현하고 계좌정보를 다시 출력하시오. * */

package week12;

class Account {
	
	private String AccountNo;
	private String owner;
	private int balance;
	
	public String getAccountNO() {
		return AccountNo;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setAccountNo(String name) {
		AccountNo = name;
	}
	public void setOwner(String own) {
		owner = own;
	}
	public void setBalance(int b) {
		balance = b;
	}
	public void depost(int d) { 
		if(d>=0) 
			balance = balance + d; 
		else System.out.print("마이너스 금액은 입금되지 않습니다."); 
		}
	public void withdraw(int w) {
		if(w<0) 
			System.out.print("마이너스 금액은 출금되지 않습니다.");
		else if (w>balance) 
			System.out.print("\n예금잔액이 부족합니다."); 
		else 
			balance = balance - w;
		}
	public String toString() {
		return "계좌번호 : "+AccountNo+"\n입금주 : "+owner+"\n예금 잔액"+balance;
		}
}
public class AccountTest {
	public static void main (String[]args) {
		Account acc1 = new Account(); 
		acc1.setAccountNo("123456789");
		acc1.setOwner("홍길동"); 
		acc1.setBalance(3000); 
		acc1.depost(1000); 
		acc1.withdraw(5000); 
		
		Account acc2 = new Account(); 
		acc2.setAccountNo("987654321"); 
		acc2.setOwner("조아현");
		acc2.setBalance(50000); 
		acc2.depost(2000); 
		acc2.withdraw(9000); 
		
		System.out.println("\nacc1의 계좌 정보 : " + acc1.toString()); 
		System.out.println("\nacc2의 계좌 정보 : " + acc2.toString()); 
		}
	}

