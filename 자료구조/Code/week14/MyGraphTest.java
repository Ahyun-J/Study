package week14;

import java.util.LinkedList;
import java.util.List;

public class MyGraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge e1 = new Edge(0,1);
		Edge e2 = new Edge(0,2);
		Edge e3 = new Edge(1,1);
		Edge e4 = new Edge(1,3);
		Edge e5 = new Edge(1,6);
		Edge e6 = new Edge(1,4);
		Edge e7 = new Edge(2,6);
		Edge e8 = new Edge(2,4);
		Edge e9 = new Edge(2,1);
		Edge e10 = new Edge(2,2);
		Edge e11 = new Edge(3,2);
		Edge e12 = new Edge(3,3);
		Edge e13 = new Edge(3,5);
		Edge e14 = new Edge(4,1);
		Edge e15 = new Edge(4,2);
		Edge e16 = new Edge(4,5);
		Edge e17 = new Edge(5,1);
		Edge e18 = new Edge(5,6);
		Edge e19 = new Edge(5,9);
		Edge e20 = new Edge(6,1);
		Edge e21 = new Edge(6,2);
		Edge e22 = new Edge(7,1);
		Edge e23 = new Edge(7,2);
		Edge e24 = new Edge(7,9);
		
		List<Edge>[] lt = new List[8];
		for(int i=0; i<lt.length; i++) {
			lt[i] = new LinkedList<>();
		}
		lt[0].add(e3);
		lt[0].add(e11);
		lt[1].add(e1);
		lt[1].add(e12);
		lt[1].add(e14);
		lt[1].add(e8);
		lt[1].add(e18);
		lt[2].add(e6);
		lt[2].add(e17);
		lt[2].add(e23);
		lt[2].add(e20);
		lt[3].add(e2);
		lt[3].add(e4);
		lt[3].add(e16);
		lt[4].add(e3);
		lt[4].add(e13);
		lt[4].add(e21);
		lt[5].add(e5);
		lt[5].add(e9);
		lt[5].add(e24);
		lt[6].add(e9);
		lt[6].add(e15);
		lt[6].add(e22);
		lt[7].add(e20);
		lt[7].add(e10);
		lt[7].add(e19);
		
		int[][] ltTomat = MyGraph.getAdjMatrixFromAdjList(lt);
		MyGraph.print(ltTomat);

		int[][] mat = {
				{ 0, 1, 0, 2, 0, 0, 0, 0},
				{ 1, 0, 4, 3, 1, 6, 0, 0},
				{ 0, 4, 0, 0, 0, 1, 1, 2},
				{ 2, 3, 0, 0, 5, 0, 0, 0},
				{ 0, 1, 0, 5, 0, 0, 2, 0},
				{ 0, 6, 1, 0, 0, 0, 0, 9},
				{ 0, 0, 1, 0, 2, 0, 0, 1},
				{ 0, 0, 2, 0, 0, 9, 1, 0}
		};
		
		List<Edge>[] matTolt = MyGraph.getAdjListFromAdjMatrix(mat);
		MyGraph.print(matTolt);
	}

}
