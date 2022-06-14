package ani;

import java.util.Queue;

public class animal {
	String name;
	String type;
	int time;

	public animal(String n, int cnt, String ani) {
		this.name = n;
		this.time = cnt;
		this.type = ani;
	}
	
	public void speak() {
		System.out.printf("[Animal speaks] anonymous (animal)");
	}

	public String getName() {
		return this.name;
	}
	
	public int getTimestamp() {
		return this.time;
	}

	
}
