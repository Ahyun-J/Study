/*학번 : 20215247
이름 : 조아현
실습 목표 : 1. 배열
		2. 배열을 활용한 정열 알고리즘 구현
		3. 배역을 활용한 탐색 알고리즘 구현

버블 정렬*/

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
		
		System.out.println("정렬 전");
		for(int value : arr) {
			System.out.print(value+" ");
		}
		bubble(arr);
		System.out.println();
		System.out.println("정렬 후");
		for(int value : arr) {
			System.out.print(value+" ");
		}
	}

}
