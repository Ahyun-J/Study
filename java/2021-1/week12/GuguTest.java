/*�й� : 20215247
�̸� : ������
�ǽ�2.
* �� main�� ������ GuguTest Ŭ���� �ۼ�
�� dan2 ��ü ����
�� setDan�޼��带 �̿� ����ڷκ��� �Է¹��� ���� ����ϱ� ���� dan ����
�� printGugu() �޼ҵ带 �̿� �ش� �� ���
�� setDan �޼���� ���� 8������ ����
�� printGugu() �޼ҵ带 �̿� �� ���*/

package week12;

import java.util.Scanner;

class Gugu {
		private int dan;
		
		public void setDan(int d) {
			dan = d;
		}
		public void printGugu() {
			System.out.printf("�ش��ϴ� �� : %d\n\n", dan);
			for(int i=1; i<=9;i++) {
				System.out.printf("%d*%d = %d\n", dan, i, (dan*i));
			}
		}
		
	}

	public class GuguTest {
		public static void main (String[]args) {
			
			int Dan;
			Scanner input = new Scanner(System.in);
			
			Gugu dan2 = new Gugu();
			System.out.print("�� �Է� : ");
			Dan = input.nextInt();
			dan2.setDan(Dan);
			dan2.printGugu();
			
			input.close();
	}



}
