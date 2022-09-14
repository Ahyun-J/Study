package week6;

public class ShapeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		IDrawable arrayOfShapes = new Shape();
//		arrayOfShapes.draw();
//		
//		arrayOfShapes = new Rectangle();
//		arrayOfShapes.draw();
//		
//		arrayOfShapes = new Triangle();
//		arrayOfShapes.draw();
//		
//		arrayOfShapes = new Circle();
//		arrayOfShapes.draw();
		
		
		IDrawable [] arrayOfShapes = { 
				new Shape(), 
				new Rectangle(),
				new Triangle(), 
				new Circle()
				};
		
		IDrawable array[] = new Shape[3];
		
		
		for(IDrawable id : arrayOfShapes) {
			id.draw();
		}
		
		System.out.println("20215247_Á¶¾ÆÇö");
		
//		for(int i=0 ; i <arrayOfShapes.length;i++ ) {
//			arrayOfShapes.draw();
//		}

	}


}
