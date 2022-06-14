package week11;

public class DoubleHashing <K, V> {
	private int M = 13;
	private int N = 0;
	private K[] a = (K[]) new Object[M];
	private V[] dt = (V[]) new Object[M];
	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}
	
	public void put(K key, V data) { 	// ���� ����
		int initialpos = hash(key); 	// �ʱ� ��ġ
		int i = initialpos;
		int j = 1;
		int d = (7-(int)key % 7);
		do {
			if(a[i] == null) { 	// ���� ��ġ �߰�
				a[i] = key;		// key�� �ؽ����̺� ����
				dt[i] = data;N++;// key���� �����͸� ������ �ε����ȿ� ����
				return;
			}
			if(a[i].equals(key)){// �̹� key�� ����:
				dt[i] = data;	 // �����͸� ����
				return;
			}
			i = (initialpos + j*d) % M; // i = ���� ��ġ
			j++;
		}while(N < M); 		// ���� i�� �ʱ���ġ�� ���� �Ǹ� ���� ����
	}
	
	public V get (K key) {	// Ž�� ����
		int initialpos = hash(key); 
		int i = initialpos;
		int j = 1;
		int d = (7-(int)key % 7);
		while(a[i] != null) { //a[i]�� null(=�������)�ƴϸ�
			if(a[i].equals(key)) return dt[i];	 
			i = (initialpos + j*d) % M;
			j++;
		}
		return null; // Ž�� ����
	}
	
	public void print() {
		System.out.println("�ؽ� ���̺�:");
		for(int i = 0; i < M; i++) {
			System.out.print("\t"+i);
		}
		System.out.println();
		for(int i = 0; i < M; i++) {
			System.out.print("\t"+a[i]);
		}
	}
	
}
