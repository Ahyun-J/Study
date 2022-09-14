package week5;

public class Dog extends Animal{
	
	static int count;
	
	public Dog() {
		name = "Anonymous";
//		count++;
	}

	public Dog(String name) {
		this.name = name;
//		count++;//카운트
	}
	
	public String toString() {
		count++;//카운트 한번에
		return name;
	}
	
	public void sound() {
		System.out.println("멍멍");
	}
	
	public static int getCountDog() {
		return count;
	} // 수 세기
}

//	public void reaction(String ani) {
//		ani = "고양이_꼬리내리고";
//	}
//	
//	public String reaction(String r) {
//		return r = "강아지_꼬리올리고";
//	}


	
//	public static void setCountDog(int count) {
//		Dog.count = count;
//	}
//	
	
