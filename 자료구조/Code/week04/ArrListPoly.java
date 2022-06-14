package week04;

public class ArrListPoly extends ArrList {

	int kk;

	public void setPoly(int k, int[] arr) {
		for (int i = 0; i <= k; i++) {
			insertLast(arr[i]);

		}
		this.kk = k;
	}

	public int getHighetDegree() {
		// TODO Auto-generated method stub
		return this.kk;
	}
	
	public ArrListPoly sumPoly(ArrListPoly p2) {

		ArrListPoly p = new ArrListPoly();
		
		int s1 = this.size();
		int s2 = p2.size();

		int fsize = Math.max(s1,s2);
		
		int [] arr = new int[fsize];
		
		if(s1>s2) {
			int n = s1-s2;
			for(int i =s1-1 ;i>n ;i--) {
				arr[i] = (int) this.peek(i);
			}
			for (int i = n; i >= 0; i--) {
				arr[i] = (int) this.peek(i) + (int)p2.peek(i);
			}
			
		}
		else if(s1<s2) {
			int n = s2-s1;
			for(int i =s2-1 ;i>n ;i--) {
				arr[i] = (int) p2.peek(i);
			}
			for (int i = n; i >= 0; i--) {
				arr[i] = (int) this.peek(i) + (int)p2.peek(i);
			}
		}
		else {
			for(int i =0; i<fsize; i++) {
			arr[i] = (int) this.peek(i) + (int)p2.peek(i);
			}
		}
		
		p.setPoly(arr.length-1, arr);
		return p;
	}
}
		
	
//	int[] arr;
//	public ArrListPoly sumPoly(ArrListPoly p) {
//
//		int i;
//		ArrListPoly n = new ArrListPoly();
//		
//		
//		if (this.kk <= p.kk) {
//			for (i = 0; i < this.kk; i++) {
//				int a = this.kk - 1 - i;
//				int b = p.kk - 1 - i;
//				int item = (int)peek(a) + (int)p.peek(b);
//				arr[i] = item;
//				
//			}
//
//			int j = p.kk - i;
//			for (i = 0; i < j; i++) {
//				insert(p.peek(i), i);
//			}
//		}
//		else {
//			for (i = 0; i < p.kk; i++) {
//				int a = this.kk - 1 - i;
//				int b = p.kk - 1 - i;
//				int item = (int)peek(a) + (int)p.peek(b);
//				arr[i] = item;
//			}
//		}
		
//		for(i = 0; i <= arr.length;i++)
//			insert(arr[i]);
//		return n;
//	}
//	public ArrListPoly sumPoly(ArrListPoly p) {
//		ArrListPoly n = new ArrListPoly();
//	    n.arr = new int[p.arr.length];
//	    for (int i = p.arr.length - 3; i >= 0; i--)
//	        n.arr[i] = p.arr[i] + p.arr[i];
//		
//		return n;
//	}

//}
