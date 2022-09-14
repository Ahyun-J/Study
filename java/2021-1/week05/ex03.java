/*학번 : 20215247
이름 : 조아현
두 수를 입력받아 관계연산을 수행한 결과를 출력하는 프로그램 */

package week05;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x ;
		int y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요 : ");
		
		x = input.nextInt();
		y = input.nextInt();
		
		System.out.format("%d<%d 은 %b \n",x,y,x<y);
		System.out.format("%d>%d 은 %b \n",x,y,x>y);
		System.out.format("%d<=%d 은 %b \n",x,y,x<=y);
		System.out.format("%d>=%d 은 %b \n",x,y,x>=y);
		System.out.format("%d==%d 은 %b \n",x,y,x==y);
		System.out.format("%d!=%d 은 %b \n",x,y,x!=y);
		System.out.format("!(%d!=%d) 은 %b \n",x,y,!(x!=y));
		
		input.close();
		
		

	}

}
