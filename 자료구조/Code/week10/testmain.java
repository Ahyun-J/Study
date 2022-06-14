package week10;

public class testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test<Integer, Integer> bst3 = new test<Integer, Integer>(10,10);
//		
//		bst3.put(60, 60);	bst3.put(25, 25);	bst3.put(30, 30);	
//		bst3.put(20, 20);	bst3.put(50, 50);	bst3.put(45, 45);	
//		bst3.put(70, 70);	bst3.put(40, 40);	bst3.put(35, 35);
//		bst3.put(10, 10);
//		
//		bst3.print();
//		
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(bst3.kthSmallest(i));
//		}
		
		test<Integer, Integer> bst4 = new test<Integer, Integer>(10,10);
		
		Node n7 = new Node(80, 80);
		Node n6 = new Node(60, 60);
		Node n5 = new Node(30, 30);
		Node n4 = new Node(10, 10);
		Node n3 = new Node(75, 75);
		Node n2 = new Node(25, 25);
		Node n1 = new Node(50, 50);
		bst4.setRoot(n1);
		
		n1.setLeft(n2); n1.setRight(n3);
		n2.setLeft(n4); n2.setRight(n5);
		n3.setLeft(n6); n3.setRight(n7);
		n4.setLeft(null); n4.setRight(null);
		n5.setLeft(null); n5.setRight(null);
		n6.setLeft(null); n6.setRight(null);
		n7.setLeft(null); n7.setRight(null);
		
		bst4.print();
		//System.out.println(bst4.checkBST());
		//bst4.deleteMin();bst4.deleteMin();
		System.out.println("[Task 1] : " 
				+ ((bst4.checkBST())?"True" : "False"));
		
		test<Integer, Integer> bst5 = new test<Integer, Integer>(10,10);
		
		Node n07 = new Node(60, 60);
		Node n06 = new Node(80, 80);
		Node n05 = new Node(30, 30);
		Node n04 = new Node(10, 10);
		Node n03 = new Node(75, 75);
		Node n02 = new Node(25, 25);
		Node n01 = new Node(50, 50);
		bst5.setRoot(n01);
		
		n01.setLeft(n02); n01.setRight(n03);
		n02.setLeft(n04); n02.setRight(n05);
		n03.setLeft(n06); n03.setRight(n07);
		n04.setLeft(null); n04.setRight(null);
		n05.setLeft(null); n05.setRight(null);
		n06.setLeft(null); n06.setRight(null);
		n07.setLeft(null); n07.setRight(null);
		
		bst5.print();
		//System.out.println(bst5.checkBST());
		System.out.println("[Task 2] : " 
				+ ((bst5.checkBST())?"True" : "False"));
		bst5.print();
	}

}
