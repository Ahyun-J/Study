package week14;

import java.util.List;

public class CGTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] adjmat1 = {
				{ 0, 0, 0, 0, 0},
				{ 0, 0, 2, 3, 0},
				{ 0, 7, 0, 0, 4},
				{ 0, 6, 0, 0, 9},
				{ 0, 0, 1, 3, 0}
		};
		List<Edge>[] adjlist1 = MyGraph.getAdjListFromAdjMatrix(adjmat1);
		
		int[][] adjmat2 = {
				{ 0, 0, 0, 0, 0},
				{ 0, 0, 2, 3, 0},
				{ 0, 7, 0, 0, 4},
				{ 0, 6, 0, 0, 9},
				{ 0, 0, 0, 3, 0}
		};
		List<Edge>[] adjlist2 = MyGraph.getAdjListFromAdjMatrix(adjmat2);
		
		int[][] adjmat3 = {
				{ 0, 0, 0, 0, 0},
				{ 0, 0, 1, 4, 0},
				{ 0, 1, 0, 0, 2},
				{ 0, 4, 0, 0, 3},
				{ 0, 0, 2, 3, 0}
		};
		List<Edge>[] adjlist3 = MyGraph.getAdjListFromAdjMatrix(adjmat3);
		
		int[][] adjmat4 = {
				{ 0, 0, 0, 0, 0},
				{ 0, 0, 1, 4, 0},
				{ 0, 1, 0, 0, 2},
				{ 0, 4, 0, 0, 3},
				{ 0, 0, 2, 3, 0}
		};
		
		List<Edge>[] adjlist4 = MyGraph.getAdjListFromAdjMatrix(adjmat4);
		
		System.out.println("adjmat1 결과 : " + CheckGraph.isReverseSame(adjmat1));
		System.out.println("adjlist1 결과 : " + CheckGraph.isReverseSame(adjlist1));
		System.out.println();
		
		System.out.println("adjmat2 결과 : " + CheckGraph.isReverseSame(adjmat2));
		System.out.println("adjlist2 결과 : " + CheckGraph.isReverseSame(adjlist2));
		System.out.println();
	
		System.out.println("adjmat3 결과 : " + CheckGraph.isReverseSame(adjmat3));
		System.out.println("adjlist3 결과 : " + CheckGraph.isReverseSame(adjlist3));
		System.out.println();
	
		System.out.println("adjmat4 결과 : " + CheckGraph.isReverseSame(adjmat4));
		System.out.println("adjlist4 결과 : " + CheckGraph.isReverseSame(adjlist4));
	
	}
}
