package week14;

import java.util.Scanner;
import java.io.*;

class ClassA implements Serializable {
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
}

class ClassB implements Serializable {
	int field1;
}

public class Test {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("objectAB.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA classA = new ClassA();
		
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3;
		classA.field4 = 4;
		
		oos.writeObject(classA);
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("objectAB.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA) ois.readObject();
		
		System.out.println("field1: " + v.field1);
		System.out.println("field2.field1: " + v.field2.field1);
		System.out.println("field3: " + v.field3);
		System.out.println("field4: " + v.field4);
	}
}

//public class Test {
//	public static void main(String[] args) throws IOException {	
//		double d ;
//	
//		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("out.bin")));
//	
//	d = in.readDouble();
//	System.out.println(d);
//	
//	if (in != null) {in.close();}
//	
//	}
//}

//	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		DataOutputStream out = new DataOutputStream(
//				new BufferedOutputStream(new FileOutputStream("out.bin")));
//	
//	System.out.print("실수를 입력하세요: ");
//	double n = s.nextDouble();
//	
//	System.out.println("input value = "+n);
//	out.writeDouble(n);
//	
//	if (out != null) {out.close();}
//	}
//}

//	public static void main(String[] args) throws IOException {
//		FileOutputStream out = null;
//		FileInputStream in = null;
//		try {
//			out = new FileOutputStream("out_b.txt");
//			in = new FileInputStream("out_a.txt");
//			
//			int c;
//			while ((c = in.read()) != -1) {
//				System.out.print((char)c + "를 읽어서");
//				out.write(c);
//				System.out.println("out_b.txt에 썼습니다.");
//				}
//		}finally {
//			if (out != null) {out.close();}
//			if (in != null) {in.close();}
//			System.out.println("작업이 끝났으니 파일을 열어 확인해 보세요.");
//		}
//		
//	}
//}
//	public static void main(String[] args) throws IOException {
//		FileInputStream in = null;
//		try {
//			int c;
//			in = new FileInputStream("out_a.txt");
//			while ((c = in.read()) != -1) {
//				System.out.print((char) c + " ");
//			}
//		} finally {
//			if (in != null) {
//				in.close();
//			}
//			System.out.println(": out_a.txt 파일의 모든 내용을 읽었습니다.");
//		}
//	}
//}

// public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		FileOutputStream out = null;
//		try {
//			out = new FileOutputStream("out_a.txt", false);
//
//			do {
//				System.out.print("문자를 입력하세요 : ");
//				String str = s.next();
//				int inchar = str.charAt(0);
//
//				if (Character.toLowerCase(inchar) == 'q')
//					break;
//				out.write(inchar);
//			} while (true);
//		} finally {
//			if (out != null) {
//				out.close();
//				System.out.println(": out_a.txt에 모든 내용을 쓰고 종료합니다.");
//			}
//		}
//	}
//}