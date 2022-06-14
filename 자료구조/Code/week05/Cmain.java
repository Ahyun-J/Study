package week05;

public class Cmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CList<String> s = new CList<String>();
		
//		s.insert("pear"); s.insert("cherry");
//		s.insert("orange"); s.insert("apple");
//		s.print();
//		System.out.println(": s의 길이 = "+s.size()+"\n");
//		
//		s.delete();
//		s.print();
//		System.out.println(": s의 길이 = "+s.size());
//		System.out.println();
		
		CList<Integer> cl1 = new CList<Integer>();
		CList<Integer> cl2 = new CList<Integer>();
		int [] arr = {4,3,2,1};
		
		for(int i =0; i<arr.length;i++) {
			cl1.insert(arr[i]);
			cl2.insert(arr[i]);
			}
		
		System.out.print("[CList cl1 리스트] \t");
		cl1.print(); System.out.println();
		cl1.rotateLeft(1); 
		System.out.print("[cl1.rotateLeft(1) 결과] \t");
		cl1.print(); System.out.println();
		
		System.out.print("[CList cl2 리스트]\t");
		cl2.print(); System.out.println();
		cl2.rotateRight(1);
		System.out.print("[cl2.rotateRight(1) 결과]\t");
		cl2.print(); System.out.println();
	}

}
