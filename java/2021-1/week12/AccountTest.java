/*�й� : 20215247
�̸� : ������
�ǽ� 3. ���� ���õ� Ŭ������ �ۼ��Ͻÿ�. 
* ���� ���¸� ��ü�� ǥ���ϱ� ���� Ŭ������ ������ ���� �ۼ��Ͻÿ�. 
�� ������ �ݾ׸�ŭ �����ܾ׿� �����ϴ� deposit �޼��带 �ۼ��Ͻÿ�. ( �̶� ���̳ʽ� �ݾ��� �Աݵ��� �ʵ��� ����� �̿��Ͻÿ�.)
�� ������ �ݾ׸�ŭ �����ܾ׿��� ����ϴ� withdraw �޼��带 �ۼ��Ͻÿ�. ( �̶� ��ݱݾ��� ���̳ʽ��� �ƴ����� Ȯ���ϰ� 
����ϰ��� �ϴ� �ݾ��� ���̳ʽ��� ��ݵ��� �ʵ����ϸ�, ��ݱݾ��� �����ܾ׺��� ũ�� ���� ��ݵ��� �ʵ��� ����� �̿��Ͻÿ�.)
�� main �޼��带 ������ AccountTest Ŭ������ �ۼ��Ͻÿ�. 
�� �� ���� Account ��ü�� �����ϰ� �Ӽ�(�������)�� set�޼��带 �̿��� �����Ͻÿ�. 
�� �� ����(Account ��ü)�� ���� ������ toString �޼��带 �̿��� ����Ͻÿ�. 
�� ������ ���� ����� ó���� �޼���� ǥ���ϰ� ���������� �ٽ� ����Ͻÿ�. * */

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
		else System.out.print("���̳ʽ� �ݾ��� �Աݵ��� �ʽ��ϴ�."); 
		}
	public void withdraw(int w) {
		if(w<0) 
			System.out.print("���̳ʽ� �ݾ��� ��ݵ��� �ʽ��ϴ�.");
		else if (w>balance) 
			System.out.print("\n�����ܾ��� �����մϴ�."); 
		else 
			balance = balance - w;
		}
	public String toString() {
		return "���¹�ȣ : "+AccountNo+"\n�Ա��� : "+owner+"\n���� �ܾ�"+balance;
		}
}
public class AccountTest {
	public static void main (String[]args) {
		Account acc1 = new Account(); 
		acc1.setAccountNo("123456789");
		acc1.setOwner("ȫ�浿"); 
		acc1.setBalance(3000); 
		acc1.depost(1000); 
		acc1.withdraw(5000); 
		
		Account acc2 = new Account(); 
		acc2.setAccountNo("987654321"); 
		acc2.setOwner("������");
		acc2.setBalance(50000); 
		acc2.depost(2000); 
		acc2.withdraw(9000); 
		
		System.out.println("\nacc1�� ���� ���� : " + acc1.toString()); 
		System.out.println("\nacc2�� ���� ���� : " + acc2.toString()); 
		}
	}

