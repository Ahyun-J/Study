package week11;

public class DoubleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleHashing a = new DoubleHashing();
		
		a.put(25, "grape");		a.put(37, "apple");		a.put(18, "banana");
		a.put(55, "cherry");	a.put(22, "mango");		a.put(35, "lime");
		a.put(50, "orange");	a.put(63, "watermelon");	
		
		System.out.println("탐색 결과:");
		System.out.println("50의 data = " + a.get(50));
		System.out.println("63의 data = " + a.get(63));
		System.out.println();
		
		a.print();
	}

}
