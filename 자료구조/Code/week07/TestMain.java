package week07;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ListQueue<String> q1 = new ListQueue<String>();
//		q1.add("A");	q1.add("B");	q1.add("C");
//		q1.add("D");	q1.add("E");	
//		
//		System.out.print("[Task 1] ");
//		q1.print();
//		
//		q1.reverse();		
//		System.out.print("[Task 1 reverse] ");
//		q1.print();
//		
//		ListQueue<Integer> q2 = new ListQueue<Integer>();
//		q2.add(1);	q2.add(2);	q2.add(3);
//		q2.add(4);	q2.add(5);	
//		
//		System.out.print("[Task 2] ");
//		q2.print();
//		
//		q2.reverse();
//		System.out.print("[Task 2 reverse] ");
//		q2.print();
		
		ListQueue<Integer> q = new ListQueue<Integer>();
		q.add(1);	q.add(2);	q.add(3);
		q.add(4);	q.add(5);	q.print();
		
		int answer = (int) q.avg();
		System.out.println("[Task] " + answer);
		
		q.print();
	}

}
