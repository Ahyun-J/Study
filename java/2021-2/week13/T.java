package week13;

 public class T{
	public static void main(String[]args) {
		MyMax <Integer> m = new MyMax<Integer>();
		m.max(5, 6);
	}
}
 
class MyMax <T extends Number> {
	int x, y =0;
	public T max(T x, T y) {
	//	if (x > y)
			return x;
	//	else
		//	return y;
	}
}

