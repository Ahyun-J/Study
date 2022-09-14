package week12;

public class Work {
	
	private int num = 0;
	
	public synchronized int getNum() {
		num += 1;
		return num;
	}

	public void threadWork() {
		while(true) {
			System.out.println( Thread.currentThread().getName() + ", " +getNum());
				if(num < 10) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					continue;
				}
				else if(num >= 10) {
					System.out.println(Thread.currentThread().getName() + ", 반복문 탈출");
					break;
				}
		}
	}
}

//	- 메소드 getNum()
//	 : 한 순간에 하나의 스레드만 접근할 수 있는 메소드
//	 : num값을 1증가 시킨 후 증가된 num 값을 리턴.
//	 - 메소드 threadWork()
//	 : 무한 반복을 이용하여 현재 threadWork() 메소드를 사용하고 있는 스레드의 이
//	름과 getNum()에서 리턴 받은 값 num 값을 출력.
//	 : getNum()에서 리턴 받은 값이 10 이상이면 스레드의 이름과 “반복문 탈출“ 메시
//	지 출력 후 반복 탈출
//	 : getNum()에서 리턴 받은 값이 10 미만이면 0.5초 sleep 후 반복의 처음으로 이
//	동.
	
