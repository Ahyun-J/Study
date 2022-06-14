package week07;

public class Dog extends Animal{
	public Dog(String n, int cnt) {
		super(n, cnt, "Dog");
	}

	public void speak() {
		System.out.printf("[Dog speaks] %s (Dog)", name);
	}
}
