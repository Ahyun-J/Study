package week05;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SList<Integer> slist1 = new SList<Integer> ();
		int [] arr1 = {7,11,4,1,8};
		slist1.setAndOrderNodes(arr1);
		System.out.print("[Task 1: SList slist1] "); slist1.print();
		System.out.println();
		
		SList<Integer> slist2 = new SList<Integer> ();
		int [] arr2 = {5,2,8,7,13};
		slist2.setAndOrderNodes(arr2);
		System.out.print("[Task 2: SList slist2] "); slist2.print();
		System.out.println();
		
		slist1.join(slist2); 
		System.out.print("[Task 3: slist1.join(slist2)] ");
		slist1.print(); System.out.println();
		
//		SList<Integer> s1 = new SList<Integer> ();
//		int [] arr3 = {5,4,3,2,1};
//		s1.setAndOrderNodes(arr3);
//		
//		System.out.print("[SList sl 리스트] "); s1.print(); 
//		System.out.println();
//		s1.reverse(); 
//		System.out.print("[sl.reverse() 결과] "); s1.print();
//		System.out.println();
//
//		DList<Integer> dl1 = new DList<Integer> ();
//		dl1.insertAfter(dl1.head, 1);
//		dl1.insertBefore(dl1.tail, 2);
//		dl1.insertBefore(dl1.tail, 3);
//		dl1.print();
//		
//		DList<Integer> dl2 = new DList<Integer> ();
//		dl2.insertAfter(dl2.head, 6);
//		dl2.insertBefore(dl2.tail, 7);
//		dl2.insertBefore(dl2.tail, 8);
//		dl2.insertBefore(dl2.tail, 9);
//		dl2.print();
//		
//		int add1 = dl1.add(dl2);
//		int add2 = dl2.add(dl1);
//		
//		System.out.println("[Task 3-1] "+add1);
//		System.out.println("[Task 3-2] "+add2);
	}

}
