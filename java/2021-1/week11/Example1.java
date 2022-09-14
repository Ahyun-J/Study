/*학번 : 20215247
이름 : 조아현
실습 목표 : 1. 객체의 구성
 1) 클래스의 구성
 3) 간단한 메서드 작성*/
  package week11;
  
  class Coord { 
	  private int pos_x; 
	  private int pos_y;
  
  public int getPos_x() { 
	  return pos_x; } 
  public int getPos_y() { 
	  return pos_y;
  } 
  public void setPos_x(int a) { 
	  pos_x = a; } 
  public void setPos_y(int a) {
  pos_y = a; } 
  public void moveXY(int x, int y) { 
	  pos_x += x; 
	  pos_y += y; }
  public String toString() { 
	  return "coordinate X:"+pos_x+" Y:"+pos_y; } }
  
  class Example1 { public static void main(String[]args) { 

Coord crd1 = new Coord(); 
crd1.setPos_x(10); 
  crd1.setPos_y(20);
  System.out.println(crd1.toString()); 
  crd1.moveXY(20,30);
  System.out.println(crd1);
  System.out.println("X:"+crd1.getPos_x()+" Y:"+crd1.getPos_y());
  
  }
  
  }
 