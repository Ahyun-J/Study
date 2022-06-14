package week01;

public class StudentInfo extends PersonInfo{
	
	String deptName = "Student";
	int stuID = 20210000;

	//������
	public StudentInfo() {
	}
	
	public StudentInfo(String n, int i) {
		this.deptName = n;
		this.stuID = i;
	}
	
	public StudentInfo(String n, int i, String s, int ii) {
		name = n;
		ID = ii;
		this.deptName = s;
		this.stuID = ii;
	}
	
	//�θ��� printPersonInfo �Լ��� ȣ���ϰ�, 
	//�߰��� deptName �� stuID�� ȭ�鿡 ����մϴ�
	
	public void printStudentInfo() {
		super.printPersonInfo(name, ID);
		System.out.println("deptName : "+ this.deptName +"\nstuID : " + this.stuID);
		System.out.println("---------------------------");
	}
	
	public void printStudentInfo(String s, int i) {
		super.printPersonInfo();
		System.out.println("deptName : "+ s +"\nstuID : " + i);
		System.out.println("---------------------------");
	}
	
	public void printStudentInfo(String n, int i, String s, int ii) {
		printPersonInfo(n, i);
		System.out.println("deptName : "+ s +"\nstuID : " + ii);
		System.out.println("---------------------------");
	}
	
}
