package week09;

import java.util.LinkedList;

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree t1 = new BinaryTree();
		BinaryTree t2 = new BinaryTree();

		Node n8 = new Node(800, null, null);
		Node n7 = new Node(700, null, null);
		Node n6 = new Node(600, null, null);
		Node n5 = new Node(500, null, null);
		Node n4 = new Node(400, n8, null);
		Node n3 = new Node(300, n6, n7);
		Node n2 = new Node(200, n4, n5);
		Node n1 = new Node(100, n2, n3);
		t1.setRoot(n1);
		
		Node n08 = new Node(800, null, null);
		Node n07 = new Node(700, null, null);
		Node n06 = new Node(600, null, null);
		Node n05 = new Node(500, null, null);
		Node n04 = new Node(400, n08, null);
		Node n03 = new Node(300, n06, n07);
		Node n02 = new Node(200, n04, n05);
		Node n01 = new Node(100, n02, n03);
		t2.setRoot(n01);

		System.out.print("트리 노드 수  = " + t1.size(t1.getRoot()) + "\n트리 높이 = " + t1.height(t1.getRoot()));
		System.out.print("\n전위순회: ");		t1.preorder(t1.getRoot());
		System.out.print("\n중위순회: ");		t1.inorder(t1.getRoot());
		System.out.print("\n후위순회: ");		t1.postorder(t1.getRoot());
		System.out.print("\n레벨순회: ");		t1.levelorder(t1.getRoot());
		System.out.print("\n동일성 검사: " + BinaryTree.isEqual(t1.getRoot(), t2.getRoot()));
		
		int [] arr = t1.btree2intarr();
		System.out.println();
		t1.print(arr);
		
		BinaryTree tNew = new BinaryTree();
		tNew.intarr2btree(arr);
		
		System.out.print("\ntNew 레벨순회: ");
		tNew.levelorder(tNew.getRoot());
		
		
		
//		tNew.intarr(arr);	
//		System.out.print("\ntNew 레벨순회: ");
//		tNew.levelorder(tNew.getRoot());
		
	}

}
