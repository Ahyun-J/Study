/*�й� : 20215247
�̸� : ������
�ǽ� ��ǥ : 1. �迭
		2. �迭�� Ȱ���� ���� �˰��� ����
		3. �迪�� Ȱ���� Ž�� �˰��� ����

���� ����*/

package week13;

class bubbleSort {
	public static void bubble(int[]arrays) {
		int temp;
		
		for(int i = 0; i<arrays.length;i++) {
			for(int j =0;j<arrays.length-1;j++) {
				if(arrays[j]>arrays[j+1]) {
					temp = arrays[j];
					arrays[j] = arrays[j+1];
					arrays[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[]args) {
		
		int[]arr= {4,7,2,1,3};
		
		System.out.println("���� ��");
		for(int value : arr) {
			System.out.print(value+" ");
		}
		bubble(arr);
		System.out.println();
		System.out.println("���� ��");
		for(int value : arr) {
			System.out.print(value+" ");
		}
	}

}
