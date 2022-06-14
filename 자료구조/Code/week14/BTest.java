package week14;

public class BTest {
	public static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] weight = {
				{INF,   1, INF,   2, INF, INF, INF, INF},
				{INF, INF,   4,  -2,   1,   6, INF, INF},	
				{INF, INF, INF, INF, INF, INF, INF,   2},	
				{INF, INF, INF, INF,  -1, INF, INF, INF},	
				{INF, INF, INF, INF, INF, INF,   4, INF},	
				{INF, INF,   1, INF, INF, INF, INF, INF},	
				{INF, INF,  -1, INF, INF, INF, INF,   1},	
				{INF, INF, INF, INF, INF,   3, INF, INF}
		};
		int N = weight.length;
		
		int s = 0; //√‚πﬂ¡°
		BellmanFord bf = new BellmanFord(N);
		bf.shortestPath(s, weight);
		bf.printPaths(s);
	}
}
