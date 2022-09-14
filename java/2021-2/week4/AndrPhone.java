package week4;

public class AndrPhone extends Phone {
	
	public AndrPhone() {
		super();
		
	}

	public AndrPhone(String w) {
		super(w);
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println(super.getWho()+"영상통화를 합니다.");
		
	}

}
