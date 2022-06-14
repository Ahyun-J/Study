package week01;

public class PersonInfo {
	
	String name = "Anonymous";
	int ID = 20020000;
	
	//»ý¼ºÀÚ
	public PersonInfo() {
	}
	
	public PersonInfo(String n, int i) {
		this.name = n;
		this.ID = i;
	}
	
	public void printPersonInfo() {
		System.out.println("---------------------------");
		System.out.println("Name : "+ this.name +"\nID : " + this.ID);
		System.out.println("---------------------------");
	}
	
	public void printPersonInfo(String name, int ID) {
		System.out.println("---------------------------");
		System.out.println("Name : "+ name +"\nID : " + ID);
		System.out.println("---------------------------");
	}
	
}
