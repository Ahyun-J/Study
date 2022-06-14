package week11;

public class Chaining<K, V> {
	private int M = 5, N = 0;// ���̺� ũ��
	private Node[] a = new Node[M]; // �ؽ� ���̺�

	public static class Node { // Node Ŭ����
		public Object key;
		public Object data;
		public Node next;

		public Node(Object newkey, Object newdata, Node ref) { // ������
			key = newkey;
			data = newdata;
			next = ref;
		}

		public Object getKey() {
			return key;
		}

		public Object getData() {
			return data;
		}
	}

	private int hash(K key) { // �ؽ��ڵ�
		return (key.hashCode() & 0x7fffffff) % M; // ������ ����
	}

	public V get(K key) { // Ž�� ����
		int i = hash(key);
		for (Node x = a[i]; x != null; x = x.next) // ���Ḯ��Ʈ Ž��
			if (key.equals(x.key))
				return (V) x.data; // Ž�� ����
		return null;
	}

	public void put(K key, V data) { // ���� ����
		int i = hash(key);
		for (Node x = a[i]; x != null; x = x.next) // ���Ḯ��Ʈ Ž��
			if (key.equals(x.key)) { // �̹� key ����
				x.data = data; // �����͸� ����
				return;
			}
		N++;
		//this.check_and_rehash();
		a[i] = new Node(key, data, a[i]); // ���� ����Ʈ�� ù ���� ����
	}

	public void print() {
		System.out.println("�ؽ� ���̺�:");
		for (int i = 0; i < M; i++) {
			System.out.print(i);
			if (a[i] != null) {
				for (Node x = a[i]; x != null; x = x.next) {
					System.out.print("-->[" + x.key + ", " + x.data + "]");
				}
			}
			System.out.println();
		}

	}

	public void delete(K key) {
		int i = hash(key);
		Node x = a[i];
		Node prevN = null;
		Object nextN = null;
		while(x != null) {
			if(key.equals(x.key)) {
				nextN = x.getKey();
				if(prevN == null) {
					a[i] = x.next;
				}
				else
					prevN.next = x.next;
				x = null;
				break;
			}
			prevN = x;
			x = x.next;
		}
		N--;
		check_and_rehash();
	}

	private void check_and_rehash() {
		// ��[check_and_rehash] ���̺��� ����� (A) ���� (B)�� �����մϴ�.��
		// �Ǵ� ��[check_and_rehash] ���̺��� ����� �������� �ʽ��ϴ�.��
		// �ּ� ũ�� M=5
		// ������a = ���̺� ����� Ű�� �� :N / ���̺��� ũ�� :M
		// a >0.75 --> 2�� a<0.25 -->1/2��
		double alpha = (double) N / (double) M;
		if (alpha > 0.75) {
			System.out.print("[check_and_rehash] ���̺��� �����" + M + "����");
			M *= 2;
			Node[] b = new Node[M];
			for (int i = 0; i < a.length; i++) {
				b[i] = a[i];
			}
			a = b;
			System.out.println(M + "�� �����մϴ�.");
		} else if (alpha < 0.25) {
			if ((M / 2) < 5) {
				System.out.println("[check_and_rehash] ���̺��� ����� �������� �ʽ��ϴ�.");
			} else {
				System.out.print("[check_and_rehash] ���̺��� �����" + M + "����");
				M /= 2;
				Node[] b = new Node[M];
				for (int i = 0, j = M; i < M; i++, j++) {
					b[i] = a[j]; 
				}
				a = b;
				System.out.println(M + "�� �����մϴ�.");
			}
		} else if (alpha < 0.75 || alpha > 0.25)
			System.out.println("[check_and_rehash] ���̺��� ����� �������� �ʽ��ϴ�.");
	}

	public boolean findTwoNum(int[] arr, int sum) {
		Chaining <Integer, Integer> tab = new Chaining <>();
		Chaining<Integer, Integer> ch = new Chaining <>();
		
		for(int i=0; i < arr.length; i++) {
			ch.put(arr[i], arr[i]);
		}
		
		for(int x : arr) {
			int diff = sum-x;  // x + diff == sum
			if (ch.get(x) == diff) return true;
			else tab.put(x,x);
		}
		return false;
	}
}
