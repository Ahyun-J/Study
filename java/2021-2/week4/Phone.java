package week4;

public class Phone {
private String who;
	
	public Phone() {
		this("누군가");
	}
	
	public Phone(String w) {
		this.who = w;
	}
	
	public void call(){
		System.out.println(this.who+"통화를 합니다.");
		return;
		
	}

	public String getWho() {
		return this.who;
	}

}
