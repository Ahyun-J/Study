package week14;

import java.util.LinkedList;
import java.util.List;

public class MyGraph {
	//인접리스트로 표현된 그래프를 인접행렬로 변환하여 리턴
	public static int[][] getAdjMatrixFromAdjList(List<Edge>[] lst){
		int N = lst.length;
		int[][] matrix = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				matrix[i][j] = 0;
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<lst[i].size(); j++) {
				matrix[i][lst[i].get(j).adjvertex] = lst[i].get(j).weight;
			}
		}
		return matrix;
	}
	
	//인접행렬로 표현된 그래프를 인접리스트로 표현된 그래프로 변환하여 리턴
	public static List<Edge>[] getAdjListFromAdjMatrix(int[][] mat){
		int N = mat.length;
		List<Edge>[] adjList = new List[N];	
		for(int i=0; i<N; i++) {	// 인접리스트 만들기
			adjList[i] = new LinkedList<>();
			for(int j=0; j<N; j++) {
				if(mat[i][j] != 0 ) {
					Edge e = new Edge(i, j, mat[i][j]);
					adjList[i].add(e);
				}
			}
		}
		return adjList;
		
	}
	
	//인접행렬을 터미널에 출력
	public static void print(int[][] mat) {
		System.out.println("AdjMatrix : ");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length-1; j++) 
				System.out.print(mat[i][j] + ", ");
			System.out.print(mat[i][mat.length-1]);
			System.out.println();
		}	
	}
	
	//인접리스트를 터미널에 출력
	public static void print(List<Edge>[] lst) {
		System.out.println("AdjList : ");
		for(int i=0; i<lst.length; i++) {
			System.out.print("[" + i + "]");
			for(int j=0; j<lst[i].size(); j++)
				System.out.print(" => " + lst[i].get(j).adjvertex + "(" + lst[i].get(j).weight + ") ");
			System.out.println();
		}	
	}
}
