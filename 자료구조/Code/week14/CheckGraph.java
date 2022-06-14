package week14;

import java.util.List;

public class CheckGraph {
	// G�� GR�� �����ϸ� true, �׷��� ������ false�� ����. ���ڴ� G�� �־���
	//(�޼ҵ� ������ GR �� ����ϰ� G�� ���Ͽ� ����� �����ϴ� �ڵ带 �ۼ��ϱ�)
	public static boolean isReverseSame(int[][] G) {
		int[][] G2 = new int[G.length][G.length];
		
		for(int i=0; i < G.length; i++) {
			for(int j=0; j < G.length; j++) {
				G2[i][j] = G[j][i];
			}
		}
		
		int t = 0;
		for(int i=0; i < G.length; i++) {
			for(int j=0; j < G.length; j++) {
				if(G2[i][j] != G[i][j])
					t += 1;
			}
		}

		if(t == 0) return true;
		return false;
		
	}
	
	// G�� GR�� �����ϸ� true, �׷��� ������ false�� ����. ���ڴ� G�� �־���
	//(�޼ҵ� ������ GR �� ����ϰ� G�� ���Ͽ� ����� �����ϴ� �ڵ带 �ۼ��ϱ�)
	public static boolean isReverseSame(List<Edge>[] G) {
		int[][] G2 = MyGraph.getAdjMatrixFromAdjList(G);
		if(isReverseSame(G2)) return true;
		return false;
		/*	List<Edge>[] G2 = new List[G.length];
		for(int i=0; i<G.length; i++) {
			G2[i] = new LinkedList<>();
		}
		for(int i=0; i<G.length; i++) {
			for(Edge j : G[i]) {
					int v = j.adjvertex;
					int u = j.weight;
					Edge tmp = new Edge(i,u);
					G2[v].add(tmp);
			}
		}
		for(int i=0; i<G.length; i++) {
			if(G2[i].size() == G[i].size()) {
				for(int j=0; j<G[i].size(); j++) {
					if(G2[i].get(j).adjvertex == G[i].get(j).adjvertex) {
						if(G2[i].get(j).weight == G[i].get(j).weight)
							return true;
					}
				}
			}
		}*/
	}
}
