package week07;

public class Cat extends Animal{
	public Cat(String n, int cnt) {
		super(n, cnt, "Cat");
	}
	
	public void speak() {
		System.out.printf("[Cat speaks] %s (Cat)", name);
	}
}
