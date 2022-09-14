package week7;

public interface IGraphics {
	public int getArea();
	
	public default void draw() {
		System.out.println("그립니다.");
	}
}
