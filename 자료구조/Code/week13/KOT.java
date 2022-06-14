package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class KOT {
	public static List<List<Integer>> scc(List<Integer>[] graph) {
	    int n = graph.length;
	    boolean[] used = new boolean[n];
	    List<Integer> order = new ArrayList<>();
	    for (int i = 0; i < n; i++)
	      if (!used[i])
	        dfs(graph, used, order, i);

	    List<Integer>[] reverseGraph = new List[n];
	    for (int i = 0; i < n; i++)
	      reverseGraph[i] = new ArrayList<>();
	    for (int i = 0; i < n; i++)
	      for (int j : graph[i])
	        reverseGraph[j].add(i);

	    List<List<Integer>> components = new ArrayList<>();
	    Arrays.fill(used, false);
	    Collections.reverse(order);

	    for (int u : order)
	      if (!used[u]) {
	        List<Integer> component = new ArrayList<>();
	        dfs(reverseGraph, used, component, u);
	        components.add(component);
	      }

	    return components;
	  }

	  static void dfs(List<Integer>[] graph, boolean[] used, List<Integer> res, int u) {
	    used[u] = true;
	    for (int v : graph[u])
	      if (!used[v])
	        dfs(graph, used, res, v);
	    res.add(u);
	  }

	  public static void main(String[] args) {
		  
	    List<Integer>[] adjList = new List[10];
		for(int i=0; i<10; i++) {
			adjList[i] = new LinkedList<>();
		}
		adjList[0].add(1);
		adjList[0].add(3);
		adjList[1].add(7);
		adjList[2].add(8);
		adjList[3].add(5);
		adjList[3].add(6);
		adjList[4].add(1);
		adjList[5].add(4);
		adjList[5].add(1);
		adjList[6].add(0);
		adjList[7].add(4);
		adjList[8].add(6);
		adjList[8].add(7);
		adjList[8].add(9);
		adjList[9].add(2);
		
	    List<List<Integer>> components = scc(adjList);
	    System.out.println(components);
	  }
	}