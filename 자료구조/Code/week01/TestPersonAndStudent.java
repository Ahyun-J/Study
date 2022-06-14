package week01;

public class TestPersonAndStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PersonInfo 인스턴스 person과 StudentInfo 인스턴스 student를 각각 1개씩 
		//만드세요. 또한, person.printPersonInfo() 와 
		//student.printStudentInfo()를 각각 호출하세요
	
		PersonInfo person = new PersonInfo();
		StudentInfo student = new StudentInfo();
		
		person.printPersonInfo();
		student.printStudentInfo();
	
		person.printPersonInfo("홍길동", 12345678);
		student.printStudentInfo("조아현", 20215247);
		
		student.printStudentInfo("Ahyun",20021223,"조아현", 20215247);
		
	}

}
