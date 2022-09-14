package week12;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("20215247_조아현\n");

		Work w = new Work();
		
		Job tha = new Job(w); //w 공유할 객체 보냄
		tha.setName("ThreadA");
		tha.start(); // 스레드 시작
		
		Job thb = new Job(w);
		thb.setName("ThreadB");
		thb.start(); // 스레드 시작
		
	}

}
