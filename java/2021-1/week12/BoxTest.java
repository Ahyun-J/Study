/*학번 : 20215247
이름 : 조아현
실습 1. ● main을 가지는 BoxTest 클래스를 이용 2개의 Box 클래스 생성
● 설정자를 이용 box1은 가로,세로,높이 각각 10,10,10으로 설정
● box2는 가로,세로,높이 각각 5,5,5로 설정
● getVolume()메소드를 이용 box1과 box2의 부피를 출력
● toString()메소드를 이용 box1과 box2의 정보를 출력
*/

package week12;

class Box {
		private int width;
		private int length;
		private int height;
		
		public void setWidth(int w) {
			width = w;
		}
		public void setHeight(int h) {
			height = h;
		}
		public void setLength(int l) {
			length = l;
		}
		public int getWidth() {
			return width;
		}
		public int getLength() {
			return length;
		}
		public int getHeight() {
			return height;
		}
		public int getVolume() {
			return width*height*length;
		}
		public String toString() { 
			return "가로 : "+length+", 세로 : "+width+", 높이 : "+height+", 부피 : "+(width*height*length)+"\n";
		}

	}

	public class BoxTest {
		public static void main (String[]args) {
			Box box1 = new Box();
			box1.setWidth(10);
			box1.setHeight(10);
			box1.setLength(10);
			
			Box box2 = new Box();
			box2.setWidth(5);
			box2.setHeight(5);
			box2.setLength(5);
			
			System.out.println("box1의 부피 : "+box1.getVolume());
			System.out.println("box1의 정보 : "+box1.toString());
			System.out.println("box2의 부피 : "+box2.getVolume());
			System.out.println("box2의 정보 : "+box2.toString());
		}
	}

