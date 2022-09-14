package week5;

public class Cat extends Animal{
	
	public Cat() {
		name = "Anonymous";
	}

	public Cat(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String toString() { 
		return name;
	}
	//해시코드? 라는 것이 자꾸 출력이 되었는데 인터넷으로
	//찾아보고 이 부분을 추가했더니 실행이 잘 됨 왜인지?

	public void sound() {
		System.out.println("야~옹");
	}
	
}

//	public void reaction(String ani) {
//		ani = "고양이_꼬리내리고";
//	}

//	public String reaction(String r) {
//		return r = "고양이_꼬리내리고";
//	}