package week01;

public class TestPersonAndStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PersonInfo �ν��Ͻ� person�� StudentInfo �ν��Ͻ� student�� ���� 1���� 
		//���弼��. ����, person.printPersonInfo() �� 
		//student.printStudentInfo()�� ���� ȣ���ϼ���
	
		PersonInfo person = new PersonInfo();
		StudentInfo student = new StudentInfo();
		
		person.printPersonInfo();
		student.printStudentInfo();
	
		person.printPersonInfo("ȫ�浿", 12345678);
		student.printStudentInfo("������", 20215247);
		
		student.printStudentInfo("Ahyun",20021223,"������", 20215247);
		
	}

}
