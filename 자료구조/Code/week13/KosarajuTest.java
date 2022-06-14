package week13;

public class KosarajuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kosaraju k = new Kosaraju();
		
		k.Kosaraju();
		
		//k.dfs(3);
		//k.print();
		k.getReverse();
		//k.print();
		k.tsort();
		k.print();
		for(int i = 0; i <k.N ; i++) {
			k.Sdfs(0); 
		}
		
		
		
//		
//		for (int j = 1; j < k.N; j++) { // 모든 정점에 대하여
//            if (k.visited[j] == false) { // 방문한 노드를 제외하고
//                k.dfs(j); // 순방향 그래프에 대한 dfs 실행
//            }
//            System.out.print(k.s[j-1] + " ");
//        }
//		for(int i = 0; i <k.s.size() ; i++) {
//			System.out.println(k.graph);
//		}
		
		
	}

}
