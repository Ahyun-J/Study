package week4;

public class ApplePhone extends Phone {
	
	public ApplePhone() {
		super();
	}
	
	public ApplePhone(String w) {
		super(w);
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println(super.getWho()+"영상통화를 하며 통화내용을 녹음합니다.");
		
	}

}
