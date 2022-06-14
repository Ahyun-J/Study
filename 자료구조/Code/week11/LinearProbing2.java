package week11;

public class LinearProbing2<K, V> {
	private int M = 13;
	private K[] a = (K[]) new Object[M];
	private V[] d = (V[]) new Object[M];

	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}

	public void put(K key, V data) { // 삽입 연산
		int initialpos = hash(key); // 초기 위치
		int i = initialpos, j = 1;
		do {
			if (a[i] == null) { // 삽입 위치 발견
				a[i] = key; // key를 해시테이블에 저장
				d[i] = data; // key관련 데이터를 동일한 인덱스안에 저장
				return;
			}
			if (a[i].equals(key)) {// 이미 key에 존재:
				d[i] = data; // 데이터만 갱신
				return;
			}
			i = (initialpos + j++) % M; // i = 다음 위치
		} while (i != initialpos); // 현재 i가 초기위치와 같게 되면 루프 종료
	}

	public V get(K key) { // 탐색 연산
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		do {
			if (a[i].equals(key))
				return d[i];
			i = (initialpos + j++) % M;
		} while (a[i] != null // a[i]가 null(=비어있음)이면 stop(못찾음)
				&& i != initialpos); // 처음 위치로 돌아왔다면 stop(못찾음)
		return null;
	}

//	private V del = -0;

	public V delete(K key) {
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		V del = null;
		do {
			if (a[i].equals(key)) {
				del = d[i];
				a[i] = (K) "null";
				return del;
			}
			i = (initialpos + j++) % M;
		} while (a[i] != null 
				&& i != initialpos); 
		return null;
	}

	public void print() {
		System.out.println("해시 테이블:");
		for (int i = 0; i < M; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();
		for (int i = 0; i < M; i++) {
			System.out.print("\t" + a[i]);
		}
	}

}
