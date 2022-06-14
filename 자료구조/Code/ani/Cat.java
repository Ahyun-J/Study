package ani;

import java.util.Queue;
import ani.Node;

public class Cat extends animal{

	public Cat(String n, int cnt) {
		super(n, cnt, "Cat");
	}
	
	public void speak() {
		System.out.printf("[Cat speaks] %s (Cat)", name);
	}
	
	public Queue<Cat> getNext() {
		return next;
	}

}
