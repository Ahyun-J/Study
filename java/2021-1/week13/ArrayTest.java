/*�й� : 20215247
�̸� : ������
�ǽ� ��ǥ : 1. �迭
		2. �迭�� Ȱ���� ���� �˰��� ����
		3. �迪�� Ȱ���� Ž�� �˰��� ����

main �޼��忡�� ������ ���� ������ 1���� �迭�� ����� ���ÿ� �ʱ�ȭ�ϰ� 
�迭 ���� �迭�� �� ���� ����� ���� print�޼��带 ����� �� �޼��带 �̿��� 
����ϴ� ���α׷�*/

package week13;

class ArrayTest {
	public static void print(int[]arr ) {
		int sum =0;
		System.out.println("��°�� >");
		for(int i=0;i<arr.length;i++) {
			System.out.println("�迭["+i+"] = "+arr[i]);
			sum = sum+arr[i];
		}
		System.out.println("�迭 �� : "+sum);
	}
public static void main(String[]arg) {
	int []ary= {1,2,3,4,5,6,7,8,9,10};
	print(ary);
}
}
