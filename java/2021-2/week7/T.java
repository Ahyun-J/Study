package week7;

class R{
	int w, h;
	int p() {return 2*w+2*h;}
	int a() {return w*h;}
}
public class T {
public static void main(String[] args) {
	
	R r = new R();
	r.w = 10;
	r.h = 20;
	System.out.println(r.a());
	System.out.println(r.p());
	
}
	
//class N{
//public int i;
//public float f;
//
//public N (int i, double d){
//	this.i = i;
//	this.f = (float) d;
//	
//}
//
//@Override
//public String toString() {
//	return "N [i=" + i + ", f=" + f + "]";
//}
//}
//
//public class Tset {
//
//public static void main(String[] args) {
//	N n = new N(10, 1.2345);
//	System.out.println(n);
//	System.out.println(n.f);
//	
//	
//}
//}

//class R{
//	int w, h;
//	int a() {return w*h;}
//}
//public class Tset {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//R mr = new R();
//mr.w = 10;
//mr.h = 20;
//System.out.println(mr.a());
//	}
//
}
