package week11;

public class ChainMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Chaining a = new Chaining();
//		
//		a.put(25, "grape");		a.put(37, "apple");		a.put(18, "banana");
//		a.put(55, "cherry");	a.put(22, "mango");		a.put(35, "lime");
//		a.put(50, "orange");	a.put(63, "watermelon");	
//		
//		System.out.println("탐색 결과");
//		System.out.println("50의 data = " + a.get(50));
//		System.out.println("63의 data = " + a.get(63));
//		System.out.println("37의 data = " + a.get(37));
//		System.out.println("22의 data = " + a.get(22));
//		System.out.println();
//		
//		a.print();
		
		Chaining<Integer, Integer> ch = new Chaining<Integer, Integer>();
//		for(int i=0;i<20;i++) {ch.put(i,i);}
//		ch.print();
//
//		for(int i=0;i<20;i++) ch.delete(i);
//		ch.print();
		
		int [] arr1 = {1,2,3,9}; int sum1=8;
		System.out.println("[Task 1] 결과: " 
				+ ((ch.findTwoNum(arr1, sum1))?"True" : "False"));
		
		int [] arr2= {1,2,4,4}; int sum2 = 8; 
		System.out.println("[Task 2] 결과: " 
				+ ((ch.findTwoNum(arr2, sum2))?"True" : "False"));
	}

}
