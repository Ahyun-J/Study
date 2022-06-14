package week14;

public class Edge {
	int vertex; //������ ���� �� ����
	int adjvertex; //������ �ٸ��� �� ����
	int weight; // ������ ����ġ
	
	public Edge(int v, int wt) { //Prim
		adjvertex = v;
		weight = wt;
	}
	
	public Edge(int u, int v, int wt) { //Dijkstra
		vertex = u;
		adjvertex = v;
		weight = wt;
	}
}
