package week12;

public class Job extends Thread{
	
	private Work w;
	
	public Job(Work a) {
		w = a;
	}
	
	public void run() {
		w.threadWork();
		System.out.println( getName() + ", 종료");
	}
}


//- 필드 : private Work w //Work 클래스 타입의 객체.
//- 생성자 : Work 타입의 객체를 전달 받아 w객체 필드에 저장.
//- 스레드 메소드 run()
//: w객체의 threadWork() 호출,
//: 현재 run() 메소드를 호출하고 있는 스레드의 이름과 “종료“ 
//메시지 출력.