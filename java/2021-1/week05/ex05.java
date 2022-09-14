/*학번 : 20215247
이름 : 조아현
TRUE / FALSE로 출력하는 프로그램 */

package week05;
// import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 3, j=3, k=5;
		
		//Scanner input = new Scanner(System.in);
		
		//input.nextInt();
		
		
		
		System.out.format("(i <= k) && (i >= j) 조건은 %b \n",(i <= k) && (i >= j));
		System.out.format("( i < k ) || ( k == j ) 조건은 %b \n",( i < k ) || ( k == j ));
		System.out.format("( i != k ) && ( ( i + j ) < k ) 조건은 %b \n",( i != k ) && ( ( i + j ) < k ));
		
		//input.close();

	}

}
