/*학번 : 20215247
이름 : 조아현
실습 목표 : 1. 배열
		2. 배열을 활용한 정열 알고리즘 구현
		3. 배역을 활용한 탐색 알고리즘 구현

선택 정렬*/

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
			
			System.out.println("정렬 전");
			for(int value : arr) {
				System.out.print(value+" ");
			}
			Sort(arr);
			System.out.println();
			System.out.println("정렬 후");
			for(int value : arr) {
				System.out.print(value+" ");
			}
		
	
	}

}
	
