package week11;

public class Linear2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearProbing2 a = new LinearProbing2();
		
		a.put(25, 25);	a.put(37, 37);	a.put(18, 18);
		a.put(55, 55);	a.put(22, 22);	a.put(35, 35);
		a.put(50, 50);	a.put(63, 63);	
		
		a.print();
		
		System.out.println("\n탐색 결과:");
		System.out.println("63을 찾았습니다! " + a.get(63));
		
		a.delete(50);
		
		a.print();
		
		System.out.println("\n탐색 결과:");
		System.out.println("63을 찾았습니다! " + a.get(63));
	}

}
