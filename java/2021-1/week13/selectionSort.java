/*�й� : 20215247
�̸� : ������
�ǽ� ��ǥ : 1. �迭
		2. �迭�� Ȱ���� ���� �˰��� ����
		3. �迪�� Ȱ���� Ž�� �˰��� ����

���� ����*/

package week13;

class selectionSort{
	public static void Sort(int[]arrays) {
		int temp;
		int least = 0;
		
		for(int i = 0;i<arrays.length-1;i++) {
			least=i;
				for(int j =i+1;j<arrays.length;j++) {
					if(arrays[j]<arrays[least]) {
						least = j;
						
					}
					
				}
				temp = arrays[i];
				arrays[i] = arrays[least];
				arrays[least] = temp;
			}
		}
		
	public static void main(String[]arg) {
			int[]arr= {4,7,2,1,3};
			
			System.out.println("���� ��");
			for(int value : arr) {
				System.out.print(value+" ");
			}
			Sort(arr);
			System.out.println();
			System.out.println("���� ��");
			for(int value : arr) {
				System.out.print(value+" ");
			}
		
	
	}

}
	
