package week12;

//
public class T {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		producerThread.start();
		consumerThread.start();
	}
}

class DataBox {
	private String data;

	public synchronized String getData() {
		// 이 메소드는 동기화 되어 있다.
//this.data가 null이면 다른 스레드가 알려줄 때 까지 기다린다.
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 "
				+ "데이터: " + returnValue);
		
//this.data를 null로 만들고 다른 스레드에게 알려준다. 
		this.data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		// 이 메소드는 동기화 되어 있다.
//this.data가 null이 아니면 다른 스레드가 알려줄 때 까지 
		// 기다린다.
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("ProducerThread가 생성한 "
				+ "데이터: " + data);
//this.data에 전달되어 온 데이터를 저장하고 다른 스레드에게 
//알려준다. 
		this.data = data;
		notify();

	}
}
//

class ProducerThread extends Thread {
	private DataBox dataBox;

	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
	}
}

//
class ConsumerThread extends Thread {
	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = dataBox.getData();
		}
	}
}

//7
//public class T {
//	public static void main(String[] args) {
//		ThreadA threadA = new ThreadA();
//		ThreadB threadB = new ThreadB();
//		threadA.start();
//		threadB.start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//		}
//		threadA.work = false;
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//		}
//		threadA.work = true;
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//		}
//		threadA.stop = true;
//		threadB.stop = true;
//	}
//}
//
//public class ThreadA extends Thread {
//	public boolean stop = false;
//	public boolean work = true;
//	
//	public void run() {
//		while(!stop) {
////work필드가 true이면 “ThreadA 작업” 출력, 
//			//false이면 스레드의 실행을 양보한다.
//			if(work) {
//				System.out.println("ThreadA 작업");
//			}else {
//				Thread.yield();
//			}
//			
//		}
//		System.out.println("ThreadA 종료");
//	}
//}
//
//public class ThreadB extends Thread {
//	public boolean stop = false;
//	public boolean work = true;
//	
//	public void run() {
//		while(!stop) {
////work필드가 true이면 “ThreadB 작업” 출력, 
//			//false이면 스레드의 실행을 양보한다.
//			if(work) {
//				System.out.println("ThreadB 작업");
//			}else {
//				Thread.yield();
//			}
//		}
//		System.out.println("ThreadB 종료");
//	}
//}

//5
//public class T {
//	private int count = 1;
//
//	public synchronized void sub(String n) {
//		for (int i = 0; i < 10; i++)
//			System.out.println(n + ", " + count++);
//	}
//
//	public static void main(String[] args) {
//		T demo = new T();
//		Thread a1 = new A(demo, "a1");
//		Thread a2 = new A(demo, "a2");
//		a1.start();
//		a2.start();
//	}
//}
//
//class A extends Thread {
//	T demo;
//	String name;
//
//	public A(T td, String name) {
//		demo = td;
//		this.name = name;
//	}
//
//	public void run() {
//		demo.sub(name);
//	}
//}

//1
//class A extends Thread {
//	public void run() {
//		int n = 0;
//		while(true) {
//			System.out.println(""+n++);
//			if(n>100) break;
//		}
//	}
//}
//
//class B extends Thread {
//	public void run() {
//		int n = 0;
//		while(true) {
//			System.out.println(""+n++);
//			if(n>100) break;
//		}
//	}
//}
//
//
//public class T {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 Thread t = new Thread(new A());
//		 Thread tt = new Thread(new B());
//		 t.start();
//		 tt.start();
//	}
//
//}
