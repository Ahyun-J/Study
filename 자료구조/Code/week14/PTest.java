package week14;

import java.util.LinkedList;
import java.util.List;

public class PTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] weight = { 
				{  0,  9, 10,  0, 0, 0, 0},
				{  9,  0,  0, 10, 5, 0, 3},
				{ 10,  0,  0,  9, 7, 2, 0},
				{  0, 10,  9,  0, 0, 4, 8},
				{  0,  5,  7,  0, 0, 0, 1},
				{  0,  0,  2,  4, 0, 0, 6},
				{  0,  3,  0,  8, 1, 6, 0},
		};
		int N = weight.length;
		List<Edge>[] adjList = new List[N];	
		for(int i=0; i<N; i++) {	
			adjList[i] = new LinkedList<>();
			for(int j=0; j<N; j++) {
				if(weight[i][j] != 0 ) {
					Edge e = new Edge(i,j,weight[i][j]);
					adjList[i].add(e);
				}
			}
		}
		
		PrimMST p = new PrimMST(adjList);
		
		int[] s = p.mst(0);
		int sum = 0;
		
		System.out.println("최소신장트리 간선 : ");
		for(int i=1; i<s.length; i++)
			System.out.print("(" + i + "," + s[i] + ") ");
		System.out.println();
		
		for(int i=0; i<N; i++) 
			for(int j=0; j<N; j++)
				if(s[i] == j )
					sum += weight[i][j];
		
		System.out.print("\n최소신장트리의 간선 가중치 합 = " + sum);
	}
}
