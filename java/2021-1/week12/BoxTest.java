/*�й� : 20215247
�̸� : ������
�ǽ� 1. �� main�� ������ BoxTest Ŭ������ �̿� 2���� Box Ŭ���� ����
�� �����ڸ� �̿� box1�� ����,����,���� ���� 10,10,10���� ����
�� box2�� ����,����,���� ���� 5,5,5�� ����
�� getVolume()�޼ҵ带 �̿� box1�� box2�� ���Ǹ� ���
�� toString()�޼ҵ带 �̿� box1�� box2�� ������ ���
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
			return "���� : "+length+", ���� : "+width+", ���� : "+height+", ���� : "+(width*height*length)+"\n";
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
			
			System.out.println("box1�� ���� : "+box1.getVolume());
			System.out.println("box1�� ���� : "+box1.toString());
			System.out.println("box2�� ���� : "+box2.getVolume());
			System.out.println("box2�� ���� : "+box2.toString());
		}
	}

