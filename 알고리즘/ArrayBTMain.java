class ArrayBT {

	int  count=0;
	int nodecnt = 0;
	
	public void inorder(char[] T, int i) {
		//Left + Process +Right subtree
		if(T[i]!='\0') { //i번째 방에 원소존재
			inorder(T, i*2); //left subtree
			System.out.print(" "+T[i]);
			inorder(T, i*2+1); //right subtree
		}
	}
	
	public void preorder(char[] T, int i) {
		//Process + Left + Right subtree
		if(T[i]!='\0') { //i번째 방에 원소존재
			System.out.print(" "+T[i]);
			preorder(T, i*2); //left subtree
			preorder(T, i*2+1); //right subtree
		}
	}
	
	public void postorder(char[] T, int i) {
		//Left + Right subtree + Process
		if(T[i]!='\0') { //i번째 방에 원소존재
			postorder(T, i*2); //left subtree
			postorder(T, i*2+1); //right subtree
			System.out.print(" "+T[i]);
		}
	}
	
	public int nodeCount(char[] T, int i) {
		if(T[i]!='\0') { //i번째 방에 원소존재
			nodecnt++;
			nodeCount(T, i*2); //left subtree
			nodeCount(T, i*2+1); //right subtree
		}
		return nodecnt;
	}
	
	//후손
	public void descendents(char[] T, int i) {
		if(T[i]!='\0') {
			if (T[i*2]!='\0'){
				System.out.print(" "+T[i*2]);
			}if (T[i*2+1]!='\0'){
				System.out.print(" "+T[i*2+1]);
			}
			descendents(T, i*2);
			descendents(T, i*2+1);
		}
	}
	
	//조상
	public void ancestors(char[] T, int i) {
		if(i==1) { //root
			return;
		}else {
			i = i/2;
			System.out.print(" " + T[i]);
			ancestors(T, i);
		}
	}
	
	public void leafCount(char T[], int i) {
		if(T[i]!='\0') {
			if ((T[i*2]=='\0')&&(T[i*2+1]=='\0')){
				System.out.println(" "+T[i]);
				count++;
			}
			leafCount(T,i*2);
			leafCount(T,i*2+1);
		}
    }
}
public class ArrayBTMain{
	public static void main(String[] args) {
		
		ArrayBT tree1 = new ArrayBT();
		char T[]= new char[25];
		T[1]='a';
		T[2]='b';
		T[3]='c';
		T[4]='d';
		T[5]='e';
		T[6]='f';
		T[7]='g';
		T[8]='h';
		T[9]='i';
		T[10]='j';
		//T[11]='\0'; //5번방에 오른쪽자식이 없음
		
		System.out.println("inorder");
		tree1.inorder(T, 1);
		System.out.println();
		System.out.println("end of inorder");
		System.out.println();
		
		System.out.println("preorder");
		tree1.preorder(T, 1);
		System.out.println();
		System.out.println("end of preorder");
		System.out.println();
		
		System.out.println("postorder");
		tree1.postorder(T, 1);
		System.out.println();
		System.out.println("end of postorder");
		System.out.println();
		
		System.out.println("Ancestors");
		tree1.ancestors(T, 5);
		System.out.println(); System.out.println();
		
		System.out.println("Descendents");
		tree1.descendents(T, 2);
		System.out.println(); System.out.println();
		
		System.out.println("number of nodeCount = " + tree1.nodeCount(T,1) + "\n");
		
		tree1.leafCount(T,1);
		System.out.println("number of leaves = "+tree1.count);
	}	
}
