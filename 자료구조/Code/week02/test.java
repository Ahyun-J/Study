package week02;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Book[] b = {
					new Book("�Ѹ����б�",1,2010,3,15),
					new Book("IT ���",2,2018,8,11),
					new Book("�ڹ� ���α׷���",3,2011,1,1),
					new Book("C ���α׷���",4,1999,12,18),
					new Book("�ΰ�����",5,2019,2,22),
					new Book("����н�",6,2015,9,30),
					new Book("�ΰ��� �̷�",7,2017,5,21),
					new Book("���� �׽�Ʈ",8,2017,5,18)
			};
		
			Arrays.sort(b);
			print(b, "å����");
			
			Arrays.sort(b, Book.WITH_NAME);
			print(b,"�̸�");
			
			Arrays.sort(b, Book.WITH_SERIAL);
			print(b, "���� ��ȣ");
			
			Arrays.sort(b, Book.WITH_DATE);
			print(b, "�Ⱓ��");
	}
	
	public static void print(Book[] b, String a) {
		int i=0;
		System.out.println();
		System.out.println("      "+a+"(��)�� ����");
		System.out.println("---------------------");
		for(Book temp :b) {
			System.out.printf(temp.getTitle()+ " "+temp.getSerial()+
					" \t"+ temp.getYyyy()+"."+temp.getMm()+"."+temp.getDd()+"\n");
		}
	}
}
