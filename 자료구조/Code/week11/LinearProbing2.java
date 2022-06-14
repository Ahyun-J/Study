package week11;

public class LinearProbing2<K, V> {
	private int M = 13;
	private K[] a = (K[]) new Object[M];
	private V[] d = (V[]) new Object[M];

	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}

	public void put(K key, V data) { // ���� ����
		int initialpos = hash(key); // �ʱ� ��ġ
		int i = initialpos, j = 1;
		do {
			if (a[i] == null) { // ���� ��ġ �߰�
				a[i] = key; // key�� �ؽ����̺� ����
				d[i] = data; // key���� �����͸� ������ �ε����ȿ� ����
				return;
			}
			if (a[i].equals(key)) {// �̹� key�� ����:
				d[i] = data; // �����͸� ����
				return;
			}
			i = (initialpos + j++) % M; // i = ���� ��ġ
		} while (i != initialpos); // ���� i�� �ʱ���ġ�� ���� �Ǹ� ���� ����
	}

	public V get(K key) { // Ž�� ����
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		do {
			if (a[i].equals(key))
				return d[i];
			i = (initialpos + j++) % M;
		} while (a[i] != null // a[i]�� null(=�������)�̸� stop(��ã��)
				&& i != initialpos); // ó�� ��ġ�� ���ƿԴٸ� stop(��ã��)
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
		System.out.println("�ؽ� ���̺�:");
		for (int i = 0; i < M; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();
		for (int i = 0; i < M; i++) {
			System.out.print("\t" + a[i]);
		}
	}

}
