package week10;

public class BST<Key extends Comparable<Key>, Value> {
	public Node root;
	public Node getRoot() { return root; }
	public BST(Key newId, Value newName) {
		root = new Node(newId, newName);
	}
	// get, put, min, deletMin, delete 메소드

	public Value get(Key k) {
		return get(root, k);
	}

	public Value get(Node n, Key k) {
		if (n == null)
			return null;
		int t = n.getKey().compareTo(k);
		if (t > 0)
			return get(n.getLeft(), k);
		else if (t < 0)
			return get(n.getRight(), k);
		else
			return (Value) n.getValue();
	}

	public void put(Key k, Value v) {
		root = put(root, k, v);
	};

	public Node put(Node n, Key k, Value v) {
		if (n == null)
			return new Node(k, v);
		int t = n.getKey().compareTo(k);
		if (t > 0)
			n.setLeft(put(n.getLeft(), k, v));
		else if (t < 0)
			n.setRight(put(n.getRight(), k, v));
		else
			n.setValue(v);
		return n;
	}

	public Key min() {
		if (root == null)
			return null;
		return (Key) min(root).getKey();
	}

	private Node min(Node n) {
		if (n.getLeft() == null)
			return n;
		return min(n.getLeft());
	}

	public void deleteMin() {
		if (root == null)
			System.out.println("empty 트리");
		else
			root = deleteMin(root);
	}

	private Node deleteMin(Node n) {
		if (n.getLeft() == null)
			return n.getRight();
		n.setLeft(deleteMin(n.getLeft()));
		return n;
	}

	public void delete(Key k) {
		root = delete(root, k);
	}

	public Node delete(Node n, Key k) {
		if (n == null)
			return null;
		int t = n.getKey().compareTo(k);
		if (t > 0)
			n.setLeft(delete(n.getLeft(), k));
		else if (t < 0)
			n.setRight(delete(n.getRight(), k));
		else {
			if (n.getRight() == null)
				return n.getLeft();
			if (n.getLeft() == null)
				return n.getRight();
			Node target = n;
			n = min(target.getRight());
			n.setRight(deleteMin(target.getRight()));
			n.setLeft(target.getLeft());
		}
		return n;
	}

	public void print() {
		Node n = this.getRoot();
		this.inorder(n);
		System.out.println();
	}

	public void inorder(Node n) {
		if (n != null) {
			inorder(n.getLeft());
			System.out.print(n.getValue() + " ");
			inorder(n.getRight());
		}
	}

	public Key max() {
		if (root == null)
			return null;
		return (Key) max(root).getKey();
	}

	private Node max(Node n) {
		if (n.getRight() == null)
			return n;
		return max(n.getRight());
	}

	public void deleteMax() {
		if (root == null)
			System.out.println("empty 트리");
		else
			root = deleteMax(root);
	}

	private Node deleteMax(Node n) {
		if (n.getRight() == null)
			return n.getLeft();
		n.setRight(deleteMax(n.getRight()));
		return n;
	}

	private int i ;
	//BST 클래스에서 k번째 작은 Key를 찾아 키 값을 리턴
	public Key kthSmallest(int k) {
		int [] arr = new int[size(this.getRoot())];
		i = 0;
	
		arr = this.inorder2(getRoot(), arr);
		Key key = (Key) Integer.toString(arr[k]);
		
		return key;
	}
	
	public int[] inorder2(Node n, int [] arr) {
		if (n != null) {
			inorder2(n.getLeft(), arr);
			arr[i++] = (int) n.getKey();
			inorder2(n.getRight(), arr);
		}
		return arr;
	}
	
	public int height(Node n) {
		if(n == null)
			return 0;
		else
			return (1 + Math.max(height(n.getLeft()), height(n.getRight())));
	}
	
	public int size(Node n) {
		if ( n == null)
			return 0;
		else
			return (1 + size(n.getLeft())) + size(n.getRight());
	}

	//이진 탐색 트리가 맞는지를 검사
	public boolean checkBST() {
		if (root == null) return false;
		int [] arr = new int[(int) Math.pow(2, this.height(getRoot()))];
		i = 0;
		
		arr = this.inorder2(getRoot(), arr);
		
		for(int j = 0; j < arr.length ; j++) {
			if(arr[j] == 0 || arr[j+1] == 0) break;
			if(arr[j] > arr[j+1]) return false;
			else continue;
		}
		
		return true;
	}

	public void setRoot(Node key) {
		this.root = key;
	}

}
