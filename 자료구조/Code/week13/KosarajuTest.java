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
//		for (int j = 1; j < k.N; j++) { // ��� ������ ���Ͽ�
//            if (k.visited[j] == false) { // �湮�� ��带 �����ϰ�
//                k.dfs(j); // ������ �׷����� ���� dfs ����
//            }
//            System.out.print(k.s[j-1] + " ");
//        }
//		for(int i = 0; i <k.s.size() ; i++) {
//			System.out.println(k.graph);
//		}
		
		
	}

}
