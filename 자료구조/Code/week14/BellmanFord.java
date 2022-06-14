package week14;

public class BellmanFord {
	public static final int INF = Integer.MAX_VALUE;
	private int D[];
	private int previous[];
	private int N;
	private int matrix[][];
	
	public BellmanFord(int numOfVertices) {
		N = numOfVertices;
		D = new int[N];
		previous = new int[N];
	}
	
	public int[] shortestPath (int s, int adjMatrix[][]) {
		this.matrix = adjMatrix;
		for(int i = 0; i< N; i++)
			D[i] = INF;
		previous[s] = 0;
		D[s] = 0;
		for(int k = 0;k<N; k++){
			for(int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (adjMatrix[i][j] != INF) {
						if(D[j] > D[i] + adjMatrix[i][j]) {
							D[j] = D[i] + adjMatrix[i][j];
							previous[j] = i;
						}
					}
				}
			}
		}
		return D;
	}
	
	public void printPaths(int s) {
		System.out.println("���� 0���� ������ �ִܰŸ�");
		int[] distance = this.shortestPath(s,this.matrix);
		
		for(int i = 0; i <distance.length; i++) {
			if(distance[i] == Integer.MAX_VALUE)
				System.out.println("0�� "+i+" ���̿� ��� ����." );
			else
				System.out.print("[0, "+ i+"] = ");
				System.out.printf("%3d\n",distance[i]);
		}
		System.out.printf("\n���� 0���� ������ �ִ� ���\n");
		for(int i = 1; i < this.N; i++) {
			int back = i;
			System.out.print(back);
			while(back != 0) {
				System.out.print("<-"+this.previous[back]);
				back = this.previous[back];
			}
			System.out.println();
		}
	}
}
