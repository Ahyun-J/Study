package week10;

class MyClass { 
	
	public static void main (String args[]) {
		long time1 = System.currentTimeMillis();
		System.out.println("start time = " + time1);
		
		for(int i = 0; i < 10000; i++) {
			System.out.print(".");
		}
		System.out.println("(점이 10000개 출력됩니다.)");
		
		long time2 = System.currentTimeMillis();
		System.out.println("end time = " + time2);
		
		System.out.println("만 번 점을 출력하는 시간 = " + (time2 - time1) + "milli sec");

	}
}