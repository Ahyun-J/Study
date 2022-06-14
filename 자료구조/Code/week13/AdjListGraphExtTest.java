package week13;

public class AdjListGraphExtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AdjListGraphExt 클래스 생성자 호출 => print() 메소드 호출 
		//=>  getReverse() 메소드 호출 => printGraph 메소드 호출. 
		
		AdjListGraphExt adje = new AdjListGraphExt();
		
		adje.AdListGraph();
		adje.printGraph();
		adje.getReverse();
		adje.printGraphReverse();
	}
}
