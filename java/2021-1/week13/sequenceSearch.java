/*�й� : 20215247
�̸� : ������
�ǽ� ��ǥ : 1. �迭
		2. �迭�� Ȱ���� ���� �˰��� ����
		3. �迪�� Ȱ���� Ž�� �˰��� ����

���� Ž��*/

package week13;

import java.util.Scanner;

class sequenceSearch {
	public static int search(int[]arrays, int key) {
		
		for(int i = 0; i<arrays.length;i++) {
			if(arrays[i]==key) {
				return i;}
				}
			return -1;
		}
		public static void main(String[]args) {
			
			int[]arr = {4,7,2,1,3};
			int key;
			int index;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("�迭");
			for(int value : arr) {
				System.out.print(value+" ");
			}
			System.out.println();
			System.out.print("ã���� �ϴ� �� �Է� : ");
			key = scan.nextInt();
			index = search(arr,key);
			if(index == -1) {
				System.out.println("ã�� ���� �����ϴ�.");
			}
			else {
				System.out.println("ã�� ���� �迭�ε��� ["+ index +"]�� �ֽ��ϴ�.");
			}
			
		scan.close();
	}

}
