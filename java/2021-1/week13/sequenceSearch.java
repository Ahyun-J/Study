/*학번 : 20215247
이름 : 조아현
실습 목표 : 1. 배열
		2. 배열을 활용한 정열 알고리즘 구현
		3. 배역을 활용한 탐색 알고리즘 구현

순차 탐색*/

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
			
			System.out.println("배열");
			for(int value : arr) {
				System.out.print(value+" ");
			}
			System.out.println();
			System.out.print("찾고자 하는 값 입력 : ");
			key = scan.nextInt();
			index = search(arr,key);
			if(index == -1) {
				System.out.println("찾는 값이 없습니다.");
			}
			else {
				System.out.println("찾는 값은 배열인덱스 ["+ index +"]에 있습니다.");
			}
			
		scan.close();
	}

}
