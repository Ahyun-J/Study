package week05;

public class TM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		T<Integer> slist1 = new T<Integer> ();
		int [] arr1 = {1,2,3};
		slist1.setAndOrderNodes(arr1);
		System.out.print("[Task 1: SList slist1] "); slist1.print();
		System.out.println();
		
		T<Integer> slist2 = new T<Integer> ();
		int [] arr2 = {4,5,6};
		slist2.setAndOrderNodes(arr2);
		System.out.print("[Task 2: SList slist2] "); slist2.print();
		System.out.println();
		
		slist1.join(slist2); 
		System.out.print("[Task 3: slist1.join(slist2)] ");
		slist1.print(); System.out.println();
	}
}
