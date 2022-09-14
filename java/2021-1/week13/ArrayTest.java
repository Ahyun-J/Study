/*학번 : 20215247
이름 : 조아현
실습 목표 : 1. 배열
		2. 배열을 활용한 정열 알고리즘 구현
		3. 배역을 활용한 탐색 알고리즘 구현

main 메서드에서 다음의 값을 가지는 1차원 배열을 선언과 동시에 초기화하고 
배열 값과 배열의 총 합을 출력을 위한 print메서드를 만들고 이 메서드를 이용해 
출력하는 프로그램*/

package week13;

class ArrayTest {
	public static void print(int[]arr ) {
		int sum =0;
		System.out.println("출력결과 >");
		for(int i=0;i<arr.length;i++) {
			System.out.println("배열["+i+"] = "+arr[i]);
			sum = sum+arr[i];
		}
		System.out.println("배열 합 : "+sum);
	}
public static void main(String[]arg) {
	int []ary= {1,2,3,4,5,6,7,8,9,10};
	print(ary);
}
}
