package week04;

public class ArrListPolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrListPoly p1 = new ArrListPoly();
		
		int[] poly1 = {9,0,-3,0,5};
		int p1highestDegree = poly1.length-1;
		p1.setPoly(p1highestDegree, poly1);
		printPolyEq(p1,1);
		
		ArrListPoly p2 = new ArrListPoly();
		
		int[] poly2 = {2,0,4};
		int p2highestDegree = poly2.length-1;
		p2.setPoly(p2highestDegree, poly2);
		printPolyEq(p2,3);
		
		ArrListPoly p3 = p1.sumPoly(p2);
		printPolyEq(p3,1);
		
		ArrListPoly p4 = p2.sumPoly(p1);
		printPolyEq(p4,1);
	}

	private static void printPolyEq(ArrListPoly p, int nTabs) {
		for(int i =0; i< nTabs; i++)
			System.out.printf("\t");
		for(int i = p.getHighetDegree(); i>=0; i--)
			System.out.printf("%+d x%d\t", p.peek(i),i);
		System.out.println();
	}

}
