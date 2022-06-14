package week14;

import java.util.LinkedList;
import java.util.List;

public class MyGraph {
	//��������Ʈ�� ǥ���� �׷����� ������ķ� ��ȯ�Ͽ� ����
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
	
	//������ķ� ǥ���� �׷����� ��������Ʈ�� ǥ���� �׷����� ��ȯ�Ͽ� ����
	public static List<Edge>[] getAdjListFromAdjMatrix(int[][] mat){
		int N = mat.length;
		List<Edge>[] adjList = new List[N];	
		for(int i=0; i<N; i++) {	// ��������Ʈ �����
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
	
	//��������� �͹̳ο� ���
	public static void print(int[][] mat) {
		System.out.println("AdjMatrix : ");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length-1; j++) 
				System.out.print(mat[i][j] + ", ");
			System.out.print(mat[i][mat.length-1]);
			System.out.println();
		}	
	}
	
	//��������Ʈ�� �͹̳ο� ���
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
