package week7;

public class Rectangle implements IGraphics{
	private int length, width;
	
	public int getArea() {
		int a = length*width;
		return a;
		//return( this.length * this.width);
	}
	
	public void setValue(int l, int w){
		this.length = l;
		this.width = w;
		//this 없이 o
	}
	public void draw(){
		System.out.println("사각형을 그립니다.");
	}
	
}
