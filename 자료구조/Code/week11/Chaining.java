package week11;

public class Chaining<K, V> {
	private int M = 5, N = 0;// 테이블 크기
	private Node[] a = new Node[M]; // 해시 테이블

	public static class Node { // Node 클래스
		public Object key;
		public Object data;
		public Node next;

		public Node(Object newkey, Object newdata, Node ref) { // 생성자
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

	private int hash(K key) { // 해시코드
		return (key.hashCode() & 0x7fffffff) % M; // 나눗셈 연산
	}

	public V get(K key) { // 탐색 연산
		int i = hash(key);
		for (Node x = a[i]; x != null; x = x.next) // 연결리스트 탐색
			if (key.equals(x.key))
				return (V) x.data; // 탐색 성공
		return null;
	}

	public void put(K key, V data) { // 삽입 연산
		int i = hash(key);
		for (Node x = a[i]; x != null; x = x.next) // 연결리스트 탐색
			if (key.equals(x.key)) { // 이미 key 존재
				x.data = data; // 데이터만 갱신
				return;
			}
		N++;
		//this.check_and_rehash();
		a[i] = new Node(key, data, a[i]); // 연결 리스트의 첫 노드로 삽입
	}

	public void print() {
		System.out.println("해시 테이블:");
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
		// “[check_and_rehash] 테이블의 사이즈를 (A) 에서 (B)로 변경합니다.”
		// 또는 “[check_and_rehash] 테이블의 사이즈를 변경하지 않습니다.”
		// 최소 크기 M=5
		// 적재율a = 테이블에 저장된 키의 수 :N / 테이블의 크기 :M
		// a >0.75 --> 2배 a<0.25 -->1/2배
		double alpha = (double) N / (double) M;
		if (alpha > 0.75) {
			System.out.print("[check_and_rehash] 테이블의 사이즈를" + M + "에서");
			M *= 2;
			Node[] b = new Node[M];
			for (int i = 0; i < a.length; i++) {
				b[i] = a[i];
			}
			a = b;
			System.out.println(M + "로 변경합니다.");
		} else if (alpha < 0.25) {
			if ((M / 2) < 5) {
				System.out.println("[check_and_rehash] 테이블의 사이즈를 변경하지 않습니다.");
			} else {
				System.out.print("[check_and_rehash] 테이블의 사이즈를" + M + "에서");
				M /= 2;
				Node[] b = new Node[M];
				for (int i = 0, j = M; i < M; i++, j++) {
					b[i] = a[j]; 
				}
				a = b;
				System.out.println(M + "로 변경합니다.");
			}
		} else if (alpha < 0.75 || alpha > 0.25)
			System.out.println("[check_and_rehash] 테이블의 사이즈를 변경하지 않습니다.");
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
