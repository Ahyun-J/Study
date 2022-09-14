package week13;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class RandList <T> {
	List <T> list = new LinkedList <T> ();
	Random r = new Random();
	
	public void add(T it) {
		list.add(it);
	}
	
	public List <T> getlist(){
		return list;
	}
	
	public T select() {
		int index = r.nextInt(list.size());
		return list.get(index);
	}
}

public class TT {
	public static void main(String[] args) {
		
		RandList<String> rlist = new RandList<String>();
		String[] sample = { "I", "love", "the", "coffee." };
		for (int i = 0; i < sample.length; i++)
			rlist.add(sample[i]);
		
		System.out.println("==== 전체 데이터 ====");
		List<String> alldata = rlist.getlist();
		for (String s : alldata)
			System.out.println(s);
		
		System.out.println("==== 랜덤하게 선택된 데이터 ====");
		for (int i = 0; i < 5; i++)
			System.out.println(i + ")" + rlist.select());
	}
}
