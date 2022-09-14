class A {
	int i, j;

	void setij(int x, int y) {
		i = x;
		j = y;
	}
}

class B extends A {
	int total;

	void sum() {
		total = i + j;
		System.out.println("total=" + total);
	}
}

public class Access {
	public static void main(String[] ar) {
		B subOb = new B();
		subOb.setij(100, 200);
		subOb.sum();
		System.out.println("Hello Java");
	}

}
