package week02;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Book[] b = {
					new Book("한림대학교",1,2010,3,15),
					new Book("IT 기술",2,2018,8,11),
					new Book("자바 프로그래밍",3,2011,1,1),
					new Book("C 프로그래밍",4,1999,12,18),
					new Book("인공지능",5,2019,2,22),
					new Book("기계학습",6,2015,9,30),
					new Book("인간의 미래",7,2017,5,21),
					new Book("응애 테스트",8,2017,5,18)
			};
		
			Arrays.sort(b);
			print(b, "책제목");
			
			Arrays.sort(b, Book.WITH_NAME);
			print(b,"이름");
			
			Arrays.sort(b, Book.WITH_SERIAL);
			print(b, "고유 번호");
			
			Arrays.sort(b, Book.WITH_DATE);
			print(b, "출간일");
	}
	
	public static void print(Book[] b, String a) {
		int i=0;
		System.out.println();
		System.out.println("      "+a+"(으)로 정렬");
		System.out.println("---------------------");
		for(Book temp :b) {
			System.out.printf(temp.getTitle()+ " "+temp.getSerial()+
					" \t"+ temp.getYyyy()+"."+temp.getMm()+"."+temp.getDd()+"\n");
		}
	}
}
