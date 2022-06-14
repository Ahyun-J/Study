package week09;

import java.util.LinkedList;

public class SubTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tA = new BinaryTree();
		BinaryTree tB = new BinaryTree();
		
//		tA = { 100,200,300,400,500,600,700,800}
//		tB = {1,2,3,300,7,9,70,600,700}
	
		Node n8 = new Node(800, null, null);
		Node n7 = new Node(700, null, null);
		Node n6 = new Node(600, null, null);
		Node n5 = new Node(500, null, null);
		Node n4 = new Node(400, n8, null);
		Node n3 = new Node(300, n6, n7);
		Node n2 = new Node(200, n4, n5);
		Node n1 = new Node(100, n2, n3);
		tA.setRoot(n1);
		
		Node n09 = new Node(700, null, null);
		Node n08 = new Node(600, null, null);
		Node n07 = new Node(70, null, null);
		Node n06 = new Node(9, null, null);
		Node n05 = new Node(7, null, null);
		Node n04 = new Node(300, n08, n09);
		Node n03 = new Node(3, n06, n07);
		Node n02 = new Node(2, n04, n05);
		Node n01 = new Node(1, n02, n03);
		tB.setRoot(n01);
		
		LinkedList link = new LinkedList();
		
		link = tA.subTreeCompare(tB);
		tA.print(link);
		
	}

}
