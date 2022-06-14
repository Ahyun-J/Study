package week10;

public class test<Key extends Comparable<Key>, Value> {
	public Node root;

	public Node getRoot() {
		return root;
	}

	public test(Key newId, Value newName) {
		root = new Node(newId, newName);
	}

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

	private int i;
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
	public int size(Node n) {
		if ( n == null)
			return 0;
		else
			return (1 + size(n.getLeft())) + size(n.getRight());
	}
	public void InOrder(Node root, int[] arr) {
		int idx = 0;
		if (root == null)
			return;
		InOrder(root.getLeft(), arr);
		arr[idx++] = (int) root.getValue();
		InOrder(root.getRight(), arr);
	}

	public boolean isBST() {
		int[] arr = new int[10];
		InOrder(root, arr);

		for (int i = 0; i < 10 - 1; i++)
			if (arr[i] > arr[i + 1])
				return false;
		return true;
	}

	public boolean IsBST() {
		return isBST(this.getRoot());
	}

	public boolean isBST(Node root) {
		if (root == null)
			return true;

		if (!isBST(root.getLeft()))
			return false;

		Integer prev = null;
		if (prev != null && (Integer) root.getValue() < prev)
			return false;

		prev = (Integer) root.getValue();

		if (!isBST(root.getRight()))
			return false;

		return true;
	}

//	public boolean checkBST() {
//		Node n = this.getRoot();
//		if (n == null)
//			return false;
//		test t = new test(10, 10);
//		t = this;
//
//		int tA = (int) t.min();
//		t.deleteMin();
//		for (int i = 0; i < 6; i++) {
//			int tB = (int) t.min();
//			if (tA <= tB) {
//				tA = tB;
//				t.deleteMin();
//			} else {
//				return false;
//			}
//		}
//		return true;
//	}

	public boolean checkBST() {
		Node n = this.getRoot();
		if (n == null)
			return false;
		test t = new test(10, 10);
		t = this;

		int tA = (int) t.min();
		int [] arr = new int[size(this.getRoot())];
		i = 0;
		arr = inorder2(root,arr);
		
		for (int i = 0; i < 6; i++) {
			int tB = arr[i];
			if (tA <= tB) {
				tA = tB;
			} else {
				return false;
			}
		}
		return true;
	}

	public void setRoot(Node key) {
		this.root = key;
	}
}
