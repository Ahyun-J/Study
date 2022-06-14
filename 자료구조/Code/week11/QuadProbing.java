package week11;

public class QuadProbing <K, V> {
	private int M = 13;
	private int N = 0; //�׸� �� 
	private K[] a = (K[]) new Object[M];
	private V[] d = (V[]) new Object[M];
	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}
	
	public void put(K key, V data) { 	// ���� ����
		int initialpos = hash(key); 	// �ʱ� ��ġ
		int i = initialpos, j = 1;
		do {
			if(a[i] == null) { 	// ���� ��ġ �߰�
				a[i] = key;		// key�� �ؽ����̺� ����
				d[i] = data; N++; // key���� �����͸� ������ �ε����ȿ� ����
				return;
			}
			if(a[i].equals(key)){// �̹� key�� ����:
				d[i] = data;	 // �����͸� ����
				return;
			}
			i = (initialpos + j * j++) % M; // i = ���� ��ġ
		}while(N < M); 		
	}
	
	public V get (K key) {	// Ž�� ����
		int initialpos = hash(key); 
		int i = initialpos, j = 1;
		while(a[i] != null) { //a[i]�� null(=�������)�ƴϸ�
			if(a[i].equals(key)) return d[i];	 
			i = (initialpos + j * j++) % M;
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
