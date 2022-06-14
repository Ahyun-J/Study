package week09;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<Key extends Comparable<Key>> {
	private Node root;
	public BinaryTree() { root = null;}
	public Node getRoot() {return root;}
	public void setRoot(Node newRoot) {root = newRoot;}
	public boolean isEmpty() {return root == null;}
	
	//preorder(), inorder(), postorder(), levelorder(),
	//size(), height(), isEqual()
	
	//전위순회
	public void preorder(Node n) {
		if (n != null) {
			System.out.print(n.getKey()+" ");
			preorder(n.getLeft());
			preorder(n.getRight());
		}
	}
	
	//중위순회
	public void inorder(Node n) {
		if (n != null) {
			inorder(n.getLeft());
			System.out.print(n.getKey()+" ");
			inorder(n.getRight());
		}
	}
	
	//후위순회
	public void postorder(Node n) {
		if (n != null) {
			postorder(n.getLeft());
			postorder(n.getRight());
			System.out.print(n.getKey()+" ");
		}
	}

	//레벨순회
	public void levelorder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		Node t;
		q.add(root);
		while(!q.isEmpty()) {
			t = q.remove();
			System.out.print(t.getKey()+" ");
			if(t.getLeft() != null)
				q.add(t.getLeft());
			if(t.getRight() != null)
				q.add(t.getRight());
		}
	}
	
	public int size(Node n) {
		if(n == null)
			return 0;
		else
			return (1 + size(n.getLeft()) + size(n.getRight()));
	}

	public int height(Node n) {
		if(n == null)
			return 0;
		else
			return (1 + Math.max(height(n.getLeft()), height(n.getRight())));
	}

	public static boolean isEqual(Node n, Node m) {
		if(n == null || m == null)
			return n == m;
		
		if(n.getKey().compareTo(m.getKey()) != 0)
			return false;
		
		return( isEqual(n.getLeft(), m.getLeft()) &&
				isEqual(n.getRight(), m.getRight()));
	}
	
	//[Task 1] 
	//이진 트리를 int[] 배열로 저장
	public int[] btree2intarr() {
		int h = this.size(this.getRoot());
		int [] arr = new int [h+1];
		
		Queue<Node> q = new LinkedList<Node>();
		Node t;
		q.add(root);
		
		int i = 1;
		
		while(!q.isEmpty()) {
			t = q.remove();
			arr[i++] = (int) t.getKey();
			if(t.getLeft() != null)
				q.add(t.getLeft());
			if(t.getRight() != null)
				q.add(t.getRight());
		}
		
		return arr;
	}		
	
	public void print(int [] arr) {
		for(int i = 1; i < arr.length ;i++) {
			System.out.print(i+")"+arr[i]+" ");
		}
		System.out.println();
	}
	
	
//		for( int i = 1; i <= arr.length; i++) {
//			while(!q.isEmpty()) {
//				t = q.remove();
//				arr[i] = (int) t.getKey();
//				if(t.getLeft() != null)
//					arr[2*i] = t.getLeft();
//				if(t.getRigth() != null)
//					arr[2*i+1] = t.getRigth();
//			}
//		}
		
//		Queue<Node> q = new LinkedList<Node>();
//		Node t;
//		q.add(root);

	public void intarr(int[] arr) {
		
		int j = 2;
		Queue<Integer> q = new LinkedList<Integer>();
		Node t = new Node(arr[1], null, null);
		this.setRoot(t);
		
		for(int i =2; i < arr.length; i++) {
			q.add(arr[i]);
		}
		
		while(!q.isEmpty()) {
			Node h = new Node(q.remove(),null,null);
			if(j%2 == 0) {
				t.setLeft(h);
				t = t.getLeft();
				
			} else {
				t.setRight(h);
				t = t.getRight();
			}
			j++;
		}
	
		//levelorder(root);
	}
	//[Task 2] 
	//int[] 에 저장된 이진 트리를 입력으로 받아 연결 리스트 형태의 이진 트리 표현으로 변환
	public void intarr2btree(int[] arr) {
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) cnt++;
			
		}

		int ind = 1;
		Node root_node = new Node(arr[ind++], null, null);
		this.setRoot(root_node);
		
		Queue<Node> q = new LinkedList<Node>();
		Node t;
		q.add(this.getRoot());
		
		for(int i = 1; i < cnt; i++) {
			t = q.remove();
			int t_n = arr[ind++];
			Node t_node = new Node(t_n, null, null);
			if(i%2 == 0) {
				t.setLeft(t_node);
				t = t.getLeft();
				q.add(t_node);
			} else {
				t.setRight(t_node);
				t = t.getRight();
				q.add(t_node);
			}
		}
		
	}
	
	//두개의 트리에서 동일한 서브트리가 있는지를 검사하는 
	public LinkedList<Node> subTreeCompare(BinaryTree t){
		LinkedList link = new LinkedList();
		
		Queue<Node> qA = new LinkedList<Node>();
		Node tA;
		qA.add(root);
		
		while(!qA.isEmpty()) {
			tA = qA.remove();
			Queue<Node> qB = new LinkedList<Node>();
			Node tB;
			qB.add(t.getRoot());
			while(!qB.isEmpty()) {
				tB = qB.remove();
				if(isEqual(tA, tB))
					//levelorder(tA);
					link.add(tA);
				if(tB.getLeft() != null)
					qB.add(tB.getLeft());
				if(tB.getRight() != null)
					qB.add(tB.getRight());
			}
			if(tA.getLeft() != null)
				qA.add(tA.getLeft());
			if(tA.getRight() != null)
				qA.add(tA.getRight());
		}
		
		return link;
	}
	
	public void print(LinkedList link) {
		int size = link.size();
		
		for(int i = 0; i<size; i++) {
			Node p = (Node) link.remove();
			this.setRoot(p);
			System.out.println("Found a matching subtree " + (i+1) +":");
			levelorder(root); System.out.println();
		}
	}
}