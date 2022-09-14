class A1 {
	int a = 100;
	int b = 200;
	
	int getSum(){
		return a+b;
	}

	int getAvg(){
		return (a+b)/2;
	}
}

public class Mymain extends A1{
	public static void main(String [] args) {
	// ¹«Á¶°Ç »§À» Âï´Â´Ù.
	A1 a1 = new A1();
//	a1.getSum();
//	a1.getAvg();
	int sum = a1.getSum();
	int avg = a1.getAvg();
	
//	System.out.println(a1.getSum());
//	System.out.println(a1.getAvg());
	System.out.println(sum);
	System.out.println(avg);
	}
}
